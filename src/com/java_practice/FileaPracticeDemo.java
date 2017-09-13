package com.java_practice;

import java.io.File;
import java.io.IOException;

public class FileaPracticeDemo {

	public static void main(String[] args) throws IOException {
		
			File f = new File("remo908.txt");
			f.renameTo(new File("hsadd.txt"));
			f.delete();
		
	
	}
}
