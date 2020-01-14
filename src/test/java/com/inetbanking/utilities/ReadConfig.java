package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch(Exception e) {
			System.err.println("Exception is " + e.getMessage());
		}
	}
	
	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getCustomerName() {
		String customerName=pro.getProperty("customerName");
		return customerName;
	}	
	
	public String getGender() {
		String gender=pro.getProperty("gender");
		return gender;
	}	
	
	public String getMonth() {
		String month=pro.getProperty("month");
		return month;
	}
	
	public String getDay() {
		String day=pro.getProperty("day");
		return day;
	}
	
	public String getYear() {
		String year=pro.getProperty("year");
		return year;
	}
	
	public String getAddress() {
		String address=pro.getProperty("address");
		return address;
	}	
	
	public String getCity() {
		String city=pro.getProperty("city");
		return city;
	}
	
	public String getState() {
		String state=pro.getProperty("state");
		return state;
	}
	
	public String getPIN() {
		String pin=pro.getProperty("pin");
		return pin;
	}
	
	public String getPhone() {
		String phone=pro.getProperty("phone");
		return phone;
	}
	
	public String getPassNewCustomer() {
		String passNewCustomer=pro.getProperty("passNewCustomer");
		return passNewCustomer;
	}
	
	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}
