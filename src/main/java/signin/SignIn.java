package signin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utils.Base;



public class SignIn extends Base {
private static SignInRepo sr;
    public SignIn(){sr = new SignInRepo(driver);}


    public String signin(){

        sr.yourTrips.click();
        sr.signinBtn.click();

        //Switching to modal window iframe
        driver.switchTo().frame(driver.findElement(By.name("modal_window")));

       if (isElementVisible(sr.signinBtnInIframe)==true){
           sr.signinBtnInIframe.click();
       }
       //Storing error messages in error variable
        String error = sr.errors.getText();
//       driver.switchTo().defaultContent();

        return error;
    }

}
