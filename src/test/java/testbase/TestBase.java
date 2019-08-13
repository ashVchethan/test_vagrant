package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.Base;
import utils.InitiateDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected RemoteWebDriver driver;
    //protected WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void setup(){
    InitiateDriver initiateDriver = new InitiateDriver();
    driver = initiateDriver.getDriver();
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    Base.driver = driver;
    driver.get("https://www.cleartrip.com/");

    }

    @AfterTest(alwaysRun = true)
    //close the browser
    public void quitTheBrowser()
    {
        driver.quit();
    }

}
