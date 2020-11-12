package com.cuifei.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtil {


    @Before("execution(* com.cuifei..Calculator.*(..))")
    public void bforeAOP(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println("before addAOP  方法为---------------->"+signature);
        System.out.println("参数名称为-------------》"+ Arrays.asList(args));
    }

    @After("execution(* com.cuifei..Calculator.*(..))")
    public void afterAOP(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println("after addAOP  方法为---------------->"+signature);

    }


    @AfterReturning("execution(* com.cuifei..Calculator.*(..))")
    public void AfterReturningAOP(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println("AfterReturning addAOP  方法为---------------->"+signature);

    }

    @AfterThrowing("execution(* com.cuifei..Calculator.*(..))")
    public void AfterThrowingAOP(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        System.out.println("AfterThrowing addAOP  方法为---------------->"+signature);

    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("AOP.xml");
    }

}
