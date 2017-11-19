package com.zoomdataJemal;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

/**
 * Created by jemal on 11/12/17.
 */
public class LoginPage extends BaseClass{

    public void goToLoginPage(){
        goTo();
    }
    public boolean isAtLoginPage() {
        return driver.getTitle().equals(ExpectedTitle);
    }

    public void loginAsValidUser(String username,String password) throws InterruptedException {
        driver.findElement(locator.usernameField).sendKeys(username);
        driver.findElement(locator.passwordField).sendKeys(password);
        DriverConfig.Wait(TimeUnit.SECONDS);
        driver.findElement(locator.nextButton).click();

    }






    interface locator{
        By usernameField = By.cssSelector("#username");
        By nextButton = By.xpath("//input[@class='btn btn-success btn-large']");
        By passwordField = By.cssSelector("#password");
    }

}
