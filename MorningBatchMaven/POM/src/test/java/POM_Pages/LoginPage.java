package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// *********Web Elements*********
	By usernameBy = By.id("email");
	By passwordBy = By.id("password");
	By loginButtonBy = By.id("loginButton");
	By errorMessageUsernameBy = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
	By errorMessagePasswordBy = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");

	// *********Page Methods*********


}
