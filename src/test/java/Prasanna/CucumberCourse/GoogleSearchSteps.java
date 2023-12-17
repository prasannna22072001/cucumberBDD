package Prasanna.CucumberCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver;

//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//	
//		driver.get("https://google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("tesla");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
//
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		
//		driver.getPageSource().contains("Careers");
//		driver.quit();
//	}

}
