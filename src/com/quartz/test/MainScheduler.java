package com.quartz.test;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MainScheduler {

	public static void main(String[] args) throws  SchedulerException  {
		JobDetail j = JobBuilder.newJob(MyObjetc.class).build();
		Trigger t = TriggerBuilder.newTrigger().withIdentity("test").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(02).repeatForever()).build();
		Scheduler s = StdSchedulerFactory.getDefaultScheduler();
		s.start();
		s.scheduleJob(j,t);
		
	}

}
