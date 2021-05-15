package ir.pt.diktee.resource.config;

import ir.pt.util.Crypto;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dashboard {


    public Dashboard() {
        Map<String, String> resourceMap = new HashMap();
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:config.txt");
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.equals("") && !line.startsWith("#")) {
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
            cryptoUtil.SetPassword("mobileResourceIR.PT");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.LANGUAGE = cryptoUtil.decrypt(resourceMap.get("LANGUAGE"));
        this.COUNTRY = cryptoUtil.decrypt(resourceMap.get("COUNTRY"));
        this.PASSWORD = cryptoUtil.decrypt(resourceMap.get("PASSWORD"));
        this.INTERNAL_SERVER_ERROR_KEY = cryptoUtil.decrypt(resourceMap.get("INTERNAL_SERVER_ERROR_KEY"));
        this.USERNAME = cryptoUtil.decrypt(resourceMap.get("USERNAME"));
        this.MENU_LIST_URL = cryptoUtil.decrypt(resourceMap.get("MENU_LIST_URL"));
        this.APPLICATION_LIST_URL = cryptoUtil.decrypt(resourceMap.get("APPLICATION_LIST_URL"));
        this.ROLE_LIST_URL = cryptoUtil.decrypt(resourceMap.get("ROLE_LIST_URL"));
        this.USER_LIST_URL = cryptoUtil.decrypt(resourceMap.get("USER_LIST_URL"));
        this.HIBERNATE_DEFAULT_SCHEMA = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DEFAULT_SCHEMA"));
        this.HIBERNATE_DEFAULT_SCHEMA_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DEFAULT_SCHEMA_VALUE"));
        this.HIBERNATE_DIALECT = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DIALECT"));
        this.HIBERNATE_DIALECT_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DIALECT_VALUE"));
        this.HIBERNATE_DRIVER_CLASS = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DRIVER_CLASS"));
        this.HIBERNATE_ENTITY_MANAGER_PACKAGES_TO_SCAN_MAIN_PU= cryptoUtil.decrypt(resourceMap.get("HIBERNATE_ENTITY_MANAGER_PACKAGES_TO_SCAN_MAIN_PU"));
        this.HIBERNATE_HBM2DDL_AUTO_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_HBM2DDL_AUTO_VALUE"));
        this.HIBERNATE_FORMAT_SQL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_FORMAT_SQL"));
        this.HIBERNATE_HBM2DDL_AUTO = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_HBM2DDL_AUTO"));
        this.HIBERNATE_JDBC_URL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_JDBC_URL"));
        this.HIBERNATE_MAX_STATEMENTS = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MAX_STATEMENTS")));
        this.HIBERNATE_MAX_POOL_SIZE = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MAX_POOL_SIZE")));
        this.HIBERNATE_MIN_POOL_SIZE = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MIN_POOL_SIZE")));
        this.HIBERNATE_SHOW_SQL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SHOW_SQL"));
        this.HIBERNATE_USER = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_USER"));
        this.HIBERNATE_SQL_FORMAT_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SQL_FORMAT_VALUE"));
        this.HIBERNATE_PASSWORD = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_PASSWORD"));
        this.HIBERNATE_JDBC_URL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_JDBC_URL"));
        this.HIBERNATE_SHOW_SQL_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SHOW_SQL_VALUE"));
        this.GSM_URL = cryptoUtil.decrypt(resourceMap.get("GSM_URL"));
        this.GSM_USER = cryptoUtil.decrypt(resourceMap.get("GSM_USER"));
        this.GSM_PASSWORD = cryptoUtil.decrypt(resourceMap.get("GSM_PASSWORD"));
        this.TEMP_DIR = cryptoUtil.decrypt(resourceMap.get("TEMP_DIR"));
        this.DEVELOP_MODE = cryptoUtil.decrypt(resourceMap.get("DEVELOP_MODE"));
        this.TASK_CORE_POOL_SIZE= cryptoUtil.decrypt(resourceMap.get("TASK_CORE_POOL_SIZE"));
        this.TASK_POOL_SIZE= cryptoUtil.decrypt(resourceMap.get("TASK_POOL_SIZE"));
        this.TASK_QUEUE_CAPACITY= cryptoUtil.decrypt(resourceMap.get("TASK_QUEUE_CAPACITY"));

    }

    ///////////////////////////// APP CONFIG ////////////////////////////
    public String LANGUAGE;
    public String COUNTRY;
    public String INTERNAL_SERVER_ERROR_KEY;

    /////////////////////// authentication /////////////////////////////
    public String MENU_LIST_URL;
    public String APPLICATION_LIST_URL;
    public String ROLE_LIST_URL;
    public String USER_LIST_URL;
    public String USERNAME;
    public String PASSWORD;

    ////////////////////// Oracle database cofiguration ///////////////////////
    public String HIBERNATE_DIALECT;
    public String HIBERNATE_DIALECT_VALUE;
    public String HIBERNATE_SHOW_SQL;
    public String HIBERNATE_FORMAT_SQL;
    public String HIBERNATE_SHOW_SQL_VALUE;
    public String HIBERNATE_SQL_FORMAT_VALUE;
    public String HIBERNATE_ENTITY_MANAGER_PACKAGES_TO_SCAN_MAIN_PU;
    public String HIBERNATE_HBM2DDL_AUTO_VALUE;
    public String HIBERNATE_DEFAULT_SCHEMA;
    public String HIBERNATE_DEFAULT_SCHEMA_VALUE;
    public String HIBERNATE_HBM2DDL_AUTO;
    public Integer HIBERNATE_MAX_POOL_SIZE;
    public Integer HIBERNATE_MAX_STATEMENTS;
    public Integer HIBERNATE_MIN_POOL_SIZE;
    public String HIBERNATE_DRIVER_CLASS;
    public String HIBERNATE_USER;
    public String HIBERNATE_PASSWORD;
    public String HIBERNATE_JDBC_URL;
    ////GSM
    public String GSM_URL;
    public String GSM_USER;
    public String GSM_PASSWORD;

    public String TEMP_DIR;
    public String DEVELOP_MODE;
    public String TASK_CORE_POOL_SIZE;
    public String TASK_POOL_SIZE;
    public String TASK_QUEUE_CAPACITY;
    ///////////authorize
    public String BASE_INFO_URL;
}



