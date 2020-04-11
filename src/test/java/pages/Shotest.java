package pages;

import java.io.IOException;

import org.testng.annotations.Test;

import bing.StartUp;

public class Shotest extends StartUp {

	@Test(priority = 0)
	public void dropmenubuttonTest() throws InterruptedException, IOException {

		shopping shop = new shopping(bings);
		shop.dropmenubutton().click();
		shop.shoppingselect().click();
	}


	@Test(priority = 1)
	public void itemsearchTest() throws IOException {
		prop.load(dat.datas());
		shopping shop = new shopping(bings);
		shop.itemsearch().sendKeys(prop.getProperty("shoppingitem"));
		
		//shop.itemsearch(prop.getProperty("shoppingitem"));

		/*
		 * for (int i = 1;i<4;i++) { String abc=("shoppingitem"+i);
		 * 
		 * //shop.itemsearch(prop.getProperty(abc+i)); //shop.searchbutton();
		 */

	}

	@Test(priority = 2)
	public void searchbuttonTest()   {
		shopping shop = new shopping(bings);
	
		shop.searchbutton().click();
	}

	@Test(priority = 3)
	public void shoppingselectTest() {
		shopping shop = new shopping(bings);
		shop.home().click();
	}
}
