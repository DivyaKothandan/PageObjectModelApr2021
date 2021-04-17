package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		
		/*System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");*/
		
		/*LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		login.typeUserName();
		login.typePassword();
		login.submitLogin();
		*/
		LoginTest test = new LoginTest();
		test.launchURL();
		test.forgotUPScenario();
		
		
		
		
	}
	
	public void launchURL() {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	public void LoginScenario() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		login.typeUserName();
		login.typePassword();
		login.submitLogin();
	}
	
	public void forgotUPScenario() {
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		login.clickForgotUPLink();
	}
	

}
