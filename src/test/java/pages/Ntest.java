package pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import bing.StartUp;

public class Ntest extends StartUp {

	news ne = new news(bings);

	@Test(priority = 1)
	public void dropmenueTest() throws IOException {
		//prop.load(dat.datas());
		//bings.navigate().to(prop.getProperty("URL"));

		news ne = new news(bings);
		ne.dropmenue().click();
		ne.clickmenue().click();
	}

	@Test(priority = 5)
	public void homeTest() {
		news ne = new news(bings);
		ne.home().click();
	}

	@Test(priority = 3)
	public void nflTest() {
		news ne = new news(bings);
		ne.nfl().click();
	}

	@Test(priority = 2)
	public void sportTest() throws InterruptedException {
		news ne = new news(bings);
		ne.sport(bings).sendKeys(Keys.CONTROL, Keys.ENTER);
		ArrayList<String> chan = new ArrayList<String>(bings.getWindowHandles());

		bings.switchTo().window(chan.get(1));
	}

	@Test(priority = 4)
	public void textTest() {
		news ne = new news(bings);
		ne.text().getText();

		String[] ee = ne.text().getText().split("F");
		// String cc=ee[1].trim();//L
		// String we=ee[0].trim();//N
		// System.out.println(ee[0]+"--f--"+cc+" "+ee[1]);
		System.out.println(ee[0]);
		System.out.println(ee[1]);
		System.out.println(ne.text().getText());

	}
}
