package com.youngspring.context.event;

import com.youngspring.context.ApplicationEvent;
import com.youngspring.context.ApplicationListener;


// 事件广播器
public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);

}
