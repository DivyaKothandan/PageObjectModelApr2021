package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest {
	
	public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	
	LoginPage login = new LoginPage(driver);
	login.clickLoginLink();
	login.typeUserName();
	login.typePassword();
	login.submitLogin();
	
	HomePage home = new HomePage(driver);
	home.contentLinkclick();
	
	login.clickLoginLink();
	login.clickForgotUPLink();
	

}
	
	
}