package Prasanna.CucumberCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoSteps {

	WebDriver driver;
	loginPage lpage ;

	
@Given("Browser is open")
public void browser_is_open() {
   
			driver = new ChromeDriver();
	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
}

@And("user is on login page")
public void user_is_on_login_page() {
    
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
}

@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password(String username, String password) {
    
	lpage = new loginPage(driver);
	lpage.enterUsername(username);
	lpage.enterPassword(password);
	
	
}

@And("user clicks on login")
public void user_clicks_on_login() {
	lpage.clickLogin();
	
}


@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {

	String text = lpage.gettext();
	Assert.assertEquals(text, "My Account");
	driver.quit();
}


}
