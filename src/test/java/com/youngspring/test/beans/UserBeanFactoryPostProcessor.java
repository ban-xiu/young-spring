package com.youngspring.test.beans;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.PropertyValue;
import com.youngspring.beans.PropertyValues;
import com.youngspring.beans.factory.ConfigurableListableBeanFactory;
import com.youngspring.beans.factory.config.BeanDefinition;
import com.youngspring.beans.factory.config.BeanFactoryPostProcessor;

public class UserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "D"));
    }

}