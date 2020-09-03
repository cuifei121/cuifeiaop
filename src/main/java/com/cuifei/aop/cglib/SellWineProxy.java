package com.cuifei.aop.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SellWineProxy {


    private Object obj;
    private Enhancer enhancer;

    public SellWineProxy(Object sellWine,Enhancer enhancer){
        this.obj = sellWine;
        System.out.println(obj.getClass());

        this.enhancer = enhancer;
    }

    public void createProxy(){

        // 1. 创建Enhancer对象
        // 2. 指定父类Class对象
        enhancer.setSuperclass(obj.getClass());

        // 3. 设置方法拦截回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {

                System.out.println("卖酒之前呀");

                Object result = proxy.invokeSuper(object, args);

                System.out.println("卖酒之后呀");

                return result;
            }
        });



    }


}
