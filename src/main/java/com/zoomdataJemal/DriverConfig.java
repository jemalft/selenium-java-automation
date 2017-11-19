package com.zoomdataJemal;

import java.util.concurrent.TimeUnit;

/**
 * Created by jemal on 11/12/17.
 */
public class DriverConfig {
    public static void Wait(TimeUnit timeunit) throws InterruptedException {
        Thread.sleep((timeunit.toSeconds(1)));
    }
}
