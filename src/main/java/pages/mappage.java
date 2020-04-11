package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mappage {
	//WebDriver bings;

	@FindBy(xpath = "//*[@id=\"dots_overflow_menu_container\"]")
	private WebElement drop;

	@FindBy(xpath = "//*[@id=\"local\"]/a")
	private WebElement mapbtn;

	@FindBy(id = "maps_sb")
	private WebElement search;

	@FindBy(xpath = "//*[@id=\"maps_sb_container\"]/div[1]/div/a")
	private WebElement button;

	@FindBy(xpath = "//a[@class='b_logoArea']")
	private WebElement home;

	@FindBy(xpath = "//div[@class='nameContainer']")
	private WebElement textss;

	mappage(WebDriver bings) {
		//this.bings = bings;
		PageFactory.initElements(bings, this);

	}

	public WebElement drop() throws InterruptedException, IOException {

		return drop;
	}

	public WebElement maplink() {
		return mapbtn;
	}

	public WebElement textbox() {
		return search;
	}

	public WebElement mapssearch() {

		return button;
	}

	public WebElement adresstext() {
		return textss;
	}
	public WebElement maps() throws InterruptedException {

		return home;
	}

}
