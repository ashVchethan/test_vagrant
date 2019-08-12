package testbase.flightbookingtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;
import testbase.TestBase;


public class FlightBookingTest extends TestBase {
    @Test
    public void testThatResultsAppearForAOneWayJourney(){

        //verify that result appears for the provided journey search
        Assert.assertTrue(Pages.flightBookings().flightBooking(),"failed to search");

    }
}
