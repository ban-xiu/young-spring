package com.youngspring.beans.factory.config;

import com.youngspring.beans.factory.HierarchicalBeanFactory;
import com.youngspring.beans.factory.BeanFactory;


public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);


    // 销毁单例对象
    void destroySingletons();

}
