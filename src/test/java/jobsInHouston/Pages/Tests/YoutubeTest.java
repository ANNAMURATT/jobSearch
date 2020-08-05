package jobsInHouston.Pages.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import jobsInHouston.Pages.Pages.MainPage;
import jobsInHouston.Pages.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class YoutubeTest {

     WebDriver driver;
     WebDriver driver1;
     WebDriver driver3;
     WebDriver driver4;
     WebDriver driver5;
     WebDriver driver6;
     WebDriver driver7;
     WebDriver driver8;
     WebDriver driver9;
     WebDriver driver10;
    MainPage mainPage = new MainPage();


    @Test(priority = 1)
    public void cinderella1()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver.findElement(By.xpath("//input[@id='search']")).submit();
        driver.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver.close();

    }

    @Test(priority = 1)
    public void cinderella2()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.get("https://www.youtube.com");
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver1.findElement(By.xpath("//input[@id='search']")).submit();
        driver1.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver1.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver1.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver1.close();
    }

    @Test(priority = 1)
    public void cinderell3()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver3 = new ChromeDriver();
        driver3.get("https://www.youtube.com");
        driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver3.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver3.findElement(By.xpath("//input[@id='search']")).submit();
        driver3.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver3.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver3.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver3.close();
    }

    @Test(priority = 1)
    public void cinderella4()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver4 = new ChromeDriver();
        driver4.get("https://www.youtube.com");
        driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver4.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver4.findElement(By.xpath("//input[@id='search']")).submit();
        driver4.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver4.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver4.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver4.close();
    }

    @Test(priority = 1)
    public void cinderella5()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver5 = new ChromeDriver();
        driver5.get("https://www.youtube.com");
        driver5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver5.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver5.findElement(By.xpath("//input[@id='search']")).submit();
        driver5.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver5.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver5.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver5.close();
    }

    @Test(priority = 1)
    public void cinderella6()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver6 = new ChromeDriver();
        driver6.get("https://www.youtube.com");
        driver6.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver6.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver6.findElement(By.xpath("//input[@id='search']")).submit();
        driver6.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver6.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver6.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver6.close();
    }

    @Test(priority = 1)
    public void cinderella7()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver7 = new ChromeDriver();
        driver7.get("https://www.youtube.com");
        driver7.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver7.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver7.findElement(By.xpath("//input[@id='search']")).submit();
        driver7.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver7.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver7.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver7.close();
    }
    @Test(priority = 1)
    public void cinderella8()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver8 = new ChromeDriver();
        driver8.get("https://www.youtube.com");
        driver8.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver8.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver8.findElement(By.xpath("//input[@id='search']")).submit();
        driver8.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver8.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver8.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver8.close();
    }

    @Test(priority = 1)
    public void cinderella9()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver9 = new ChromeDriver();
        driver9.get("https://www.youtube.com");
        driver9.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver9.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver9.findElement(By.xpath("//input[@id='search']")).submit();
        driver9.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver9.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver1.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);
        driver9.close();
    }

    @Test(priority = 1)
    public void cinderella10()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        driver10 = new ChromeDriver();
        driver10.get("https://www.youtube.com");
        driver10.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver10.findElement(By.xpath("//input[@id='search']")).sendKeys("Cinderella Story For children");
        driver10.findElement(By.xpath("//input[@id='search']")).submit();
        driver10.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/a")).click();
        driver10.findElement(By.xpath("(//*[contains(text(),'Upload date')])[2]")).click();

        Thread.sleep(2000);
        List <WebElement> videos = driver10.findElements(By.xpath("//a[@id='video-title']"));

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);

        driver10.close();
    }


}
