package com.youngspring.test.beans;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.factory.config.BeanPostProcessor;
import com.youngspring.test.beans.UserService;

public class UserBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("C");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        UserService userService = (UserService) bean;
        userService.setuId("2");
        return bean;
    }

}