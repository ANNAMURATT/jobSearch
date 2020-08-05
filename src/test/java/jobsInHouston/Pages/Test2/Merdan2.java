package jobsInHouston.Pages.Test2;

import jobsInHouston.Pages.Pages.MainPage;
import jobsInHouston.Pages.utilities.Pages;
import jobsInHouston.Pages.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Merdan2 {


    @BeforeMethod
    public void setup(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("http://www.youtube.com");

    }

    @Test(priority = 1)
    public void merdan1()throws InterruptedException{

        MainPage page = new MainPage();
        page.searchContent.sendKeys("Merdan Jumadurdy");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);

    }

    @Test(priority = 1)
    public void merdan2()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan3()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }


    @Test(priority = 1)
    public void merdan4()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan5()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan6()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan7()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan8()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan9()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan10()throws InterruptedException{

        MainPage page1 = new MainPage();
        page1.searchContent.sendKeys("Merdan Jumadurdy");
        page1.searchContent.submit();
        page1.filterVideos.click();
        page1.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page1.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }
    @AfterMethod
    public void tearDown(){
        DriverFactory.getInstance().removeDriver();
    }
}
