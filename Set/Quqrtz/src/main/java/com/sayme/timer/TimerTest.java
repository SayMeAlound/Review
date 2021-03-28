package com.sayme.timer;
/*
 @user  zhaomo
 @create 2021-03-28-12:25
 @Name   Review  
*/

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *  任务调度室基于绝对时间的,对系统时间敏感
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer t = new Timer();   //任务启动
        for (int i = 0; i < 2; i++) {
            TimerTask task = new FooTimerTask("foo"+i);
            t.scheduleAtFixedRate(task,new Date(),2000);  //任务添加
            // 预设的执行时间 nextExecutTime   12:00:00  12:00:02 12:00:04
            // schedule 真正的执行时间 取决于上一个任务结束时间 ExecutTime 03  05   08  丢任务  (少执行了次数)
            // scheduleAtFixedRate  严格按照预设时间   12:00:00  12:00:02 12:00:04  (执行时间会乱)
            // 单线程  任务阻塞  任务超时    因为种种原因没有按计划执行
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


            //线程池执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
