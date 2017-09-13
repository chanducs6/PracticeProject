package com.java_practice;


/*public class InnerClassExample {
	public pvtClass vv = new pvtClass();
	
	private class pvtClass{
		
		public  int a = 10;
	}
	public static void main(String[] args) {
		outer bb = new outer();
		bb.method();
	}
}

class outer extends InnerClassExample{
	
	
	public void method(){
		
System.out.println(vv.a);
	}
	
	
}
*/


class Outer_Demo {
	   int num;
	   
	   private class Inner_Demo {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo();
	      inner.print();
	   }
	}
	   
public class InnerClassExample {

	   public static void main(String args[]) {
	      Outer_Demo outer = new Outer_Demo();
	      
	      outer.display_Inner();
	   }
	}
