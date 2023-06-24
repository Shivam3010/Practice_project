package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Practice extends Baseclass {

	@FindBy(xpath = "//input[@value='radio1']")
	WebElement radiobtn1;
	
	@FindBy(xpath = "//input[@value='radio2']")
	WebElement radiobtn2;
	
	@FindBy(xpath = "//input[@value='radio3']")
	WebElement radiobtn3;
	
	public Practice() throws Exception {
	PageFactory.initElements(driver, this);
	}
	
	public boolean radiobtnfunctionality1()
	{
		radiobtn1.click();
		boolean check1=radiobtn1.isSelected();
		return check1;
	}
	
	public boolean radiobtnfunctionality2()
	{
		radiobtn2.click();
		boolean check2=radiobtn2.isSelected();
		return check2;
	}
	public boolean radiobtnfunctionality3()
	{
		radiobtn3.click();
		boolean check3=radiobtn3.isSelected();
		return check3;
	}
}
