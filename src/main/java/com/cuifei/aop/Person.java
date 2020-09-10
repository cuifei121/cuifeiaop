package com.cuifei.aop;

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



}
