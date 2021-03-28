package com.sayme.timer;
/*
 @user  zhaomo
 @create 2021-03-28-12:25
 @Name   Review  
*/

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer t = new Timer();   //任务启动
        for (int i = 0; i < 2; i++) {
            TimerTask task = new FooTimerTask("foo"+i);
            t.schedule(task,new Date(),2000);  //任务添加
        }
    }
}

class FooTimerTask extends TimerTask{
    private  String name;

    public FooTimerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("name +"+name+",startTime=" +new Date());
            Thread.sleep(3000);
            System.out.println("name +"+name+",endTime=" +new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
