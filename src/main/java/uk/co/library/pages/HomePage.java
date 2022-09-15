package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage (){
        PageFactory.initElements(driver, this);
    }

    public void acceptCookiesandSwitchToiFrame() throws InterruptedException { // also made in Utility at the end but dont know how to call it

        driver.switchTo().frame("gdpr-consent-notice"); // just take iFram id as id is normally unique
        Thread.sleep(1000);
        WebElement acceptCookies = driver.findElement(By.xpath("//button//span[text()='Accept All"));
        acceptCookies.click();
    }
//    public void acceptCookies () throws InterruptedException {
//        WebElement frame7 = driver.findElement(By.id("gdpr-consent-notice"));
//        driver.switchTo().frame(frame7);
//        Thread.sleep(1000);
//        WebElement acceptCookie = driver.findElement(By.xpath("//button[@id='save']/span[1]/div[1]/span[1]"));
//        acceptCookie.click();
//    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='keywords']")
    WebElement jobtitleField;

    @CacheLookup
    @FindBy (xpath = "//input[@id='location']")
    WebElement locationField;

    @CacheLookup
    @FindBy (xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy (xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;

    @CacheLookup
    @FindBy (xpath = "//input[@id='salarymin']")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy (xpath = "//input[@id='salarymax']")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy (xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy (xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;


    @CacheLookup
    @FindBy (xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;



    public void clickOnFindJobsButton (){
        clickOnElement(findJobs);
    }

    public void selectJobTypeDropDown (String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void selectSalaryType (String salaryType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
    }

    public void enterSalaryMax (String salaryMax){
        sendTextToElement(salaryMaxField, salaryMax);
    }
    public void enterSalaryMin (String salaryMin){
        sendTextToElement(salaryMinField, salaryMin);
    }

    public void clickOnMoreSearchOptionsLink (){

        clickOnElement(moreSearchOption);
    }

    public void selectDistance (String distance){
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void enterLocation (String location) throws InterruptedException {
        clickOnElement(locationField);
        Thread.sleep(1000);
        sendTextToElement(locationField, location);
    }
    public void enterJobTitle (String jobTitle){
        sendTextToElement(jobtitleField, jobTitle);
    }
}
