package steps;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.HomePage;
import pages.LoginPage;
import utils.WebDriverManager;

@RunWith(Cucumber.class)
public class LoginSteps {
	
	ChromeDriver driver = (ChromeDriver) WebDriverManager.getDriver();
	LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);

	
	@Given("user navigates to the swag labs web")
	public void user_navigates_to_the_swag_labs_web() {
		String swagUrl = "https://www.saucedemo.com/v1/";
		driver.get(swagUrl);
	}
	
	@When("user enters {string} and {string} and clicks login button")
	public void user_enters_and_and_clicks_login_button(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLoginButton();
	}
	
	@Then("login must be {string}")
	public void login_must_be(String successful) throws InterruptedException {
		if(Boolean.valueOf(successful)) {
			Assert.assertTrue(home.isInventoryPresent());
		} else {
			Assert.assertTrue(login.isErrorPresent());
		}
		Thread.sleep(5000);
		WebDriverManager.quitDriver();
	}
	
}
