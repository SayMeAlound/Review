package com.sayme.timer;
/*
 @user  zhaomo
 @create 2021-05-23-10:51
 @Name   Review  
*/

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerTest2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        /*for (int i = 0; i < 100; i++) {
            int finalI = i;
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(finalI);
                    if (finalI == 20){
                        throw new RuntimeException();
                    }
                }
            },1000L);
        }*/


        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(finalI);
                    if (finalI == 20){
                        throw new RuntimeException();
                    }
                }
            },1, TimeUnit.SECONDS);
        }
    }
}
