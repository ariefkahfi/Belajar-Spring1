package com.arief.Spring.Konfig;

import com.arief.Spring.Services.PegawaiDAO;
import com.arief.Spring.Services.PegawaiImplDAO;
import com.arief.Spring.Services.RuangDAO;
import com.arief.Spring.Services.RuangImplDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Arief on 7/16/2017.
 */

@Configuration
@Import(HibernateBeans.class)
@ComponentScan("com.arief.Spring.Services")
@EnableTransactionManagement
public class MainBeans {

    @Bean
    @Autowired
    public PegawaiDAO pegawaiDAO(SessionFactory sessionFactory){
        return new PegawaiImplDAO(sessionFactory);
    }

    @Bean
    @Autowired
    public RuangDAO ruangDAO(SessionFactory sessionFactory){
        return new RuangImplDAO(sessionFactory);
    }


    @Bean
    @Autowired
    public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
        return transactionManager;
    }
}
