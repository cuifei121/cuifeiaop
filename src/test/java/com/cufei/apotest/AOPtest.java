package com.cufei.apotest;

import com.cuifei.aop.Calculator;
import com.cuifei.aop.CalculatorProxy;
import com.cuifei.aop.MyCalculator;
import com.cuifei.aop.Person;
import com.cuifei.aop.springbeanlife.Student;
import com.cuifei.aop.springbeanlife.Student1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AOPtest {

    @Test
    public void test(){

        Calculator prxoy = CalculatorProxy.prxoy(new MyCalculator());
        Integer add = prxoy.add(1, 1);

        System.out.println(add);

        System.out.println(prxoy.getClass());




    }


    @Test
    public void test1(){
       /* AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext();*/
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("AOP.xml");
        Calculator bean = ac.getBean(Calculator.class);
        Integer add = bean.add(1, 1);
       // Integer sub = bean.sub(1, 0);


        System.out.println(add);
    }



    @Test
    public void test2(){
        /* AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext();*/
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springBeanLife.xml","AOP.xml");
        Student1 bean = (Student1) ac.getBean("student1");
        System.out.println(bean.getId());

        Person bean1 = ac.getBean(Person.class);
        System.out.println(bean1.getId());
        


    }


}
