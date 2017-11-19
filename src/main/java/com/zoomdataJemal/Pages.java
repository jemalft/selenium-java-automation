package com.zoomdataJemal;

import javafx.util.Pair;

/**
 * Created by jemal on 11/12/17.
 */
public class Pages {


    public static LoginPage  loginPage() {
        LoginPage loginpage = new LoginPage();
        return loginpage;

    }
    public static HomePage homePage() {
       HomePage homePage = new HomePage();
        return homePage;
    }

    public static SourcePage sourcePage() {
        return new SourcePage();
    }
}
