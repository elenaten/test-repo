package step_defs;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.PlayerPage;
import pages.SearchPage;
import utilities.DriverBrainpop;

import javax.swing.*;

public class Player {

    WebDriver driver = DriverBrainpop.getDriver();
   PlayerPage playerPage = new PlayerPage();


    @When("^the user should see the \"([^\"]*)\" topic$")
    public void theUserShouldSeeTheTopic(String arg0)  {
        Assert.assertTrue("DNA topic is shown", playerPage.DNAtopic.isDisplayed());
    }

    @When("^clicks on \"([^\"]*)\" topic$")
    public void clicks_on_topic(String arg1) {
        playerPage.DNAtopic.click();
    }


    @Then("^the user should redirect to DNA homepage$")
    public void theUserShouldRedirectToDNAHomepage() {
        driver.navigate().to("https://www.brainpop.com/health/geneticsgrowthanddevelopment/dna/");
        Assert.assertTrue("DNA homepage", playerPage.DNAhomepage.isDisplayed());
    }

    @Then("^should be able to see the video Player$")
    public void should_be_able_to_see_the_video_Player() {
        Assert.assertTrue("video is shown", playerPage.videoplayerPanel.isDisplayed());
    }




    //play Pause button

    @When("^the user clicks on the play button$")
    public void theUserClicksOnThePlayButton() {
        playerPage.playButton.click();
    }

    @And("^see video playing$")
    public void seeVideoPlaying() {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(playerPage.playButton));
        Assert.assertTrue("play button", playerPage.playButton.isEnabled());
    }


    @Then("^the user clicks on the pause button$")
    public void theUserClicksOnThePauseButton() {
        playerPage.pauseButton.click();
    }

    @And("^see video on pause$")
    public void seeVideoOnPause() {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(playerPage.pauseButton));
        Assert.assertTrue("pause button", playerPage.pauseButton.isEnabled());

    }


    //Captions
    @When("^the user turns on the captions button$")
    public void theUserTurnsOnTheCaptionsButton() {
        playerPage.captionButton.click();
    }

    @Then("^verify that the user will be able to see subtitles$")
    public void verifyThatTheUserWillBeAbleToSeeSubtitles() {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(playerPage.captions));
        Assert.assertTrue("pause button", playerPage.captions.isDisplayed());

    }

    @When("^the user turns off the captions button$")
    public void theUserTurnsOffTheCaptionsButton() {
        playerPage.captionButton.click();
    }

    @Then("^verify that the user will not see subtitles$")
    public void verifyThatTheUserWillNotSeeSubtitles() {
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(ExpectedConditions.visibilityOf(playerPage.captions));
        Assert.assertFalse("captions still shown", playerPage.captions.isEnabled());
    }
}
