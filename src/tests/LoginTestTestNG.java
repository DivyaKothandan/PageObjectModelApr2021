package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTestTestNG {
	WebDriver driver;
	
	
	@BeforeMethod
	public void launchURL() throws Exception {
		
		// Property file code
		File f = new File("C:\\Users\\Ramya\\Desktop\\Selenium\\Training2021\\PageObjectModelTest\\src\\utils\\Properties\\env.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);	
		
		
		if(prop.get("Browser").equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.get(prop.getProperty("URL"));
		}
		else {
			System.setProperty("webdriver.gecko.driver", "D://Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			
			//driver.get("https://en.wikipedia.org/wiki/Main_Page");
			
			driver.get(prop.getProperty("URL"));
		}
		
		System.out.println(prop.get("UserName"));
		System.out.println(prop.get("Password"));
		
		
	}
	@Test(priority=0)
	public void LoginScenario() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		login.typeUserName();
		login.typePassword();
		login.submitLogin();
	}
	@Test(priority=1)
	public void forgotUPScenario() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		
		Thread.sleep(3000);
		login.clickForgotUPLink();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
