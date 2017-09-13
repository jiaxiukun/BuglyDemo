package com.example.buglytest;

import android.content.Context;

/**
 * Created by hasee on 2017/9/13.
 *
 * 自定义一个全局异常捕获机制
 */

public class MyCaughtException implements Thread.UncaughtExceptionHandler {


    static MyCaughtException myCaughtException = new MyCaughtException();
    Context context;

    private MyCaughtException() {
    }

    public static MyCaughtException getInstance() {
        return myCaughtException;
    }


    //// TODO: 2017/9/13  需要再applicatiion初始化这个方法
    public void init(Context context) {
        this.context = context;

        //将系统默认处理异常的类设置成我们的当前类
        Thread.setDefaultUncaughtExceptionHandler(this);
    }


    //捕获到异常之后,会回调我们这个方法,我们在这,可以 获取设备信息,获取错误信息,
    //可以将信息存到本地,也可以存到服务器
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

        //// TODO: 2017/9/13 拿信息

        //// TODO: 2017/9/13 将信息存到本地,或者上传到服务器
    }
}
