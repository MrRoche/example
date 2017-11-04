package edu.demo.service.interceptor;

import org.evergreen.aop.InvocationContext;
import org.evergreen.aop.annotation.Around;

public class ServiceInterceptor {

    @Around
    public Object around(InvocationContext ic) throws Throwable {
        System.out.println("before...");
        Object obj = ic.proceed();
        System.out.println("after...");
        return obj;
    }
}
