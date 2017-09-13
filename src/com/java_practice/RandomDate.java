package com.java_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.jetty.util.StringBufferWriter;

public class RandomDate   {
	
	public static void main(String[] args) throws Throwable{
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
		BufferedWriter sb = new BufferedWriter(new FileWriter(new File("cratedData.txt")));
		for (int i = 0; i <2000000; i++) {
			Date d =new Date();
			sb.write(date.format(d));
			sb.newLine();
		}
		
		sb.flush();
		sb.close();
		  
	 }    
   }

