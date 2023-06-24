package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Dropdown extends Baseclass{
	
	@FindBy (xpath = "//select[@id='dropdown-class-example']")
	WebElement dropdown;

	public Dropdown() throws Exception {
		PageFactory.initElements(driver, this);
	}

	public void selectdropdown()
	{
		dropdown.click();
		selectclass(dropdown, 2);

	}
}
