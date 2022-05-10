package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='search-header__title']")
    WebElement resultText;


    public String getSearchResultText() {
        String message = getTextFromElement(resultText);
        return message;
    }

    public void verifyTheResults(String expected) {
        String expectedMessage = expected;
        String actualMessage = getSearchResultText();
        Assert.assertEquals(expectedMessage, actualMessage, "Result page not displayed");
        CustomListeners.test.log(Status.PASS, "Get Job Search Result text : " + resultText.getText());
        Reporter.log("Get Job Search Result text : " + resultText.getText() + "<br>");
    }
}
