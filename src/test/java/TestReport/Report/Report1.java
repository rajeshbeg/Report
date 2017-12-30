package TestReport.Report;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report1 {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest log;
	@Test
	public void clas1()
	{
		extent= new ExtentReports("C:\\Users\\Rajesh_B\\workspace\\Report\\Reports\\TestResults3.html",true);
		log=extent.startTest("Case1");
		System.out.println("This is case1 in report 1");
		log.log(LogStatus.PASS, "case 1 is pass");
		extent.endTest(log);
		extent.flush();
	}
	@Test
	public void clas3()
	{
		
		log=extent.startTest("Case3");
		System.out.println("This is case3 in report 1");
		log.log(LogStatus.PASS, "case 3 is pass");
		extent.endTest(log);
		extent.flush();
	}

}
