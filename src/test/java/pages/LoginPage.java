package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameInput = By.id("user-name");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.xpath("//h3[contains(text(), 'Epic sadface')]");
	
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
	
	public boolean isErrorPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
}
