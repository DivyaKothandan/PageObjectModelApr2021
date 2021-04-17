package pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	

	
	WebDriver driver;
	
	By LoginLink = By.id("pt-login");
	By Username = By.id("wpName1");
	By PassWord = By.id("wpPassword1");
	By submitButton = By.id("wpLoginAttempt");
	By forgorUPLink = By.xpath("//*[@id='userloginForm']/form/div/div[6]/div/a");
	
	//driver.findElement(By.id("pt-login")).click();
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickLoginLink() {
		driver.findElement(LoginLink).click();
	}
	
	public void typeUserName() throws Exception {
		Thread.sleep(2000);
		driver.findElement(Username).sendKeys("DivyaKothandan");
	}
	
	public void typePassword() throws Exception {
		Thread.sleep(2000);
		driver.findElement(PassWord).sendKeys("SeleniumTesting");
	}
	
	public void submitLogin() {		
		driver.findElement(submitButton).click();
		
	}

	public void clickForgotUPLink() {
		driver.findElement(forgorUPLink).click();
	}
}
