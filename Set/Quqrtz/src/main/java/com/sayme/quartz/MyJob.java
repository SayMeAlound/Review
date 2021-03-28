package com.sayme.quartz;
/*
 @user  zhaomo
 @create 2021-03-28-13:28
 @Name   Review  
*/

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("MyJob execute"+new Date());
    }
}
