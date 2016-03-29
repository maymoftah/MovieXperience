package com.moviexperience.config;

import static com.moviexperience.constants.ConstantConfigs.*;

import java.util.Properties;
import javax.sql.DataSource;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.PlatformTransactionManager;
import org.dozer.DozerBeanMapper;



@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {PACKAGE_REPO})
@ComponentScan(PACKAGE_SERVICE)
@PropertySource(value = "classpath: " + PROPERTIES_FILE)

public class JPAConfigs {

    @Autowired
    private Environment environment;

    @Bean(name= "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource src = new DriverManagerDataSource();

        src.setDriverClassName(environment.getProperty(DRIVER_CLASS));
        src.setPassword(environment.getProperty(DB_PWD));
        src.setUrl(environment.getProperty(DB_URL));
        src.setUsername(environment.getProperty(DB_USER));

        return src;
    }

    @Bean(name="entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {

        LocalContainerEntityManagerFactoryBean factBean = new LocalContainerEntityManagerFactoryBean();
        factBean.setDataSource(dataSource());
        factBean.setPackagesToScan(new String[] {PACKAGE_REPO, PACKAGE_MODEL});

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(true);
        factBean.setJpaVendorAdapter(vendorAdapter);

        Properties JPAProperties = new Properties();
        setJPAPropertiesVals(JPAProperties);

        return factBean;

    }


    private void setJPAPropertiesVals(Properties JPAProperties) {

        JPAProperties.put(HIBERNATE_DIALECT,environment.getProperty(HIBERNATE_DIALECT));

        JPAProperties.put(HIBERNATE_DDL, environment.getProperty(HIBERNATE_DDL));

        JPAProperties.put(HIBERNATE_SHOW_SQL, environment.getProperty(HIBERNATE_SHOW_SQL));

        JPAProperties.put(HIBERNATE_AUTOCOMMIT, environment.getProperty(HIBERNATE_AUTOCOMMIT));
    }

    @Bean
    public PlatformTransactionManager transactionManager (LocalContainerEntityManagerFactoryBean eManFactory) {
        EntityManagerFactory factory = entityManagerFactoryBean().getObject();

        return new JpaTransactionManager(factory);
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslate() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    public DozerBeanMapper getMapper() {
        return new DozerBeanMapper();
    }

}

