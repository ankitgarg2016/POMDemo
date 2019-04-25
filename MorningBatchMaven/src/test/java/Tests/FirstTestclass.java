package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.BasePages;
import Pages.HomePage;
import Pages.SignInPage;

public class FirstTestclass  {


	WebDriver driver;
	
	HomePage homePage = new HomePage(driver);
	SignInPage signIn = new SignInPage(driver);

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 0)
	public void Login1() {

		homePage.clickButton();
		signIn.login("ANkit@gmail.com", "Test@123");

	}

	/*
	 * @Test(priority = 1) public void creatinganAccount() {
	 * 
	 * driver.findElement(By.xpath("//a[@class='login9']")).click();
	 * driver.findElement(By.id("email_create")).sendKeys("Test@gmail.com");
	 * 
	 * }
	 */

}
