package DemoJenkins.DemoJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	WebDriver driver;
	By login=By.xpath("//a[@class='ico-login']");
	By email=By.id("Email");
	By password=By.id("Password");
	By loginButton=By.xpath("//*[@class='button-1 login-button']");
	
	//constructor instantiate
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
	}	
	public void clicklogin() {
		driver.findElement(login).click();		
	}
	public void setemail(String mail) {
		driver.findElement(email).sendKeys(mail);		
	}
	public void setupassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);		
	}
	public void clickloginbtn() {
		driver.findElement(loginButton).click();		
	}
	public void perfomLoginAction(String mail, String pwd) {
		this.clicklogin();
		this.setemail(mail);	
		this.setupassword(pwd);
		this.clickloginbtn();
	}
}
