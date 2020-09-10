package com.cuifei.aop.springbeanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor 的构造执行了");


    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {


        System.out.println("MyBeanPostProcessor....................postProcessBeforeInitialization调用");


        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("MyBeanPostProcessor....................postProcessAfterInitialization");

        return null;
    }
}
