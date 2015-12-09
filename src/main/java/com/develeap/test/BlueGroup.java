package com.develeap.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by itamar on 12/8/15.
 */
public class BlueGroup implements TestGroup {

    @BeforeClass
    public static void beforeGroup() {
        System.err.println("VERY LONG SETUP HAPPENS NOW...");
        UglyGlobal.state=BlueGroup.class.getName();
    }

    @AfterClass
    public static void afterGroup() {
        System.err.println("Cleanup");
        UglyGlobal.state="";
    }
}