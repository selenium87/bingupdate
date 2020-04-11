package RegRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg {

	public static WebDriver bing;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\husky\\Downloads\\chromedriver_win32\\chromedriver.exe");
		bing=new ChromeDriver();
		bing.navigate().to("https://www.bing.com/");
	}

}
