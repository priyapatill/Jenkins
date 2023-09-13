package DemoJenkins.DemoJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CheckPrice {
	WebDriver  driver;
	String price;
	String s;
	//getting home page price
	By homePagePrice= By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h5");
	//click on iphone
	By click= By.xpath("//a[contains(text(),'Iphone 6 32gb')]");
	//getting price in product page
	By productPagePrice= By.xpath("//*[@id=\"tbodyid\"]/h3");
	
	public CheckPrice(WebDriver driver) {
		this.driver = driver;
	}
	public void homeprice() {
		price=driver.findElement(homePagePrice).getText();
		
	}
	public void clickonproduct() {
		driver.findElement(click).click();
	}
	public void productpage() {
		s=driver.findElement(productPagePrice).getText();
	}
	public void validate() {
		Assert.assertEquals(s.substring(0, 4), price);
	}
	public void validatingprice() {
		this.homeprice();
		this.clickonproduct();
		this.productpage();
		this.validate();
	}
}
