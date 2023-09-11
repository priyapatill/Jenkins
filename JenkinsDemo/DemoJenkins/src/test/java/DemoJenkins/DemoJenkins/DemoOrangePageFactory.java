package DemoJenkins.DemoJenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoOrangePageFactory {
	WebDriver driver;
	Loginpage objlogin;
	Homepage objhome;
  @Test
  public void logintest() {
	  objlogin =new Loginpage(driver);
	  objlogin.perfomLoginAction("Admin", "admin123");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  objhome=new Homepage(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  objhome.clickadmintab();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
  }
  @BeforeTest
  public void beforetestmethod() {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  } 
}
