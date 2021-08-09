package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverBrainpop;
import utilities.EnvironmentManager;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverBrainpop.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    public static WebElement LoginButton;

    @FindBy(xpath = "//input[@id='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[contains(text(),'qatest2021')]")
    public WebElement userName;

    @FindBy(xpath = "//div[@id='login-error']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


    public void signIn() {
        LoginButton.click();
        usernameInput.sendKeys(EnvironmentManager.username);
        passwordInput.sendKeys(EnvironmentManager.password);
        submitButton.click();

    }


}
