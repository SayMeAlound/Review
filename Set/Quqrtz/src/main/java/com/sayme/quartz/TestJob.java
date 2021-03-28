package com.sayme.quartz;/*
 @user  zhaomo
 @create 2021-03-28-14:36
 @Name   Review  
*/

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class TestJob {
    public static void main(String[] args) {
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                .withIdentity("job1","group1")
                .build();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","trigger1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1)
                .repeatForever())
                .build();

        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
