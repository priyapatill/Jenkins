package DemoJenkins.DemoJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(),"Google - search");
  }
}
