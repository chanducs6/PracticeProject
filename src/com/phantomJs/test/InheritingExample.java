package com.phantomJs.test;

class data{
	
	void datamethod(){
		
		System.out.println("from data class");
	}
}

public class InheritingExample extends data {

	void datamethod1(){
		
		System.out.println("from inheritance class");
	}
	
	public static void main(String[] args) {
		data ab = new data();
		InheritingExample bb = (InheritingExample) ab;
		bb.datamethod();
	}
	
	
}
