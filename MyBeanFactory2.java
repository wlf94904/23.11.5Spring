package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author hhm
 * @version 1.0
 */
public class MyBeanFactory2 {

    public UserDao userDao(String username){
        //Bean创建前可以做一些其他的业务逻辑操作
        return new UserDaoImpl();
    }
}
