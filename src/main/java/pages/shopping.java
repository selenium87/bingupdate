package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopping {

	@FindBy(xpath = "//*[@id=\"dots_overflow_menu_container\"]")
	private WebElement drop;

	@FindBy(xpath = "//*[@id=\"shopping\"]/a")
	private WebElement shopping;

	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	private WebElement search;
	
	@FindBy(xpath = "//input[@id='sb_form_go']")
	private WebElement button;
	
	@FindBy(xpath = "//*[@id=\"sb_form\"]/a/h1")
	private WebElement home;

	public shopping(WebDriver bings) {

		PageFactory.initElements(bings, this);

	}

	public WebElement dropmenubutton() {

		return drop;
	}

	public WebElement shoppingselect() {

		return shopping;
	}

	public WebElement itemsearch() {

		return search;

	}

	public WebElement searchbutton() {
		return button;
		// search.clear();

	}

	public WebElement home() {

		return home;

	}

}
