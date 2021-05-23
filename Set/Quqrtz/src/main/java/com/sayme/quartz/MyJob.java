package com.sayme.quartz;
/*
 @user  zhaomo
 @create 2021-03-28-13:28
 @Name   Review  
*/

import org.quartz.*;

import java.util.Date;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class MyJob implements Job {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
//        JobDataMap jobDetailMap = context.getJobDetail().getJobDataMap();
//
//
//        JobDataMap triggerMap = context.getTrigger().getJobDataMap();
//        JobDataMap mergeMap = context.getMergedJobDataMap();
//        System.out.println("jobDetailMap: "+jobDetailMap.getString("job"));
//        System.out.println("triggerMap: "+triggerMap.getString("trigger"));
//        System.out.println("mergeMap: "+mergeMap.getString("trigger"));
//
//
//        System.out.println("name: "+name);

//        System.out.println("jobDetail: "+System.identityHashCode(context.getJobDetail()));
//        System.out.println("job: "+System.identityHashCode(context.getJobInstance()));

//        System.out.println("execute: "+new Date());
//        try {
//            Thread.sleep(3000);   //不管你睡眠    多线程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        JobDataMap triggerMap = context.getTrigger().getJobDataMap();
        triggerMap.put("count", triggerMap.getInt("count") + 1);
        System.out.println("triggerMap count: " + triggerMap.getInt("count"));

        JobDataMap jobDetailMap = context.getJobDetail().getJobDataMap();
        jobDetailMap.put("count", jobDetailMap.getInt("count") + 1);
        System.out.println("triggerMap count: " + jobDetailMap.getInt("count"));
    }
}
