package steps;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.LoginPage;
import utils.WebDriverManager;

@RunWith(Cucumber.class)
public class LoginSteps {
	
	private ChromeDriver driver = (ChromeDriver) WebDriverManager.getDriver();
	private String swagUrl = "https://www.saucedemo.com/v1/";
	private LoginPage login = new LoginPage();
	
	@Given("user navigates to the swag labs web")
	public void user_navigates_to_the_swag_labs_web() {
		driver.get(swagUrl);
	}
	
	@When("user enters {string} and {string} and clicks login button")
	public void user_enters_and_and_clicks_login_button(String string, String string2) {
		
	}
	
	@Then("login must be {string}")
	public void login_must_be(String string) {
		
	}
}
