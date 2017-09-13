package com.java_practice;



public class RunningExeFileAndTerminating {

	public static void main(String[] args) throws Throwable {

		//@BeforeSuite	
		try {
			Runtime.getRuntime().exec("C:\\Users\\E002466\\Winium.Desktop.Driver.exe");
			System.out.println(Runtime.getRuntime());
			System.out.println("winium is running ");

		}catch (Exception e) 
		{
			System.out.println(e);

		}

		//@AfterSuite	
		/*try {

			String[] command = { "cmd.exe", "/C", "Start", System.getProperty("user.dir")+"\\run.bat"};
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(command);
			p.waitFor();
			System.out.println("Successfully killed the winium task ");
		}catch(Exception e){ 
			
			System.out.println("we can write try without catch also but for that finally block is requied ");
			
		}finally{
			
		}*/
			
		}
	}	

