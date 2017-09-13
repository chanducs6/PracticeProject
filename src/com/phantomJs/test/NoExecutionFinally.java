package com.phantomJs.test;

public class NoExecutionFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("abcd");
			System.exit(00);
			System.out.println("this is first line ");
			int a =0100/0; 
			System.out.println("this is first line ");
			System.out.println("this is first line ");
			System.out.println("this is first line ");
			
		} catch (Exception e) {
			System.out.println("it is catch block ");
		}finally {
			System.out.println("it is finally block ");
		}
	}
}
