package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");
		
	}
	
	@Test
	public void testInValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		loginPage.enterUsername("admin.com");
		loginPage.enterPassword("Admin");
		loginPage.clickLogin();
		Assert.assertNotEquals(driver.getTitle(),"Dashboard / nopCommerce administration");
		
	}

}
