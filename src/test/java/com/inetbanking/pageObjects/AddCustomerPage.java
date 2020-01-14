package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "New Customer")
	@CacheLookup
	WebElement lnkNewCustomer;
	
	@FindBy(how = How.NAME,  using = "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.XPATH, using = "//*[@value=\"m\"]")
	@CacheLookup
	WebElement rbtGenderMale;
	
	@FindBy(how = How.XPATH, using = "//*[@value=\"f\"]")
	@CacheLookup
	WebElement rbtGenderFemale;
	
	@FindBy(how = How.ID, using = "dob")
	@CacheLookup
	WebElement txtBirthDate;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPIN;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtPhone;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	public void clickAddNewCustomer() {
		lnkNewCustomer.click();
	}
	
	public void setCustomerName(String customerName) {
		txtCustomerName.sendKeys(customerName);
	}
	
	public void setGender(String gender) {
		if (gender.equals("male")) {
			rbtGenderMale.click();
		} else if (gender.equals("female")){
			rbtGenderFemale.click();
		}
		
	}
	
	public void setBirthDate(String mm, String dd, String yy) {
		txtBirthDate.sendKeys(mm);
		txtBirthDate.sendKeys(dd);
		txtBirthDate.sendKeys(yy);
	}
	
	public void setAddress(String address) {
		txtAddress.sendKeys(address);
	}
	
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void setState(String state) {
		txtState.sendKeys(state);
	}
	
	public void setPIN(String pin) {
		txtPIN.sendKeys(String.valueOf(pin));
	}
	
	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassNewCustomer(String passNewCustomer) {
		txtPassword.sendKeys(passNewCustomer);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	
}
