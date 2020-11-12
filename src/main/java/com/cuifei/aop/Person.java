package com.cuifei.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {

    private String Id;

    private String age;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long time = new Date().getTime();

        long tm= time/1000;

        System.out.println((int)tm);


        System.out.println("");


        System.out.println(time);

        String format = sdf.format(time);
        System.out.println(format);


        Date parse = sdf.parse(format);
        System.out.println(parse.getTime());



        int a = (int)time;
        System.out.println(Integer.MAX_VALUE);




    }

}
