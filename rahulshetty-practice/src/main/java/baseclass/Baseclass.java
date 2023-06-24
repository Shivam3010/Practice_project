package baseclass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import testutil.Selectclass;

public class Baseclass implements Selectclass {
	
		public static Properties prop;
		public static WebDriver driver;
		
		public Baseclass() throws Exception
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Shivam\\eclipse-workspace\\rahulshetty-practice"
														+ "\\src\\main\\java\\properties\\config.properties");
			prop.load(fis);
			
		}
		
		public static void initialization()
		{
			String browser=prop.getProperty("browser");
			if (browser.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if (browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if (browser.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			String title= driver.getTitle();
			System.out.println(title);
			}

		public void selectclass(WebElement input, int data)
		{
			Select sc=new Select(input);
			sc.selectByIndex(data);
			
		}


	
			
		}


	
