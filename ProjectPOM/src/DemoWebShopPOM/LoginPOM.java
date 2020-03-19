package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	WebDriver driver;
	By email=By.name("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
public LoginPOM(WebDriver driver){
	this.driver=driver;
	
}

public void enteremail(String Em){
	driver.findElement(email).sendKeys(Em);
}

public void enterpass(String psd){
	driver.findElement(password).sendKeys(psd);
	
}

public void clickLogin(){
	driver.findElement(login).click();
}

}
