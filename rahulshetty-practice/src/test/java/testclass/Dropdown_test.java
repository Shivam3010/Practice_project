package testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import main.Dropdown;

public class Dropdown_test extends Baseclass{
	
	Dropdown dropdown;

	public Dropdown_test() throws Exception {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		dropdown=new Dropdown();
	}
	
	@Test
	public void checkdropdownfunctionality()
	{
		dropdown.selectdropdown();	
		
	}
	
	
}
