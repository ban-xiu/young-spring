package com.youngspring.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();

}
