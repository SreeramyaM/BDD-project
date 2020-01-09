package TestRunner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", // features file
		plugin = { "html:target/cucumber-html-report", // html report
				"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", // text report
				"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml", // xml report
				"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json", // Report
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},// Extent
																													
		glue= {"step_definitions"},
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false, // to check the mapping is proper between feature file and step def file

		tags = {"@smoke123456"} 

//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest		
)
public class RunCukesTest {
	
	@BeforeClass
	public static void beforeclass() throws Exception {
		//MyScreenRecorder.startRecording("ImagenecsiTesting");			     
	}

	@AfterClass()
	public static void setup() throws Exception {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		// Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "Srinivas");
		Reporter.setSystemInfo("Application Name", "ImageneCsi ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "QA");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
		//MyScreenRecorder.stopRecording();
		//EmailReport.EmilTest();		
	     
	}
		

}
