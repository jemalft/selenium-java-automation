package com.zoomdataJemal.smokeTests;

import com.zoomdataJemal.BaseClass;
import com.zoomdataJemal.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{


@Test(priority = 1)
    public void canGoToLoginPage(){
                  Pages.loginPage().goToLoginPage();
                  Assert.assertTrue(Pages.loginPage().isAtLoginPage());
}
@Test(priority = 2)
    public void loginAsValidZoomDataUser() throws InterruptedException {
                  Pages.loginPage().loginAsValidUser("admin","Z00mda1a!");

}
@Test(priority = 3)
    public void canGoToSourcePage() throws InterruptedException {
                  Pages.sourcePage().goToSource();
                 // Pages.loginPage().loginAsValidUser("admin","Z00mda1a!");
                  Assert.assertTrue(Pages.sourcePage().isAtSourcePage());

}

}
