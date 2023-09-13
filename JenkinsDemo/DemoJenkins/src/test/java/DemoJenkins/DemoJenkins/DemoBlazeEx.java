package DemoJenkins.DemoJenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlazeEx {
	WebDriver driver;
	CheckPrice checkprice;
  @Test
  public void homePage() {
	  checkprice= new CheckPrice(driver);
	  checkprice.validatingprice();
  }
  @BeforeTest
  public void beforetestmethod() {
	  driver=new ChromeDriver();
	  driver.get("https://www.demoblaze.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  } 
}
