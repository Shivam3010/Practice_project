package testclass;

import org.testng.Assert;
import org.testng.annotations.*;

import baseclass.Baseclass;
import main.Practice;

public class Practice_test extends Baseclass{

	Practice practice;
	public Practice_test() throws Exception {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		practice=new Practice();
	}
	
	@Test
	public void radiobtn1() throws Exception
	{
		practice.radiobtnfunctionality1();
		Assert.assertEquals(practice.radiobtnfunctionality1(), true);
	}
	
	@Test
	public void radiobtn2() throws Exception
	{
		practice.radiobtnfunctionality2();
		Assert.assertEquals(practice.radiobtnfunctionality2(), true);
	}
	@Test
	public void radiobtn3() throws Exception
	{
		practice.radiobtnfunctionality3();
		Assert.assertEquals(practice.radiobtnfunctionality3(), true);
	}
	
}
