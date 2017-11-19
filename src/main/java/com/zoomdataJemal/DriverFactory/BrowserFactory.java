package com.zoomdataJemal.DriverFactory;

/**
 * Created by jemal on 10/14/17.
 */
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class BrowserFactory {

    public static WebDriver GetBrowser(String browserName) {
        browserName = browserName.toLowerCase();

        if(browserName.equals("chrome"))
            return getChromeInstance();

        if(browserName.equals("edge"))
            return getEdgeInstance();

        if(browserName.equals("ie"))
            return getIEInstance();
        if(browserName.equals("phantomjs"))
            return getPhantomJSInstance();

        if(browserName.equals("opera"))
            return getOperaInstance();
        else
            return getFFInstance();
    }

    private static FirefoxDriver getFFInstance() {

        FirefoxDriverManager.getInstance().setup();
        FirefoxDriver driver=new FirefoxDriver();
        return driver;
    }

    public static ChromeDriver getChromeInstance() {

        ChromeDriverManager.getInstance().setup();


        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("credentials_enable_service", false);
        prefs.put("password_manager_enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }


    private static InternetExplorerDriver getIEInstance() {

        InternetExplorerDriverManager.getInstance().setup();
        InternetExplorerDriver driver=new InternetExplorerDriver();
        return driver;
    }

    private static PhantomJSDriver getPhantomJSInstance() {

        PhantomJsDriverManager.getInstance().setup();
        PhantomJSDriver driver=new PhantomJSDriver();
        return driver;
    }


    public static EdgeDriver getEdgeInstance() {
        EdgeDriverManager.getInstance().setup();
        EdgeDriver driver=new EdgeDriver();
        return driver;
    }

    public static OperaDriver getOperaInstance() {
        OperaDriverManager.getInstance().setup();
        OperaDriver driver=new OperaDriver();
        return driver;
    }
}