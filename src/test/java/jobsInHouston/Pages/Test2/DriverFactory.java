package jobsInHouston.Pages.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{

   private DriverFactory()
   {
      //Do-nothing..Do not allow to initialize this class from outside

   }

   private static DriverFactory instance = new DriverFactory();

   public static DriverFactory getInstance()
   {
      return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() {
      @Override
      protected WebDriver initialValue()
      {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\gundo\\.m2\\repository\\webdriver\\chromedriver\\win32\\83.0.4103.39\\chromedriver.exe");
         return new ChromeDriver(); // can be replaced with other browser drivers
      }
   };

   public WebDriver getDriver() // call this method to get the driver object and launch the browser
   {
      return driver.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
      driver.get().quit();
      driver.remove();
   }
}