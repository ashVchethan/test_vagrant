package hotelbooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import utils.ObjectsBase;

public class HotelBookingRepo  extends ObjectsBase {

    public HotelBookingRepo(RemoteWebDriver driver){super(driver);}

    @FindBy(xpath = "//li[contains(@class,'hotelApp')]//a[contains(text(),'Hotels')]")
    protected static WebElement hotels;

    @FindBy(xpath = "//input[@placeholder=\"Enter Locality, Landmark, City or Hotel\"]")
    protected static WebElement localityTextBox;

    @FindBy(id = "travellersOnhome")
    protected WebElement travellerSelection;

    @FindBy(xpath = "//input[@id=\"SearchHotelsButton\"]")
    protected static WebElement searchButton;

}
