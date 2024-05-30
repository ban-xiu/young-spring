package com.youngspring.context.support;

import com.youngspring.beans.factory.support.DefaultListableBeanFactory;
import com.youngspring.beans.factory.xml.XmlBeanDefinitionReader;
import com.youngspring.context.ApplicationContext;

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
