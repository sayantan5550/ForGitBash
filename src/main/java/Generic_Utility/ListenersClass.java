package Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{

	public void onTestStart(ITestResult result) {
	
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		
		Java_Utility jlib = new Java_Utility();
		String date = jlib.getDate();
		
		String testName = name+"--"+date;
		System.out.println(testName);
		
		System.out.println("-----Validation Failure-----");
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		
		
		File dest = new File("./ScreenShot/"+testName+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
