package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PFM_Pages.HomePage2;


public class LoginTestsPFM {

	WebDriver driver;
	HomePage2 objHomePage;

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
	public void Login() {
		System.out.println("Starting the first test case");
		objHomePage = new HomePage2(driver);
		objHomePage = PageFactory.initElements(driver, HomePage2.class);
		// HomePage.lnk_SingnIn.click();

		objHomePage.clickSignIn();
		objHomePage.setUserName("TEst");
		objHomePage.setPassword("TEst");
		objHomePage.clickLogin();
	}

	/*
	 * @Test(priority = 1) public void Login1() {
	 * 
	 * driver.navigate().to("http://automationpractice.com/index.php");
	 * driver.findElement(By.xpath("//a[@class='login']")).click();
	 * driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
	 * driver.findElement(By.id("passwd")).sendKeys("Test@gmail.com");
	 * driver.findElement(By.id("SubmitLogin")).click();
	 * 
	 * 
	 * }
	 */

}
