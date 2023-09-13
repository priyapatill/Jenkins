package DemoJenkins.DemoJenkins;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class sauceDemo {
	//sauceDemo1 sd;
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  PageFactory.initElements(driver, sauceDemo1.class);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  sauceDemo1.username.sendKeys("standard_user");
	  sauceDemo1.password.sendKeys("secret_sauce");
	  sauceDemo1.btnLogin.click();
	  //driver.quit();
	  }
  }
