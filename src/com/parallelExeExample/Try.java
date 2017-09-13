package com.parallelExeExample;

public class Try {

	Try(){
		
		System.out.println("this is constructor");
		
	}
	
	
	{
		System.out.println("this is non static block");
	}
	
	static int i;
	
	static{
		
		data();
	};
	
	public static void data(){
		
		System.out.println("this is from static block "+i);
	}
	
	public static void main(String[] args) {
		i=20;
		System.out.println("this is main method");
		
		
		Try aa = new Try();
		Try aa1 = new Try();
		Try aa2 = new Try();
		Try aa24 = new Try();
	
	}
	
    static{
		
		System.out.println("this is 2nd static ");
	};
	
	
	 static{
			
			System.out.println("this is 3nd static ");
		};
}