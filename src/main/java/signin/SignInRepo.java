package signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import utils.ObjectsBase;

public class SignInRepo extends ObjectsBase {

    public SignInRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//span[contains(text(),\"Your trips\")]")
    protected static WebElement yourTrips;

    @FindBy(xpath = "//input[@id='SignIn']")
    protected static WebElement signinBtn;

    @FindBy(xpath = "//button[@id='signInButton']")
    protected static WebElement signinBtnInIframe;

    @FindBy(xpath = "//div[@id='errors1']//span")
    protected static WebElement errors;

}
