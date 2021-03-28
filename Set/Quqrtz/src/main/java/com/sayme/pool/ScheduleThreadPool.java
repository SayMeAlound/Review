package com.sayme.pool;/*
 @user  zhaomo
 @create 2021-03-28-12:56
 @Name   Review  
*/

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 2; i++) {
            scheduledThreadPool.scheduleAtFixedRate(new Task("task"+i),0, 2,TimeUnit.SECONDS);
        }
    }

}

class Task implements Runnable{
    private  String name;

    public Task(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            System.out.println("name +"+name+",startTime=" +new Date());
            Thread.sleep(3000);
            System.out.println("name +"+name+",endTime=" +new Date());


            //线程池执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}