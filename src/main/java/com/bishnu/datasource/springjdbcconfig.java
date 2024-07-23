/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bishnu.datasource;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author user
 */
@Configuration
//@ComponentScan("com.bishnu.bean")
public class springjdbcconfig {
    @Bean
    public DataSource mysqlDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/superstore");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
        
    }
    @Bean
    public JdbcTemplate myjdbcTemplate()
    {
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(mysqlDataSource());
        return jdbcTemplate;
    }
    
    
}
