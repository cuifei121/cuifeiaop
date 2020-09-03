package com.cuifei.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {

    public static <T> T prxoy(final Object calculator){


        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(calculator, args);
                return invoke;
            }
        };

        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);

         return (T) o;

    }


}
