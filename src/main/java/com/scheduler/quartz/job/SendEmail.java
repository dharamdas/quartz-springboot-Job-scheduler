package com.scheduler.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SendEmail implements Job {

   @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("Sending email... Please wait");
        try{
            Thread.sleep(6000);

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("email sent.......");
    }
}
