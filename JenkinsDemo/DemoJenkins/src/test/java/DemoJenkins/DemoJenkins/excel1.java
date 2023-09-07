package DemoJenkins.DemoJenkins;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel1 {
	@DataProvider(name="datapro")
	String[][] readExcel() throws BiffException, IOException
    {    //input stream object creation
        FileInputStream excel= new FileInputStream("C:\\Users\\pcpatil\\Downloads//Book-6.xls");
        //getting workbook,sheet,rows and col
        Workbook workbook=Workbook.getWorkbook(excel);
        Sheet sheet=workbook.getSheet(0);
        int row_count=sheet.getRows();
        int col_count=sheet.getColumns();
        //create 2d array
        String[][] data1=new String[row_count-1][col_count];
        for(int i=1;i<row_count;i++)//row iteration
        {
        	for(int j=0;j<col_count;j++)//column iteration
        	{
        		data1[i-1][j]=sheet.getCell(j,i).getContents();//getcell(columns,row)
        }
    }
    return data1;  
}
	@Test(dataProvider="datapro")
    void LoginUsingJXL(String uname1,String pwd1) throws Exception{  
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.name("username"));
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		uname.sendKeys(uname1);
		pwd.sendKeys(pwd1);
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	
	}
}
