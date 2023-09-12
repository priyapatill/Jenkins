package DemoJenkins.DemoJenkins;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlazeLog {
	WebDriver driver;
	Logger logger;
	
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
  @Test
  public void f() {
	  logger=LogManager.getLogger(DemoBlazeLog.class);
	  //WebElement element=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h5"));
	  driver.findElement(By.xpath("//a[@class='hrefch']")).click();  
	  WebElement ele=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3"));
	  WebElement a= driver.findElement(By.xpath("//*[@id=\\\"tbodyid\\\"]/div[1]/div/div/h5"));
	  Assert.assertEquals(a, ele);
  }
}
