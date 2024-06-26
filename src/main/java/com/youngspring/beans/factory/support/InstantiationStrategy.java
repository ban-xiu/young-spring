package com.youngspring.beans.factory.support;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;


// Bean 实例化策略
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
