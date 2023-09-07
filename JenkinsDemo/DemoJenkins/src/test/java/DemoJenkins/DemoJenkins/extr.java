package DemoJenkins.DemoJenkins;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class extr {
	static ExtentTest test;
	static ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	String sstloc="C:\\Users\\pcpatil\\Desktop//scrsht.png";
	@BeforeClass
	public void startReport() {
		//creating html, extent obj
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\pcpatil\\Desktop\\report\\Myreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//configuration items to change the look and feel
		//add content, manage tests etc
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Simple Automation Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	@Test
	public void t1() {
		test = extent.createTest("Test Case 1", "The test case 1 has passed");
		Assert.assertTrue(true);		
	}
	@Test
	public void t4() {
		test = extent.createTest("Test Case 4", "The test case 1 has passed");
		Assert.assertTrue(true);		
	}
	@Test
	public void t2() {
		test = extent.createTest("Test Case 2", "The test case 2 has failed");
		Assert.assertTrue(false);		
	}
	@Test
	public void t3() {
		test = extent.createTest("Test Case 3", "The test case 2 has been skipped");
		throw new SkipException("The test has been skipped");		
	}
	@AfterMethod
	public void getResult(ITestResult result) throws AWTException, IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			screencapture(sstloc);
			test.log(Status.FAIL, result.getThrowable());
			test.addScreenCaptureFromPath(sstloc);
		} else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, result.getTestName());			
		} else {
			test.log(Status.SKIP, result.getTestName());
		}
	}
	void screencapture(String sstloc1) throws AWTException, IOException {
		Robot robot= new Robot();
		Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(scr_size);
		BufferedImage scrshot=robot.createScreenCapture(rect);
		File dest=new File(sstloc1);
		ImageIO.write(scrshot, "png", dest);
	}
	@AfterTest
	public void tearDown(){
		//to write or update test information to reporter
		extent.flush();		
	}
}
