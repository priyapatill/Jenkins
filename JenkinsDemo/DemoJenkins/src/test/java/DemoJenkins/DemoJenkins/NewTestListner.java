package DemoJenkins.DemoJenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTestListner {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
  }
  @Test
  public void f4() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.navigate().back();
  }
  @BeforeMethod
  public void f2() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }
  @AfterMethod
  public void f3() {
	  driver.quit();
  }
}
