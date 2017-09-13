package com.java_practice;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class GettingMethodNames {

	private void foo() { }

	protected int bar() { return 12; }

	String baz() { return ""; }


	public  Method[] getAccessibleMethods(Class clazz) {
		List<Method> result = new ArrayList<Method>();
		
			System.out.println("Declared Methods"+ clazz.getDeclaredMethods().length);
			for (Method method : clazz.getDeclaredMethods()) {
				System.out.println("+++++++++++++++++++"+method.getName());
				int modifiers = method.getModifiers();
				System.out.println("Modifier for "+ method.getName()+" : " + modifiers);
				
				result.add(method);
				
			}
		
		return result.toArray(new Method[result.size()]);
	}


	public void methodCall()
	{
		GettingMethodNames ab = new GettingMethodNames();
		Method[] ac = ab.getAccessibleMethods(this.getClass());
		System.out.println(ac.length);
		for(Method as : ac){
			System.out.println(as.getName());
		}
		
	}
	public static void main(String args[])
	{
		GettingMethodNames dump= new GettingMethodNames();
		dump.methodCall();

	}
}

