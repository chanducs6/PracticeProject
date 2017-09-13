package com.pack.test;

public class ExtendsPractice {

 public static void main(String[] args) {
	
	 S s1 = new S();
	 s1.test(90);
}
	
}

class S extends G{
	
 void test(int b){
		
		System.out.println("test int b is executed");
	}
	
}

class G {
	
	 void test(int a){
		System.out.println("test int a is executed");
	}
	 
	 static void testab(){
		 
		 
	 }
	
}
