package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;


@Listeners(CustomListeners.class)
public class JobSearchTest extends TestBase {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod (alwaysRun = true)
    public void initialize(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test (dataProvider = "JobSearch", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(
            String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        homePage.setAcceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOption();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults(result);
    }

}
