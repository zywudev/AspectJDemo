package com.wuzy.aspectjdemo;

import android.content.Intent;
import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class FieldAspect {

    private static final String TAG = "FieldAspect";

//    @Around("get(int com.wuzy.aspectjdemo.Pig.age)")
//    public int aroundFieldGet(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object obj = joinPoint.proceed();
//        int age = Integer.parseInt(obj.toString());
//        Log.e(TAG, "age: " + age);
//        return 10;
//    }
//
//    @Around("set(int com.wuzy.aspectjdemo.Pig.age)")
//    public void aroundFieldSet(ProceedingJoinPoint joinPoint) throws Throwable {
//        Log.e(TAG, "around->" + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }

//    @Around("set(int com.wuzy.aspectjdemo.Pig.age) && !withincode(com.wuzy.aspectjdemo.Pig.new(..))")
//    public void aroundFieldSet1(ProceedingJoinPoint joinPoint) {
//        Log.e(TAG, "around11->" + joinPoint.getTarget().toString() + "#" + joinPoint.getSignature().getName());
//    }



}
