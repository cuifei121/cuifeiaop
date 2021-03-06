package com.cuifei.aop.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestCglib {

    public static void main(String[] args) {

            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"C:\\Users\\Administrator\\Desktop\\cglibCode");

        Enhancer enhancer = new Enhancer();

        SellWineProxy sellWineProxy = new SellWineProxy(new SellWine(),enhancer);

        sellWineProxy.createProxy();


        // 4. 创建被代理的对象
        SellWine person = (SellWine) enhancer.create();
        person.sellWine();




    }
}
