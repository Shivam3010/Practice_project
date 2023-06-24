package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class country_datainput extends Baseclass {

	
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement country;
	
	public country_datainput() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public void entercountry()
	{
		country.sendKeys("India");
	}
	

}
