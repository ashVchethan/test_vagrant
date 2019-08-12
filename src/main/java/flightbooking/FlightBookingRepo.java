package flightbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import utils.ObjectsBase;

import java.util.List;

public class FlightBookingRepo extends ObjectsBase {

    public FlightBookingRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//input[@id='OneWay']")
    protected static WebElement oneWay;

    @FindBy(xpath = "//input[@id='FromTag']")
    protected static WebElement fromTag;

    //@FindBy(xpath = "//ul[@id=\"ui-id-1\"]//li")
    //protected static List<WebElement> suggestionsFromTag;

    @FindBy(xpath = "//a[contains(text(),'Bangalore, IN - Kempegowda International Airport (BLR)')]")
    protected static WebElement suggestionsFromTag;

    @FindBy(xpath = "//input[@id='ToTag']")
    protected static WebElement toTag;

    @FindBy(xpath = "//ul[@id=\"ui-id-2\"]//li")
    protected static List<WebElement> suggestionsToTag;

    @FindBy(xpath = "(//a[contains(@class,'ui-state-default')][contains(text(),'18')])[1]")
    protected static WebElement pickDate;

    @FindBy(xpath = "//input[@id='SearchBtn']")
    protected static WebElement searchBtn;

    @FindBy(xpath = "//div[@class=\"searchSummary\"]")
    protected static WebElement searchSummary;


}
