package com.zoomdataJemal;

import org.openqa.selenium.By;

import static com.zoomdataJemal.SourcePage.locator.pageTitle;

/**
 * Created by jemal on 11/12/17.
 */
public class SourcePage extends BaseClass{
    static String url = "http://localhost:8080/zoomdata/admin.html#sources";
    static String ExpectedTitle = "Need a Different Type of Data Source?";


    public void goToSource() {
        driver.get(url);
    }

    public static boolean isAtSourcePage() {
         System.out.println(driver.findElement(pageTitle).getText());
        return driver.findElement(pageTitle).getText().equalsIgnoreCase(ExpectedTitle);
    }


    interface locator{
        By pageTitle = By.cssSelector(".data-sources-link");

    }
}
