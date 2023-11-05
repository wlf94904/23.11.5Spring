package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author hhm
 * @version 1.0
 */
public class MyBeanFactory3 implements FactoryBean<UserDao> {


    @Override
    public UserDao getObject() throws Exception {
        System.out.println("getObject()被调用...");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {//返回Bean的类型是什么
        return UserDao.class;
    }
}
