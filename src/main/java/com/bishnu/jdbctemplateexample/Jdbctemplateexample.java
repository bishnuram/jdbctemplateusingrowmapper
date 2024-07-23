/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bishnu.jdbctemplateexample;

import com.bishnu.bean.User;
import com.bishnu.datasource.springjdbcconfig;
import com.bishnu.mapper.userMapper;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 *
 * @author user
 */
public class Jdbctemplateexample {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(springjdbcconfig.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        System.out.println("Hello World!");
        String sql="select * from usertable";
        List<User> list_user=jdbcTemplate.query(sql,new userMapper());
        System.out.println("FirstName   lastname  email mobile username password");
                for(User user:list_user)
                {
                    System.out.print(user.getFirstname());
                    System.out.print(user.getLastname());
                    System.out.print(user.getEmail());
                    System.out.print(user.getMobile());
                    System.out.print(user.getUsername());
                    System.out.print(user.getPassword());
                    System.out.println();
                    
                }
        
    
}}
