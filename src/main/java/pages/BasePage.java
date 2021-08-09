package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverBrainpop;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverBrainpop.getDriver(), this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Keep Creating “Aha!” Moments Together')]")
    public WebElement mainSign;


//    @FindBy(xpath = "//input[@id='search-input-_7nbe7z4ld']")
//    public WebElement searchField;






    @FindBy(xpath = "//button[@class='button-wrapper medium VIDEO_PLAYER_DEFAULT active']")
    public WebElement captionON;
    @FindBy(xpath = "//button[@class='button-wrapper medium VIDEO_PLAYER_DEFAULT']")
    public WebElement captionOFF;



    @FindBy(xpath = "//div[contains(text(),'Related Reading')]")
    public WebElement relatedReadingFeature;





}
