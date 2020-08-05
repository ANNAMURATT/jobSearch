package jobsInHouston.Pages.Tests;

import jobsInHouston.Pages.Pages.MainPage;
import jobsInHouston.Pages.Test2.DriverFactory;
import jobsInHouston.Pages.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Merdan {

    @BeforeMethod
    public void setup(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("http://www.youtube.com");

    }

    @Test(priority = 1)
    public void merdan1()throws InterruptedException{
        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);

    }

    @Test(priority = 1)
    public void merdan2()throws InterruptedException{
        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan3()throws InterruptedException{
        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan4()throws InterruptedException{
        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan5()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan6()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan7()throws InterruptedException{
        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }
    @Test(priority = 1)
    public void merdan8()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan9()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan10()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan11()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan12()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan13()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan14()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan155()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan15()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan16()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan17()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan18()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan19()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Merdan Jumadurdy - Saña gül bermäge geldim")){
                element.click();
            }
        } Thread.sleep(200000);
    }

    @Test(priority = 1)
    public void merdan20()throws InterruptedException{

        MainPage pages = new MainPage();
        pages.searchContent.sendKeys("Merdan Jumadurdy");
        pages.searchContent.submit();
        pages.filterVideos.click();
        pages.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = pages.videoTitle;

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
