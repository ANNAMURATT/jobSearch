package jobsInHouston.Pages.Tests;

import jobsInHouston.Pages.Pages.MainPage;
import jobsInHouston.Pages.Test2.DriverFactory;
import jobsInHouston.Pages.utilities.ConfigurationReader;
import jobsInHouston.Pages.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JobSearchTest {

    @BeforeMethod
    public void setup(){
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("http://www.youtube.com");

    }
    @Test(priority = 1)
    public void cinderella1()throws InterruptedException{

        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella2()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella3()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella4()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella5()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }


    @Test(priority = 1)
    public void cinderella6()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella7()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(620000);

    }

    @Test(priority = 1)
    public void cinderella8()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella9()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella10()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella11()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella12()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella13()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella14()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella15()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(620000);

    }

    @Test(priority = 1)
    public void cinderella16()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella17()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella18()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella19()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella20()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella21()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }


    @Test(priority = 1)
    public void cinderella22()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella24()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(620000);

    }

    @Test(priority = 1)
    public void cinderella25()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }
    @Test(priority = 1)
    public void cinderella26()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella27()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella28()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella29()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella30()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }


    @Test(priority = 1)
    public void cinderella31()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella32()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella33()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella34()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella35()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella36()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella37()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella38()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella39()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }
    @Test(priority = 1)
    public void cinderella40()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella41()throws InterruptedException{

        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella42()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(200000);

    }

    @Test(priority = 1)
    public void cinderella43()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella44()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella45()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }


    @Test(priority = 1)
    public void cinderella46()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella47()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella48()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella49()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella50()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella51()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella52()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella53()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella54()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella55()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella56()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella57()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella58()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella59()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella601()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(610000);

    }

    @Test(priority = 1)
    public void cinderella61()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }


    @Test(priority = 1)
    public void cinderella62()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }

    @Test(priority = 1)
    public void cinderella63()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella65()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }
    @Test(priority = 1)
    public void cinderella66()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella67()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella68()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella69()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(550000);

    }

    @Test(priority = 1)
    public void cinderella60()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(560000);

    }


    @Test(priority = 1)
    public void cinderella71()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(570000);

    }

    @Test(priority = 1)
    public void cinderella72()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella73()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella74()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella75()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella76()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @Test(priority = 1)
    public void cinderella77()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }

    @Test(priority = 1)
    public void cinderella78()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(580000);

    }

    @Test(priority = 1)
    public void cinderella79()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(590000);

    }
    @Test(priority = 1)
    public void cinderella80()throws InterruptedException{
        MainPage page = new MainPage();
        page.searchContent.sendKeys("Cinderella Story For children");
        page.searchContent.submit();
        page.filterVideos.click();
        page.uploadDate.click();

        Thread.sleep(2000);
        List <WebElement> videos = page.videoTitle;

        for(WebElement element:videos){
            if (element.getText().contains("Cinderella Story|For children")){
                element.click();
            }
        } Thread.sleep(600000);

    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.getInstance().removeDriver();
    }

}
