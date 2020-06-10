package com.wuzy.aspectjdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.method).setOnClickListener(this);
        findViewById(R.id.constructor).setOnClickListener(this);
        findViewById(R.id.field).setOnClickListener(this);
        findViewById(R.id.camera).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.method:
                Pig pig = new Pig();
                pig.fly();
                pig.hurt();
                pig.getName();
                break;
            case R.id.constructor:
                Pig pig1 = new Pig();
                break;
            case R.id.field:
                Pig pig2 = new Pig();
                pig2.setAge(100);
                int age = pig2.getAge();
                Log.e(TAG, "age: " + age);
                break;
            case R.id.camera:
                break;
        }
    }
}