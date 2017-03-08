package com.delux.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Gmailcreatepage {
	
	public static WebDriver driver;
	
	static By FirstName   =By.xpath("//input[@id='text']");
	static By LastName    =By.xpath("//input[@id='text']");
	static By UsName      =By.xpath("//input[@id='GmailAddress']");
	  
	
	public Gmailcreatepage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public  void setFirstName(String firstname){
		driver.findElement(FirstName).clear();
		driver.findElement(FirstName).sendKeys(firstname);
	}
	

	public  void setLastName(String lastname){
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys(lastname);
	}
	

			
}
