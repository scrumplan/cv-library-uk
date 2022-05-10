package uk.co.library.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "keywords")
    WebElement jobTitleField;


    @FindBy(id = "location")
    WebElement locationField;


    @FindBy(id = "distance")
    WebElement distanceDropDown;


    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salarymin")
    WebElement salaryMin;


    @FindBy(id = "salarymax")
    WebElement salaryMax;


    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;


    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;


    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;


    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;


    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;


    public void setAcceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter Job Title '" + jobTitle + "' to job title field.");
        Reporter.log("Enter Job Title : '" + jobTitle + "' Job title field" + "<br>");
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
        CustomListeners.test.log(Status.PASS, "Enter location '" + location + "' to location field.");
        Reporter.log("Enter location : '" + location + "' location field" + "<br>");
    }

    public void selectDistance(String distance) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "Select distance '" + distance + "' from dropdown. ");
        Reporter.log("Select distance : '" + distance + "' distance field" + "<br>");
    }

    public void clickOnMoreSearchOption() {
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Click on 'More Search Option' Link ");
        Reporter.log("Click on 'More Search Option' Link" + "<br>");

    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Enter minimum salary '" + minSalary + "' to Salary Min. field ");
        Reporter.log("Enter minimum salary : '" + salaryMin + "' Salary Min. field" + "<br>");
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter maximum salary '" + maxSalary + "' to Salary Max. field ");
        Reporter.log("Enter maximum salary : '" + salaryMax + "' Salary Max. field" + "<br>");
    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
        CustomListeners.test.log(Status.PASS, "Select salary type '" + salaryType + "' from dropdown ");
        Reporter.log("Select salary type : '" + salaryType + "' from dropdown" + "<br>");
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "Enter maximum salary '" + jobType + "' to Salary Max. field ");
        Reporter.log("Select distance : '" + jobType + "' distance field" + "<br>");
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "Click on 'Find Job' Button");
        Reporter.log("More Search Options' link" + "<br>");
    }
}
