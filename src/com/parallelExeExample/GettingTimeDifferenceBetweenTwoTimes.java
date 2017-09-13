package com.parallelExeExample;

import java.util.Date;

import org.apache.james.mime4j.field.datetime.DateTime;

public class GettingTimeDifferenceBetweenTwoTimes {

	public static void main(String[] args) throws InterruptedException {
		
		/* long time = System.currentTimeMillis(); // current time
		    DateTime time1 = new DateTime(time);
		    DateTime time2 = new DateTime(time + 120_000); // add 2 minutes for example
		    Minutes minutes = Minutes.minutesBetween(time1, time2);
		    System.out.println(minutes.getMinutes()); // prints 2
		    */
		    
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Thread.sleep(2000);
		Date d2 = new Date();
		System.out.println(d2.getTime());
		long diffMs = d2.getTime() - d1.getTime();
		long diffSec = diffMs / 1000;
		long min = diffSec / 60;
		long sec = diffSec % 60;
		System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
		    
	}
}
