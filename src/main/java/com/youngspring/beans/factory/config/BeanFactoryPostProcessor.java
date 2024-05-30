package com.youngspring.beans.factory.config;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
