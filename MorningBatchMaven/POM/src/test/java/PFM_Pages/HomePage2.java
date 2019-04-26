package PFM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage2 {

	WebDriver driver;

	public HomePage2(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='login']")
	// @FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement SignInButton;

	@FindBy(how = How.ID, using = "email")
	public WebElement userName;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement Password;

	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement login;

	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		Password.sendKeys(strPassword);
	}

	// Click on login button

	public void clickLogin() {
		login.click();
	}

	public void clickSignIn() {
		SignInButton.click();
	}

	/*
	 * String baseURL = "http://www.n11.com/";
	 * 
	 * 
	 * //*********Web Elements by using Page Factory*********
	 * 
	 * @FindBy(how = How.CLASS_NAME, using = "btnSignIn") public WebElement
	 * signInButtonBy;
	 * 
	 * //*********Page Methods********* //Go to Homepage public HomePage goToN11 (){
	 * driver.get(baseURL); return this; }
	 * 
	 * //Go to LoginPage
	 * 
	 * public LoginPage goToLoginPage (){ click(signInButtonBy); return new
	 * LoginPage(driver); }
	 */

}
