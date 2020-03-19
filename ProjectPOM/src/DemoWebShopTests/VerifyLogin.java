package DemoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.LoginPOM;

public class VerifyLogin {

	@Test
	public void checklogin(){
	 System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("http://demowebshop.tricentis.com/login");
	 driver.manage().window().maximize();
	

	LoginPOM login=new LoginPOM(driver);
	login.enteremail("saishankar522@gmail.com");
	login.enterpass("Momdadme@007");
	login.clickLogin();
	}




}






