/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bishnu.mapper;

import com.bishnu.bean.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class userMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet rs, int rowCount) throws SQLException
    {
    User user=new User();
    user.setFirstname(rs.getString("fname"));
    user.setLastname(rs.getString("lname"));
    user.setEmail(rs.getString("email"));
    user.setMobile(rs.getString("mobile"));
    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    return user;
    }
    
}
