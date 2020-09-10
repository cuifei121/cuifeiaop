package com.cuifei.aop.springbeanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Student implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String id;

    private String name;


    private BeanFactory beanFactory;
    private String beanName;


    public Student(){

        System.out.println("student 构造方法执行");

    }



    public void init(){

        System.out.println("student inti方法执行");
    }


    public void studentDestroy(){

        System.out.println("student destroy方法执行");
    }




    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("设置BeanFactory。。。。。。。。。。。。。。");
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("设置beanName。。。。。。。。。。。。。。");
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("DisposableBean。。。。。。。。。。。。的destroy 方法进行调用");


    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean。。。。。。。。。。。。的afterPropertiesSet 方法进行调用");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}