package pages;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bing.StartUp;

public class Mtest extends StartUp {

	@Test(priority = 0)
	public void dropTest() throws InterruptedException, IOException {

		
		mappage map = new mappage(bings);
		map.drop().click();
		map.maplink().click();
	}

	@Test(priority = 2)

	public void textboxTest() throws IOException, InterruptedException {

		prop.load(dat.datas());
		mappage map = new mappage(bings);
		
		map.textbox().sendKeys(prop.getProperty("address"));
		
	
	}

	@Test(priority = 3)
	public void mapssearchTest() {
		mappage map = new mappage(bings);
		map.mapssearch().click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(map.adresstext(), "1604 Spring Hill Rd, Vienna, VA 22182");
		
	}

	@Test(priority = 4)
	public void mapsTest() throws InterruptedException {
		mappage map = new mappage(bings);
		map.maps().click();
	}

}
