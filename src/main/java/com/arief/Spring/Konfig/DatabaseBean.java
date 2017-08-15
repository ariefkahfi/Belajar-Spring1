package com.arief.Spring.Konfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by Arief on 7/16/2017.
 */
@Configuration
public class DatabaseBean {

    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring_relasi",
                "root","qwerty");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }


}
