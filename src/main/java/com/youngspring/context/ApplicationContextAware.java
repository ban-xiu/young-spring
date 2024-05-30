package com.youngspring.context;

import com.youngspring.beans.BeansException;
import com.youngspring.beans.factory.Aware;


// 实现此接口，既能感知到所属的 ApplicationContext
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
    