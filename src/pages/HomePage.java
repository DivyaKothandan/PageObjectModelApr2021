package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	By ContentLink = By.xpath("//*[@id='n-contents']/a");
	By AboutWiki = By.id("n-aboutsite");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void contentLinkclick() {
		driver.findElement(ContentLink).click();
		
		System.out.println("Contentlink clicked");
	}

}
