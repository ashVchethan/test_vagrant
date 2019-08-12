package hotelbooking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import utils.Base;

public class HotelBooking extends Base {
    private static HotelBookingRepo hb;
    public HotelBooking(){hb = new HotelBookingRepo(driver);}

 public boolean hotelBooking(){

     hb.hotels.click();
     waitUntilElementIsVisible(hb.localityTextBox);
     hb.localityTextBox.sendKeys("Indiranagar, Bangalore");
     new   Select(hb.travellerSelection).selectByVisibleText("1 room, 2 adults");
     hb.searchButton.click();

        return true;
 }



}
