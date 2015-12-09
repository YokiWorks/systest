package com.develeap.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by Omri at 10/11/2015 21:52
 */
public class RedGroup implements TestGroup {

  @BeforeClass
  public static void beforeGroup() {
    System.err.println("VERY LONG SETUP HAPPENS NOW...");
    UglyGlobal.state=RedGroup.class.getName();
  }

  @AfterClass
  public static void afterGroup() {
    System.err.println("Cleanup");
    UglyGlobal.state="";
  }
}
