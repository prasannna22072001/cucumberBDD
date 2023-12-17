package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	By txt_username = By.id("input-email");
	By txt_password = By.id("input-password");
	By but_submit = By.xpath("//input[@type='submit']");
	By assert_txt = By.xpath("(//div[@id='content']/h2)[1]");
	
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clickLogin() {
		driver.findElement(but_submit).click();
	}
	
	public String gettext() {
		
		String text = driver.findElement(assert_txt).getText();
		return text;
	}
	
}
