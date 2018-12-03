package com.quartz.test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyObjetc implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	 
		System.out.println(" vladimir ceballos Runing !!!");
		System.out.println(" the time now is "+ new Date());
		
	}

}
