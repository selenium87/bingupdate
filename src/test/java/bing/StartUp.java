package bing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import Utilities.datamethod;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners (listner.class)
public class StartUp {
	public static WebDriver bings;
	
	
	protected static Properties prop = new Properties();
	protected static datamethod dat = new datamethod();
	
	
	
	
	
	@BeforeClass
	@org.testng.annotations.Parameters("browser")

	public static void startssss(String brows) throws IOException {


		if (brows.contentEquals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			bings = new ChromeDriver();
			prop.load(dat.datas());
			bings.navigate().to(prop.getProperty("URL"));
			bings.manage().window().maximize();
			bings.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} else {

			WebDriverManager.firefoxdriver().setup();
			bings = new FirefoxDriver();

			
			bings.manage().window().maximize();
			bings.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	
	public void screenshot(String result) throws IOException {

		File take = ((TakesScreenshot) bings).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(take, new File("\\screens\\"+result+ phototime()+ ".jpg"));
		

	}
	public String phototime() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	
	}

@AfterClass
public void last(){
	bings.quit();
}

}
