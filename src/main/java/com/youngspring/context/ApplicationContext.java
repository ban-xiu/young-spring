package com.youngspring.context;

import com.youngspring.beans.factory.HierarchicalBeanFactory;
import com.youngspring.beans.factory.ListableBeanFactory;
import com.youngspring.core.io.ResourceLoader;

// 应用上下文
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
