package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverBrainpop;

public class DnaPage {

    public DnaPage() {

        PageFactory.initElements(DriverBrainpop.getDriver(), this);
    }



    @FindBy(xpath = "//button[@id='play']")
    public WebElement playButton;

    @FindBy(xpath = "//time[@id='time-elapsed']")
    public WebElement videoTimer;

    @FindBy(xpath = "//button[@id='fullscreen']")
    public WebElement fullScreenButton;

    @FindBy(xpath = "//button[@id='settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//button[@id='pause']")
    public WebElement pauseButton;

    @FindBy(xpath = "//button[@id='caption']")
    public WebElement captionButton;
}
