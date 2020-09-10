package com.cuifei.aop.springbeanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    public MyInstantiationAwareBeanPostProcessor() {
        System.out.println("MyInstantiationAwareBeanPostProcessor....的构造执行了");

    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        System.out.println("MyInstantiationAwareBeanPostProcessor ............................postProcessBeforeInstantiation调用");


        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        System.out.println("MyInstantiationAwareBeanPostProcessor ............................postProcessAfterInstantiation调用");

        return false;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {

        System.out.println("MyInstantiationAwareBeanPostProcessor ............................postProcessAfterInstantiation调用");

        return null;
    }
}
