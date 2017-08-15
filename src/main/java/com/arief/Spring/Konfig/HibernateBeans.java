package com.arief.Spring.Konfig;

import com.arief.Spring.Entity.Pegawai;
import com.arief.Spring.Entity.Ruang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

/**
 * Created by Arief on 7/16/2017.
 */
@Configuration
@Import(DatabaseBean.class)
public class HibernateBeans {


    @Bean
    public Properties hibernateProperties(){
        Properties properties =new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL57Dialect");
        return properties;
    }

    @Bean
    public Class<?>[] entityClass(){
        return new Class<?>[]{Pegawai.class,Ruang.class};
    }

    @Bean
    @Autowired
    public LocalSessionFactoryBean sessionFactoryBean (Properties hibernateProperties , Class<?>[] classes, DriverManagerDataSource dataSource){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setHibernateProperties(hibernateProperties);
        sessionFactoryBean.setAnnotatedClasses(classes);
        return sessionFactoryBean;
    }
}
