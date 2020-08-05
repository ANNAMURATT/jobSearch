package jobsInHouston.Pages.Pages;

import jobsInHouston.Pages.Test2.DriverFactory;
import jobsInHouston.Pages.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
    }

    @FindBy(xpath = "//input[@class=\"gLFyf gsfi\"]")
    public WebElement search;


    @FindBy(xpath = "//g-link//span[contains(text(),'Jobs')]")
    public WebElement jobs;

    @FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button']")
    public WebElement play;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchContent;

    @FindBy(xpath = "//*[@id=\"container\"]/ytd-toggle-button-renderer/a")
    public WebElement filterVideos;

    @FindBy(xpath = "(//*[contains(text(),'Upload date')])[2]")
    public WebElement uploadDate;

    @FindBy(xpath = "//a[@id='video-title']")
    public List<WebElement> videoTitle;

    @FindBy(xpath = "//span[@jsname='MdilMe']")
    public WebElement filter;

    @FindBy(xpath = "//span[contains(text(),'Date posted')]")
    public WebElement datePosted;

    @FindBy(xpath = "//div[@data-value='3days']")
    public WebElement threeDay;

    @FindBy(xpath = "//div[@jsname='DVpPy']")
    public List<WebElement> jobList;





}
