package DemoJenkins.DemoJenkins;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logs1 {
	WebDriver driver;
	org.apache.logging.log4j.Logger logger;
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
  @Test
  public void f() {
	  logger= LogManager.getLogger(Logs1.class);
	  String title=driver.getCurrentUrl();
	  Assert.assertEquals(title, "Google");
  }
}
