package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username provided");
		lp.setPassword(password);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(5000);
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		
		logger.info("provided customer details...");

		acp.clickAddNewCustomer();
		acp.setCustomerName(customerName);
		acp.setGender(gender);
		acp.setBirthDate(month, day, year);
		Thread.sleep(3000);
		acp.setAddress(address);
		acp.setCity(city);
		acp.setState(state);
		acp.setPIN(pin);
		acp.setPhone(phone);
		acp.setEmail(email);
		acp.setPassNewCustomer(passNewCustomer);
		acp.clickSubmit();	
		Thread.sleep(3000);	
		
		logger.info("validation started...");
		
		boolean response = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (response) {
			Assert.assertTrue(true);
			logger.info("test passed!!!");

		} else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.warn("test failed!!!");

		}
		
		
	}
}
