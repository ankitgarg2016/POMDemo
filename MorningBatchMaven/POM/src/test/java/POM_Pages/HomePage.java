package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	//WebDriver driver;

	public HomePage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
	}
	/*
	 * @FindBy(xpath= "//a[@title='Log in to your customer account']") public static
	 * WebElement lnk_SingnIn;
	 */
	
	By SignInButon = By.xpath("//a[@class='login']");
	By userName = By.id("email");
	By Password = By.id("passwd");
	By login = By.id("SubmitLogin");

	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		driver.findElement(Password).sendKeys(strPassword);
	}

	// Click on login button

	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void clickSignIn() {
		driver.findElement(SignInButon).click();
	}

}
