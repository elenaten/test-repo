package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.DriverBrainpop;


import java.sql.Driver;

public class LoginFlow {

   WebDriver driver = DriverBrainpop.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("^User enter the correct credential to \"([^\"]*)\"$")
    public void user_enter_the_correct_credential_to(String arg1){
        loginPage.LoginButton.click();
        loginPage.usernameInput.sendKeys("qatest2021");
        loginPage.passwordInput.sendKeys("brainp0p");
        loginPage.submitButton.click();

    }

    @Then("^User should be able to \"([^\"]*)\"$")
    public void user_should_be_able_to(String loginValidation)  {
        Assert.assertTrue("Successfully Logged In", loginPage.userName.getText().contains("qatest2021"));

    }

    @Given("^User enter the incorrect credential to \"([^\"]*)\"$")
    public void user_enter_the_incorrect_credential_to(String arg1){
        loginPage.LoginButton.click();
        loginPage.usernameInput.sendKeys("qatest2029");
        loginPage.passwordInput.sendKeys("brainP0p");
        loginPage.submitButton.click();
    }

    @Then("^User should be see the error message$")
    public void user_should_be_see_the_error_message() {
        WebDriverWait wait = new WebDriverWait(driver,4000);
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));
        Assert.assertTrue("Unsuccessful Log In", loginPage.errorMessage.isDisplayed());
    }

    @Then("^User should be able to see \"([^\"]*)\" button$")
    public void userShouldBeAbleToSeeButton(String button)  {
        Assert.assertTrue( "Login button is absent", LoginPage.LoginButton.isDisplayed());
    }
}

