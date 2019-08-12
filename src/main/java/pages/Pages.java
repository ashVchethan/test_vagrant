package pages;

import flightbooking.FlightBooking;
import hotelbooking.HotelBooking;
import signin.SignIn;
import utils.Base;

public class Pages {
    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) { //make sure you use JDK 1.8
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return page;
    }

    public static SignIn signIn(){return getPage(SignIn.class);}
    public static HotelBooking hotelBookings(){return getPage(HotelBooking.class);}
    public static FlightBooking flightBookings(){return getPage(FlightBooking.class);}

}
