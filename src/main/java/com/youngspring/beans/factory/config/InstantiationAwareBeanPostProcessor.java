package com.youngspring.beans.factory.config;

import com.youngspring.beans.BeansException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    // 在 Bean 对象执行初始化方法之前，执行此方法
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
