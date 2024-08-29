package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	
	private By productsLabel = By.xpath("//*[contains(text(), 'Products')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isInventoryPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(productsLabel));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
