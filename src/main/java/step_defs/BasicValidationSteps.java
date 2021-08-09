package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utilities.DriverBrainpop;
import utilities.EnvironmentManager;

public class BasicValidationSteps {


    WebDriver driver = DriverBrainpop.getDriver();
BasePage basePage = new BasePage();

    @Given("^the User is on the brainpop homepage$")
    public void the_User_is_on_the_brainpop_homepage()  {
        driver.get(EnvironmentManager.baseUrl);
    }

    @Then("^verify the title contains mainSign$")
    public void verifyTheTitleContainsMainSign() {

        String actualTitle = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(basePage.mainSign));
        Assert.assertTrue("you are on brainPop website", basePage.mainSign.isDisplayed());

    }

        @Then("^verify the URL contains \"([^\"]*)\"$")
    public void verify_the_URL_contains(String expectedUrl) {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertTrue(actualUrl.equals(expectedUrl));

    }


}
