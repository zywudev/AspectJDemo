package com.wuzy.aspectjdemo;

import android.util.Log;

public class Pig {
    private static final String TAG = "Pig";

    static {
        Log.e(TAG, "static initializer: " );
    }

    private int age;

    public Pig() {
        this.age = 100;
    }

    public void fly() {
        Log.e(TAG, "pig fly");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Log.e(TAG, "setAge: " );
        this.age = age;
    }

    public void hurt() {
        try {
            int i = 4 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return "Peppa";
    }


}
