import java.io.IOException;

public class Runtime_getRuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("C:\\Users\\E002466\\Desktop\\Paint.bat");
		System.out.println("winium running successfully ");;
		Thread.sleep(2000);
		
		
		Runtime.getRuntime().exec("C:\\Users\\E002466\\Desktop\\closing_winium.bat");
		Process p =Runtime.getRuntime().exec("cmd.exe /c start C:\\Users\\E002466\\Desktop\\Paint.bat");
		p.waitFor();
		System.out.println("winium has been closed successfully ");
		
		
	}
}
