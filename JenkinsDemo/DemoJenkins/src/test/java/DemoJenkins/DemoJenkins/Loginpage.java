package DemoJenkins.DemoJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	//By object for web elements by corresponding locators
	By username=By.name("username");
	By password =By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	WebDriver driver;
	
	//constructor to instantiate
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	//setting the username
	public void setusername(String uname) {
		driver.findElement(username).sendKeys(uname);		
	}
	public void setupassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);		
	}
	public void clickloginbtn() {
		driver.findElement(loginbtn).click();		
	}
	public void perfomLoginAction(String uname, String pwd) {
		this.setusername(uname);	
		this.setupassword(pwd);
		this.clickloginbtn();
	}

}
