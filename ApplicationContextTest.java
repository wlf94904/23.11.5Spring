package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * @author hhm
 * @version 1.0
 */
public class ApplicationContextTest {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Object connection = applicationContext.getBean("connection");
        System.out.println(connection);

        //============================================================================


//        //第一步加载驱动
//        Class.forName("com.mysql.jdbc.Driver");//静态工厂方式
//        //第二步获得connection
//        Connection connection = DriverManager.getConnection("", "", "");



//        DruidDataSource dataSourse=new DruidDataSource();
//        dataSourse.setDriverClassName();//驱动名称
//        dataSourse.setUrl();//数据库地址
//        dataSourse.setUserName();//数据库用户名
//        dataSourse.setPassword();//数据库密码

        


    }
}
