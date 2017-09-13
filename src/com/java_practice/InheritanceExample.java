package com.java_practice;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InheritanceExample {
	static String name;
	
	InheritanceExample(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		InheritanceExample ab = new InheritanceExample("jksdgf");
		System.out.println("the parameter name is: "+ name);
	}
		
}

