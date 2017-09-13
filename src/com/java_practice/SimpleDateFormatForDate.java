package com.java_practice;

import java.text.*;
import java.util.Date;

public class SimpleDateFormatForDate {

	public static void main(String[] args) {

		DateFormat date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:aa");
		Date dd= new Date();

		System.out.println(date.format(dd));
	}
}
