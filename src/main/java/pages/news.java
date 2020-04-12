package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class news {

	@FindBy(xpath = "//*[@id=\"dots_overflow_menu_container\"]")
	private WebElement drop;

	@FindBy(id = "news")
	private WebElement news;

	@FindBy(xpath = "//*[@id=\"news\"]/div[1]/a")
	private WebElement slide;
////*[@id="nsn-category"]/li[3]/a[1]
	@FindBy(xpath = "(//a[@aria-controls=\"nsn-category\"])[3]")
	private WebElement sport;

	@FindBy(xpath = "//a[@aria-label='Search news about NFL']")
	private WebElement nfl;
	@FindBy(xpath = "//*[@id=\"nsn-category-subitems-2\"]/li[1]/a")
	private WebElement texts;

	@FindBy(xpath = "//*[@class='b_logoArea']")
	private WebElement home;

	public news(WebDriver bings) {
		PageFactory.initElements(bings, this);

	}

	public WebElement dropmenue() {

		return drop;

	}

	public WebElement clickmenue() {

		return news;
	}

	public WebElement sport(WebDriver bings) throws InterruptedException {

		return sport;

	}

	public WebElement nfl() {
		return nfl;

	}

	public WebElement text() {
		return texts;

	}

	public WebElement home() {
		return home;
	}

}
