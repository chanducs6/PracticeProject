import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndigoLnT_Test {

	public static void main(String[] args) {
	/* System.setProperty("webdriver.gecko.driver", "C:\\Chandrakant\\MJunction_demo\\lib\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E002466\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://uatservices.goindigo.in/LoadAndTrim/DashboardRes.aspx#");
	}
}
