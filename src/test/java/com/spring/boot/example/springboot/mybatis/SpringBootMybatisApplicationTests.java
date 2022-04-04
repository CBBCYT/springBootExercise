package com.spring.boot.example.springboot.mybatis;

import com.spring.boot.example.springboot.mybatis.dao.User;
import com.spring.boot.example.springboot.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest
//使其运行在spring环境中进行测试.
//@RunWith如果没有，需要添加Junit依赖，解决方法参考下述
@RunWith(SpringJUnit4ClassRunner.class)
class SpringBootMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

//    @Test
//    void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from user");
//
//        while(resultSet.next()){
//            int id = resultSet.getInt(1);
//            String name = resultSet.getString(2);
//            String address = resultSet.getString(3);
//            System.out.println("id:" + id + " name:" + name + " address:" + address);
//        }
//    }

    @Test void testUserMapper(){

    }

}