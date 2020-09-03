package com.cuifei.aop;

import org.springframework.stereotype.Service;

@Service
public class MyCalculator implements Calculator {

    @Override
    public Integer add(Integer a, Integer b) {
        Integer result=0;
        try {

             result =   a+b;


        }catch (Exception e){




        }finally {



        }

        return result;
    }

    @Override
    public Integer min(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer mlt(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {

        Integer result=0;
        try {

            System.out.println("sub 之前");

            result =   a / b;

            System.out.println("sub 之后");
            System.out.println("---------------------------------will return");

            return result;
        }catch (Exception e){
            System.out.println("我是异常");





        }finally {

            System.out.println("我是finally 我要执行啦");

        }


        return result;
    }
}
