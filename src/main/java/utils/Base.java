package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Base class is to store reusable codes
public class Base {
    public static long wait=60;
    public static RemoteWebDriver driver;


    //this method is to check whether element is visible
    public static boolean isElementVisible(WebElement element) {
        try{
            if(element.isDisplayed())
                return true;
            return false;
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            return false;
        }
    }

    //Always use this Explicit wait until the visibility of an element
    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

    //Do not use sleep unless the web page waits for static timer
    public static void sleep(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
