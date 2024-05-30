package com.youngspring.context.event;

import com.youngspring.context.ApplicationContext;
import com.youngspring.context.ApplicationEvent;


public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
