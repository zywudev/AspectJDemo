package com.wuzy.aspectjdemo;

import android.graphics.Paint;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ConstructorAspect {

    private static final String TAG = "ConstructorAspect";

//    @Before("execution(com.wuzy.aspectjdemo.Pig.new(..))")
//    public void beforeConstructorExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "beforeConstructorExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }
//
//    @After("execution(com.wuzy.aspectjdemo.Pig.new(..))")
//    public void afterConstructorExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "afterConstructorExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }
//
//    @Around("execution(com.wuzy.aspectjdemo.Pig.new(..))")
//    public void aroundConstructorExecution(JoinPoint joinPoint) {
//        Log.e(TAG, "aroundConstructorExecution: " + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }












}
