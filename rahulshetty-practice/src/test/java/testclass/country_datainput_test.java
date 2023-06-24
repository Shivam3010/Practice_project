package testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import main.country_datainput;

public class country_datainput_test extends Baseclass{
	
	country_datainput country;

	public country_datainput_test() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		country=new country_datainput();
	}

	@Test
	public void enterdetails()
	{
		country.entercountry();
	}
}
