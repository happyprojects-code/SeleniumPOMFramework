package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CollegeAdvisorLoginPage;

public class CollegeAdvisorLoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		CollegeAdvisorLoginPage loginPage = new CollegeAdvisorLoginPage(driver);
		driver.get("https://app.collegeadvisor.com/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("go-to-signup")));
		loginPage.enterUsername("BabluKhan@gmail.com");
		loginPage.enterPassword("Bablukhan@1");
		loginPage.clickLogin();
		Assert.assertEquals(driver.getTitle(),"CollegeAdvisor.com");
		
	}
	
	@Test
	public void testInValidLogin() {
		CollegeAdvisorLoginPage loginPage = new CollegeAdvisorLoginPage(driver);
		driver.get("https://app.collegeadvisor.com/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("go-to-signup")));
		loginPage.enterUsername("admin.com");
		loginPage.enterPassword("Admin");
		loginPage.clickLogin();
		Assert.assertEquals(driver.getTitle(),"CollegeAdvisor.com");
		
	}

}
