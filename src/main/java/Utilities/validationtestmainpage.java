package Utilities;

import java.util.Date;

import org.openqa.selenium.WebDriver;

public class validationtestmainpage {

	public void validation(WebDriver bing) {

		String currenturl = bing.getCurrentUrl();
		String title = bing.getTitle();

		Date d = new Date();
		System.out.println(currenturl + " ***  " + title + "*******" + d);

		if (currenturl.contains("https://www.bing.com/") && title.equals("Bing")) {
			System.out.println("page openned correctly");
		} else {
			System.out.println("incorrect page openned: " + currenturl);
		}

	}

}
