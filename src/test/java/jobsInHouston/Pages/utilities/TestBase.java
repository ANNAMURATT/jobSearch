package jobsInHouston.Pages.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;
    protected Pages pages;

    protected static ExtentReports report;
    private static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;

    @BeforeMethod (alwaysRun = true)

    public void setupMethod() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        pages = new Pages();
        driver.get(ConfigurationReader.getProperty("url"));
//        driver.get("https://www.youtube.com");
    }

    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        // if any test fails, it can detect it,
        // take a screen shot at the point and attach to report
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
            extentLogger.fail(result.getName());
            extentLogger.addScreenCaptureFromPath(screenshotLocation);
            extentLogger.fail(result.getThrowable());

        } else if (result.getStatus() == ITestResult.SKIP) {
            extentLogger.skip("Test Case Skipped: " + result.getName());
        }
        //Driver.closeDriver();
    }

    @BeforeTest (alwaysRun = true)
    public void setUpTest() {
        report = new ExtentReports();
        // this is our custom location of the report that will be generated
        // report will be generated in the current project inside folder: test-output
        // report file name: report.html
        String filePath = System.getProperty("user.dir") + "/test-output/report.html";

//        windows users pls correct ur path:
//        String filePath = System.getProperty("user.dir") + "\\test-output\\report.html";

        // initialize the htmlReporter with the path to the report
        htmlReporter = new ExtentHtmlReporter(filePath);

        // we attach the htmlreport to our report
        report.attachReporter(htmlReporter);

        report.setSystemInfo("Environment", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

        report.setSystemInfo("QA Engineer", "Annamurat");

        htmlReporter.config().setDocumentTitle("Job Search Reports");
        htmlReporter.config().setReportName("Job Search Automated Test Reports");

//        htmlReporter.config().setTheme(Theme.DARK);

    }

    @AfterTest (alwaysRun = true)
    public void tearDownTest() {
        report.flush();
        driver.close();
    }
}
