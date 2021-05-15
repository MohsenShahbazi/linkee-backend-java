package ir.pt.diktee.resource.config;

import ir.pt.core.JPresent;
import ir.pt.core.bundles.JMessageInterpolator;
import ir.pt.core.bundles.JResourceBundleLocator;
import ir.pt.core.jvalidation.JRestErrorHandler;
import ir.pt.util.Crypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

@Configuration("dikteeAppConfig")
public class AppConfig {
    @Bean
    Locale locale() {
        return new Locale(dashboard().LANGUAGE, dashboard().COUNTRY);
    }

    @Autowired
    private ResourceLoader resourceLoader;

  @Bean(name = "resourceBundle")
    public ResourceBundle resourceBundle() {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale());
            return resourceBundle;
        } catch (MissingResourceException ex) {
            ex.getMessage();
            return null;
        }
    }

    @Bean(name = "dashboard")
    @Order(Ordered.HIGHEST_PRECEDENCE)
    Dashboard dashboard() {
        Map<String, String> resourceMap = new HashMap();
        Resource resource = resourceLoader.getResource("classpath:config.txt");
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.equals("")) {
                    String a[] = line.split("=", 2);
                    resourceMap.put(a[0], a[1]);
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Crypto cryptoUtil = new Crypto();
        try {
            cryptoUtil.SetPassword("reportgenerator");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Dashboard dashboard = new Dashboard();
        dashboard.LANGUAGE = cryptoUtil.decrypt(resourceMap.get("LANGUAGE"));
        dashboard.INTERNAL_SERVER_ERROR_KEY = cryptoUtil.decrypt(resourceMap.get("INTERNAL_SERVER_ERROR_KEY"));
        dashboard.USERNAME = cryptoUtil.decrypt(resourceMap.get("USERNAME"));
        dashboard.MENU_LIST_URL = cryptoUtil.decrypt(resourceMap.get("MENU_LIST_URL"));
        dashboard.BASE_INFO_URL = cryptoUtil.decrypt(resourceMap.get("BASE_INFO_URL"));
        return dashboard;
    }

    @Bean()
    public JPresent jPresent() {
        return new JPresent(messageInterpolator(), locale());
    }

    @Bean
    public JMessageInterpolator messageInterpolator() {
        return new JMessageInterpolator(new JResourceBundleLocator(resourceBundle()), locale());
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver commonsMultipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
//    <!-- the maximum file size in bytes = 10MB 10,485,760-->
//    <!-- the maximum file size in bytes = 1MB 1,048,576-->
        commonsMultipartResolver.setMaxUploadSize(10485760);
        return commonsMultipartResolver;
    }

    @Bean
    JRestErrorHandler jRestErrorHandler() {
        return new JRestErrorHandler(messageInterpolator(), locale());
    }



    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setMessageInterpolator(messageInterpolator());
        return validator;
    }

    @Bean
    public SessionLocaleResolver localeResolver() {
        SessionLocaleResolver s = new SessionLocaleResolver();
        s.setDefaultLocale(locale());
        return s;
    }

}
