package com.itheima.test;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author hhm
 * @version 1.0
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        //1.创建工厂对象
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();


        //2.创建一个读取器(读取xml文件）
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);

        //3.读取配置文件给工厂
        //使用reader去加载BeanDefinitions，加载时，要把配置文件是谁告诉他(在括号里的操作)
        reader.loadBeanDefinitions("beans.xml");

        //4.根据id获取Bean实例对象
        //通过工厂去获得Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        //System.out.println(userService);//打印地址，如果不为空，则说明工厂已经帮忙产生了Bean了

        //UserDao userDao=(UserDao) beanFactory.getBean("userDao");//强制转换类型
        //System.out.println(userDao);//打印地址，如果不为空，则说明工厂已经帮忙产生了Bean了

        //创建对象的步骤
        //先编写对应的类，然后配配置文件，最后修改客户端代码去获取对应的Bean




    }
}
