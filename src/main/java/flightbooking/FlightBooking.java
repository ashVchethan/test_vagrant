package flightbooking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import utils.Base;

public class FlightBooking extends Base {
    private static FlightBookingRepo fb;
    public FlightBooking(){fb = new FlightBookingRepo(driver);}


    public boolean flightBooking(){

        //waitUntilElementIsVisible() method is inherited from base class, it will wait until element is visible
        waitUntilElementIsVisible(fb.oneWay);
        fb.oneWay.click();
        waitUntilElementIsVisible(fb.fromTag);
        fb.fromTag.click();
        fb.fromTag.clear();
        fb.fromTag.sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin
        waitUntilElementIsVisible(fb.suggestionsFromTag);
        fb.suggestionsFromTag.click();
        fb.toTag.click();
        fb.toTag.clear();
        fb.toTag.sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination
        waitUntilElementIsVisible(fb.suggestionsToTag.get(0));
        fb.suggestionsToTag.get(0).click();
        fb.pickDate.click();

        //all fields filled in. Now click on search
        fb.searchBtn.click();

        return isElementVisible(fb.searchSummary);

    }


}
