package TestReport.Report;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report2 {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest log;
	@Test
	public void clas2()
	{
		extent= new ExtentReports("C:\\Users\\Rajesh_B\\workspace\\Report\\Reports\\TestResults1.html",true);
		log=extent.startTest("Case2");
		System.out.println("This is case2 in report 2");
		log.log(LogStatus.PASS, "case 2 is pass");
		extent.endTest(log);
		extent.flush();
	}

}
