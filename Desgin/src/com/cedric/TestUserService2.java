package com.cedric;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Logger;

public class TestUserService2
{
     public static void main(String[] args)
    {
//        UserService user = new UserServiceImpl();
//        MyHandler hand = new MyHandler(user);
//        UserService proxy = (UserService)Proxy.newProxyInstance(TestUserService2.class.getClassLoader(), user.getClass().getInterfaces(), hand);
//        proxy.logIn();
//        proxy.signUp();
         CarService car = new CarServiceImpl();
         MyHandler hand = new MyHandler(car);
         CarService proxy = (CarService)Proxy.newProxyInstance(TestUserService2.class.getClassLoader(), car.getClass().getInterfaces(), hand);
         int num = proxy.eat("apple");
         System.out.println(num);
    }
     
}

class MyHandler implements InvocationHandler{

    private Object target;
    private static Logger log = Logger.getRootLogger();

    public MyHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        log.info("before "+method.getName());
        Object temp = method.invoke(target, args);
        log.info("after "+method.getName());
        return temp;
    }
    
}

