package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePages{

	//WebDriver driver;
	
	SignInPage B1 = new SignInPage(driver);
	
	
	public SignInPage(WebDriver driver) { 
		//this.driver = driver;
		super(driver);
	}

	By userName = By.id("email");
	By pass = By.id("passwd");
	By signInButton = By.id("SubmitLogin");

	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);

	}

	public void setPassword(String strPassword) {
		driver.findElement(pass).sendKeys(strPassword);
	}

	/*
	 * public void clickButton() { driver.findElement(signInButton).click(); }
	 */
	
	
	public void login(String strUserName, String strPassword) {

		setUserName(strUserName);
		setPassword(strPassword);
		B1.click(signInButton);
	}

}
