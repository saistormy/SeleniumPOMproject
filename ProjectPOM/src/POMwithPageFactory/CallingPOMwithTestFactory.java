package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CallingPOMwithTestFactory {
	
	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		LoginPageFactory LoginPage=PageFactory.initElements(driver, LoginPageFactory.class);
		LoginPage.sendEmail("saishankar123@gmail.com");
		LoginPage.EnterPAssword("HelloWorld");
		LoginPage.clickLogin();
	}

}
