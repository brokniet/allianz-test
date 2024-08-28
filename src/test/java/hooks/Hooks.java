package hooks;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.WebDriverManager;

public class Hooks {
	
	@Before
	public void setUp() {
		WebDriverManager.getDriver().manage().window().maximize();
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown() {
		WebDriverManager.quitDriver();
	}

}
