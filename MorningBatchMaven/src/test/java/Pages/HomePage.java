package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePages {

	//WebDriver driver;
	
	public HomePage(WebDriver driver) { 
		//this.driver = driver;
		super(driver);
	}

	// WebElement SignInLink = driver.findElement(By.xpath("//a[@class='login']"));
	By SignInButon = By.xpath("//a[@class='login']");

	// WebElement SignInLink = driver.findElement(By.xpath("//a[@class='login']"));
	By ContactUS = By.xpath("//a[@class='ContactUS']");
	
	public void clickButton() {
		driver.findElement(SignInButon).click();
	}

	
	
}
