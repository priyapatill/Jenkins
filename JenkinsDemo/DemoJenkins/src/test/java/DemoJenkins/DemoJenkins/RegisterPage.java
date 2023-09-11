package DemoJenkins.DemoJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	By register=By.xpath("//a[contains(text(),'Register')]");
	By gender=By.id("gender-female");
	By fname=By.id("FirstName");
	By lname=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By confirmPass=By.id("ConfirmPassword");
	By registerButton=By.id("register-button");
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickregister() {
		driver.findElement(register).click();
	}
	public void selectgender() {
		driver.findElement(gender).click();
	}
	public void firstname(String fnae) {
		driver.findElement(fname).sendKeys(fnae);;
	}
	public void lastname(String lnae) {
		driver.findElement(lname).sendKeys(lnae);
	}
	public void gmail(String em) {
		driver.findElement(email).sendKeys(em);;
	}
	public void pwd(String pd) {
		driver.findElement(password).sendKeys(pd);
	}
	public void confirmpwd(String pdw) {
		driver.findElement(confirmPass).sendKeys(pdw);
	}
	public void registerbutton() {
		driver.findElement(registerButton).click();
	}
	public void perfomRegisterAction(String fn,String ln,String mail, String pwd,String cp) {
		this.clickregister();
		this.selectgender();	
		this.firstname(fn);
		this.lastname(ln);
		this.gmail(mail);
		this.pwd(pwd);
		this.confirmpwd(cp);
		this.registerbutton();
	}
}
