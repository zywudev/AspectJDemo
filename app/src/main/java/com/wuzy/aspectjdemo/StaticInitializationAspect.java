package com.wuzy.aspectjdemo;


import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StaticInitializationAspect {

    private static final String TAG = "StaticAspect";

//    @Before("staticinitialization(com.wuzy.aspectjdemo.Pig)")
//    public void beforeStaticInitialization(JoinPoint joinPoint) {
//        Log.e(TAG, "beforeStaticInitialization: " );
//    }

}
