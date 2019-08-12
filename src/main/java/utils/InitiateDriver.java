package utils;

import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


//Initiate driver is to launch the browser, we call this class in TestBase class under testbase package
public class InitiateDriver {
    private RemoteWebDriver driver;

    //This constructor will be invoked when the object of the class is created in TestBase class
    public InitiateDriver(){
        try {

            //setDriverPath();

            //Taking Remote webdriver server URL value from the congig.properties file
            FileInputStream file = new FileInputStream("/Users/ashwi/Downloads/booking/src/main/resources/config.properties");
            Properties prop = new Properties();
            prop.load(file);
            String seleniumServer = prop.getProperty("SELENIUMSERVERURL");
            DesiredCapabilities capabilities =  DesiredCapabilities.chrome();

            //For firefox browser
           // DesiredCapabilities capabilities =  DesiredCapabilities.firefox();

            //using RemoteWebdriver, Need to start Remotewebdriver server in port number 4444 in your local machine.
            driver = new RemoteWebDriver(new URL(seleniumServer),capabilities);

            //Did not use Chromdriver
           // WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    //This method will be called if driver is not instantiated
    public RemoteWebDriver getDriver()
    {
        if(driver==null)
            throw new RuntimeException("Driver has not been Instantiated");

        return driver;
    }


    //Not required, since I have used Remote Webdriver
    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

}
