package com.cuifei.aop.springbeanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Student1 implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String id;

    private String name;


    private BeanFactory beanFactory;
    private String beanName;


    public Student1(){

        System.out.println("student1 构造方法执行");

    }



    public void init(){

        System.out.println("student1 inti方法执行");
    }


    public void studentDestroy(){

        System.out.println("student1 destroy方法执行");
    }




    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("student1 设置BeanFactory。。。。。。。。。。。。。。");
        this.beanFactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("student1 设置beanName。。。。。。。。。。。。。。");
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("student1 DisposableBean。。。。。。。。。。。。的destroy 方法进行调用");


    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("student1 InitializingBean。。。。。。。。。。。。的afterPropertiesSet 方法进行调用");
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
