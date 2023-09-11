package DemoJenkins.DemoJenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop {
	WebDriver driver;
	LoginPage1 login;
	RegisterPage register;
  @Test
  public void loginpage() {
	  login =new LoginPage1(driver);
	  login.perfomLoginAction("Admin@gmail.com","admin@123");
	  
	  register=new RegisterPage(driver);
	  register.perfomRegisterAction("Admin","abc","Admin@gmail.com","admin@123","admin@123");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  //Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
  }
  @BeforeTest
  public void beforetestmethod() {
	  driver=new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  } 
}
