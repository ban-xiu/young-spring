package com.youngspring.test;

import com.youngspring.beans.factory.support.DefaultListableBeanFactory;
import com.youngspring.beans.factory.xml.XmlBeanDefinitionReader;
import com.youngspring.context.support.ClassPathXmlApplicationContext;
import com.youngspring.test.beans.UserBeanFactoryPostProcessor;
import com.youngspring.test.beans.UserBeanPostProcessor;
import com.youngspring.test.beans.UserService;
import org.junit.Test;

public class IocTest {
    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:ioc.xml");

        // 3. BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值
        UserBeanFactoryPostProcessor beanFactoryPostProcessor = new UserBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        // 4. Bean实例化之后，修改 Bean 属性信息
        UserBeanPostProcessor beanPostProcessor = new UserBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 5. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ioc.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }


}
