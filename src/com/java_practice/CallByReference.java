package com.java_practice;

public class CallByReference {
	  static void CallByReferenc(Number ab){
		System.out.println("the value is "+ab.x);
	}
 static public void main(String[] args) {
		Number r = new Number();
		r.x = 30;
		CallByReferenc(r);
	}
}

class Number{
	static int x;
}