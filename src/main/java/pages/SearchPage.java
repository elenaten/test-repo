package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverBrainpop;

public class SearchPage {
    public SearchPage (){ PageFactory.initElements(DriverBrainpop.getDriver(), this);}

    @FindBy(xpath = "//input[@placeholder='Search BrainPOP']")
    public WebElement searchField;

    @FindBy(xpath = "//button[starts-with(@id,'search-button')]")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[contains(text(),'Search Results')]")
    public WebElement searchResultTitle;


    @FindBy(xpath = "//span[@class='topics_results_number']")
    public WebElement totalNumberOfTopics;

    @FindBy(xpath = "//span[contains(text(),'422')]")
    public WebElement amount;

    //div[contains(text(),'No topics found with')]
    //div[contains(@class,'container-fluid no_results_container') and contains(text(),'No topics found with')]
    //div[@id='no_topic_results']/*[1]
    @FindBy(xpath = "//div[@id='no_topic_results']/*[1]")
    public WebElement noTopicFoundMessage;


    @FindBy(xpath = "//div[contains(text(),'DNA')]")
    public WebElement DNATopic;

    @FindBy(xpath = "//div[contains(text(),'path to DNA discovery')]")
    public WebElement DNAHomepage;


}
