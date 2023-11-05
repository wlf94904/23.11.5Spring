package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author hhm
 * @version 1.0
 */
public class UserServiceImpl implements UserService{

//    //注入List
//    private List<String> stringList;
//    //注意：一定要提供set方法，因为注入就是通过set方法注入的
//
//    private List<UserDao> userDaoList;
//
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//
//    }
//
//    private Set<String> strSet;
//    public void setStringSet(Set<String> stringSet) {
//        this.strSet = strSet;
//    }
//
//    private Set<UserDao> userDaoSet;
//    public void setUserDaoSet(Set<UserDao> userDaoSet) {
//        this.userDaoSet = userDaoSet;
//    }
//
//    public void setStringList(List<String> stringList) {
//        this.stringList = stringList;
//    }
//
//    private Map<String,UserDao> map;
//    public void setMap(Map<String, UserDao> map) {
//        this.map = map;
//    }
//
//    private Properties properties;
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//
//    public void show(){
////        System.out.println(stringList);
////        System.out.println(userDaoList);
////        System.out.println(userDaoSet);
////        System.out.println(strSet);
//        System.out.println(map);
//        System.out.println(properties);
//    }

    public void show(){
        System.out.println(userDao);
    }
    private UserDao userDao;

    //提供Set方法，然后对应的Bean工厂在底层操作时才能调用Set方法，把Dao给你
    //BeanFactory去调用该方法，然后从容器中（Bean工厂中）获取userDao设置到此处
    public void setUserDao(UserDao userDao){
//        System.out.println("BeanFactory去调用该方法获取userDao设置到此处:"+userDao);
//        System.out.println("属性设置完毕...");
        this.userDao=userDao;
    }

//    @Override
//    //在属性设置之后执行
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet执行...");
//    }
}
