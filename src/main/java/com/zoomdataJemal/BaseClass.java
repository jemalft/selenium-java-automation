package com.zoomdataJemal;

import com.zoomdataJemal.DriverFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by jemal on 11/12/17.
 */
public class BaseClass extends BrowserFactory {

    public static WebDriver driver = GetBrowser("chrome");

    static String url = "http://localhost:8080/zoomdata/login";
    static String ExpectedTitle = "Login";

    public void goTo() {
        driver.get(url);
    }

    @AfterClass
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }

}
