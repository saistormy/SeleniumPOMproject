package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM {
	
	
	WebDriver driver;
	By gender =By.name("Gender");
	By firstname=By.name("FirstName");
	By lastname=By.xpath("//input[@id='LastName']");
	By email=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By conpass=By.xpath("//input[@id='ConfirmPassword']");
	By register=By.xpath("//input[@id='register-button']");
	
	public RegisterPOM(WebDriver driver){
		this.driver=driver;
	}
	
public void genderselect(){
	driver.findElement(gender).click();
}
public void enterfirstname(String FN){
	driver.findElement(firstname).sendKeys(FN);
}
public void enterlastname(String LN){
	driver.findElement(lastname).sendKeys(LN);
}
public void enteremail(String EM){
	driver.findElement(email).sendKeys(EM);
}
public void enterpassword(String PSD){
	driver.findElement(password).sendKeys(PSD);
}
public void enterconfpassword(String CPSD){
	driver.findElement(conpass).sendKeys(CPSD);
}
public void clickonregister(){
	driver.findElement(register).click();
}











}
