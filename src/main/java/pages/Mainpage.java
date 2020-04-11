package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Mainpage {


	@FindBy(xpath = "//*[@id=\"dots_overflow_menu_container\"]")
	WebElement drop;

	@FindBy(xpath = "//*[@id=\"local\"]/a")
	WebElement maps;

	@FindBy(xpath = "//*[@id=\"video\"]/a")
	WebElement video;

	@FindBy(xpath = "//*[@id=\"news\"]/a")
	WebElement news;
	@FindBy(xpath = "//*[@id=\"msn\"]/a")
	WebElement msn;

	@FindBy(xpath = "//*[@id=\"office\"]/a")
	WebElement office;

	@FindBy(xpath = "//*[@id=\"mapContainer\"]/div[1]/ul[1]/li[1]/a/h1")
	WebElement home;
	
	public Mainpage(WebDriver bings) {

	
		PageFactory.initElements(bings, this);
	}

/*	public void shopping() throws InterruptedException, IOException {

		//
		drop.click();

		//

		shopping.click();
		screenshot photo = new screenshot();

		//
		photo.screenshot(bings);
		Thread.sleep(4000);

		//
		bings.navigate().back();
	}*/

	public void maps() throws InterruptedException, IOException {
		drop.click();
		maps.click();
	
		Thread.sleep(4000);
		
	}

	public void video() {
		drop.click();
		video.click();
	}

	public void msn() {
		drop.click();
		msn.click();
	}

	public void news() {
		drop.click();
		news.click();

	}

	public void office() {
		drop.click();

		office.click();
	}
}
