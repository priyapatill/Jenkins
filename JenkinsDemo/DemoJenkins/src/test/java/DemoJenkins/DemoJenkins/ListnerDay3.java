package DemoJenkins.DemoJenkins;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDay3 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Program started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Program Completed");
	}

}
