package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameInput = By.id("user-name");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		WebElement usernameElement = driver.findElement(usernameInput);
		usernameElement.sendKeys(username);
	}

	public void enterPassword(String password) {
		WebElement passwordElement = driver.findElement(passwordInput);
		passwordElement.sendKeys(password);
	}
	
	public void clickLoginButton() {
		WebElement loginButtonElement = driver.findElement(loginButton);
		loginButtonElement.click();
	}
	
}
