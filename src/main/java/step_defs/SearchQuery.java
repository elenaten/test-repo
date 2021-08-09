package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.SearchPage;
import utilities.DriverBrainpop;

public class SearchQuery {

    WebDriver driver = DriverBrainpop.getDriver();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();

    @Given("^Given the User is on the brainpop homepage$")
    public void givenTheUserIsOnTheBrainpopHomepage() {

    }
    @And("^enters the correct credential to \"([^\"]*)\"$")
        public void entersTheCorrectCredentialTo(String inputs) {

        loginPage.LoginButton.click();
        loginPage.usernameInput.sendKeys("qatest2021");
        loginPage.passwordInput.sendKeys("brainp0p");
        loginPage.submitButton.click();
    }

    @When("^the user inputs \"([^\"]*)\" in the Search box$")
    public void theUserInputsInTheSearchBox(String searchField) {
        searchPage.searchField.click();
        searchPage.searchField.sendKeys("Challenge");

    }

    @And("^clicks on Search button$")
    public void clicksOnSearchButton() {
        searchPage.searchButton.click();

    }

    @Then("^the user should see Search Results$")
    public void the_user_should_see_Search_Results()  {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(searchPage.searchResultTitle));
        Assert.assertTrue("Search results are shown", searchPage.searchResultTitle.isDisplayed());
    }


    @Then("^the user should see the total amount of topics$")
    public void theUserShouldSeeTheTotalAmountOfTopics() {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(searchPage.amount));
       Assert.assertTrue("total number of topics are shown", searchPage.amount.isDisplayed());

    }


    @Then("^the user should see message no topics found$")
    public void theUserShouldSeeMessageNoTopicsFound() {
//        WebDriverWait wait = new WebDriverWait(driver,3000);
//        wait.until(ExpectedConditions.visibilityOf(searchPage.amount));

        System.out.println(searchPage.noTopicFoundMessage.getText());
        //Assert.assertTrue("no topic found message", searchPage.noTopicFoundMessage.getText().contains("No topics found with "));
        Assert.assertTrue("no topic found message", searchPage.noTopicFoundMessage.isDisplayed());



    }

//    @And("^click on DNA topic$")
//    public void clickOnDNATopic() {
//        searchPage.DNATopic.click();
//
//    }

//    @And("^redirected to the DNA homepage$")
//    public void redirectedToTheDNAHomepage() {
//        WebDriverWait wait = new WebDriverWait(driver,3000);
//        wait.until(ExpectedConditions.visibilityOf(searchPage.DNAHomepage));
//        Assert.assertTrue("Not redirected to DNA homepage", searchPage.DNAHomepage.getText().contains("path to DNA discovery"));
//
//    }
}
