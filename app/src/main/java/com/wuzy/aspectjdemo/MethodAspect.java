package com.wuzy.aspectjdemo;

import android.graphics.Paint;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MethodAspect {
    private static final String TAG = "MethodAspect";

    @Pointcut("call(* com.wuzy.aspectjdemo.Pig.fly(..))")
    public void callMethod() {
    }

    @Before("callMethod()")
    public void beforeMethodCall(JoinPoint joinPoint) {
        Log.e(TAG, "beforeMethodCall: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
    }

    // 合并写法
//    @Before("call(* com.wuzy.aspectjdemo.Pig.fly(**))")
//    public void beforeMethodCall1(JoinPoint joinPoint) {
//        Log.e(TAG, "beforeMethodCall: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }

//    @After("callMethod()")
//    public void afterMethodCall(JoinPoint joinPoint) {
//        Log.e(TAG, "afterMethodCall: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//
//    }

    // Around 不能和 Before、After 一起使用
//    @Around("call(* com.wuzy.aspectjdemo.Pig.fly(..))")
//    public void aroundMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
//        Log.e(TAG, "aroundMethodCall: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//
//        // 执行原代码
//        joinPoint.proceed();
//    }

//
//    @Before("execution(* com.wuzy.aspectjdemo.Pig.fly(..))")
//    public void beforeMethodExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "beforeMethodExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }

//    @After("execution(* com.wuzy.aspectjdemo.Pig.fly(..))")
//    public void afterMethodExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "afterMethodExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }
////
//    @Around("execution(* com.wuzy.aspectjdemo.Pig.fly(..))")
//    public void aroundMethodExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "aroundMethodExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }

    // 不支持 @After、@Around
    @Before("handler(java.lang.ArithmeticException)")
    public void handler() {
        Log.e(TAG, "handler: ");
    }

    @AfterReturning(pointcut = "execution(* com.wuzy.aspectjdemo.Pig.getName(..))", returning = "name")
    public void getName(String name) {
        Log.e(TAG, "getName: " + name);
    }


}
