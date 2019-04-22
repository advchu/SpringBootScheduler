package com.example.demo.Task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component()
public class AppleTaskScheduler {
	
	
	//@Scheduled(fixedDelay=8000) Every 8 Second run the jobs
	//@Scheduled (cron="0 0 * * * *") // the top of every Hour of every days 
	//@Scheduled (cron="*/10 * * * * *") // Every For 10 Second 
	//@Scheduled (cron="0 0 8-10 * * *")  // * , 9 and 10 oclock every Day
	//@Scheduled (cron="0 0 6,19 * * *") // 6:00 Am and &:PM every Days 
	@Scheduled (cron="0 0/30 8-19 * * *") // 8:00, 8:30, 9:00,10:00 .................17:30,18:00,18:30,19:00 every days
	//@Scheduled (cron="0 0 9-17 * * MON-FRI") // on the houre nine to five week days 
	//@Scheduled (cron="0 0 0 25 12 ?") // Every Christmas day at Midnight
	public void abc() {
		System.out.println("*********Schedule **************");
	}
	
}
