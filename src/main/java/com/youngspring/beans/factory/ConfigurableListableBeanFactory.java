package com.youngspring.beans.factory;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.factory.config.AutowireCapableBeanFactory;
import com.youngspring.beans.factory.config.BeanDefinition;
import com.youngspring.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
