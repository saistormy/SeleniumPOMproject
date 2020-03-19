package DemoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.RegisterPOM;

public class RegisterPOMvalues {

	@Test
	public void checklogin(){
	 System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("http://demowebshop.tricentis.com/register");
	 driver.manage().window().maximize();
	 
	 RegisterPOM registering=new RegisterPOM(driver);
	 registering.genderselect();
	 registering.enterfirstname("ssai");
	 registering.enterlastname("shankaaar");
	 registering.enteremail("shankarsai7@gmail.com");
	 registering.enterpassword("helloooo");
	 registering.enterconfpassword("helloooo");
	 registering.clickonregister();
	 
	
	}
}