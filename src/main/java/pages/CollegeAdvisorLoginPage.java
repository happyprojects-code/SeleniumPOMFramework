package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CollegeAdvisorLoginPage {
	private WebDriver driver;

	private By usernameTexBox = By.id("email");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.id("login-button");

	public CollegeAdvisorLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameTexBox).clear();
		driver.findElement(usernameTexBox).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

}
