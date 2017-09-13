package com.example.buglytest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by hasee on 2017/9/13.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    MyCaughtException.getInstance().init(this);

        //腾讯bugly初始化, 本质上腾讯的bugly核心类就是一个自定义的 MyCaughtException
        CrashReport.initCrashReport(getApplicationContext(), "6bfb60be17", BuildConfig.DEBUG);
    }
}

