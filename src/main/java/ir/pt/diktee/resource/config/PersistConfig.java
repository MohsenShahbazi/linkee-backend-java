package ir.pt.diktee.resource.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration("dikteePersistConfig")
@EnableTransactionManagement
@EnableJpaRepositories
@EnableJpaAuditing
public class PersistConfig {

    @Autowired
    private Dashboard dashboard;

    @Bean
    DataSource dataSource() {
        try {
            HikariConfig config = new HikariConfig();
            config.setDriverClassName(dashboard.HIBERNATE_DRIVER_CLASS);
            config.setJdbcUrl(dashboard.HIBERNATE_JDBC_URL);
            config.setUsername(dashboard.HIBERNATE_USER);
            config.setPassword(dashboard.HIBERNATE_PASSWORD);
            config.setMaximumPoolSize(dashboard.HIBERNATE_MAX_POOL_SIZE);
            config.setMinimumIdle(dashboard.HIBERNATE_MIN_POOL_SIZE);
            HikariDataSource dataSource = new HikariDataSource(config);
            return dataSource;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(dashboard.HIBERNATE_ENTITY_MANAGER_PACKAGES_TO_SCAN_MAIN_PU.split(","));
        em.setPersistenceUnitName("MePU");
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(jpaHibernateProperties());
        //
        TransactionSynchronizationManager.setActualTransactionActive(true);
        return em;
    }

    private Properties jpaHibernateProperties() {
        Properties properties = new Properties();
        properties.put(dashboard.HIBERNATE_SHOW_SQL, dashboard.HIBERNATE_SHOW_SQL_VALUE);
        properties.put(dashboard.HIBERNATE_FORMAT_SQL, dashboard.HIBERNATE_SQL_FORMAT_VALUE);
        properties.put(dashboard.HIBERNATE_DEFAULT_SCHEMA, dashboard.HIBERNATE_DEFAULT_SCHEMA_VALUE);
        properties.put(dashboard.HIBERNATE_DIALECT, dashboard.HIBERNATE_DIALECT_VALUE);
        properties.put(dashboard.HIBERNATE_HBM2DDL_AUTO, dashboard.HIBERNATE_HBM2DDL_AUTO_VALUE);
        return properties;
    }

}
