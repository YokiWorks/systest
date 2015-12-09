package com.develeap.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by Omri at 10/11/2015 21:56
 */
public class ScarletTest {

  @Test @Category(RedGroup.class)
  public void aRedishTest() {
    assertEquals("This test requires the Red configuration",RedGroup.class.getName(),UglyGlobal.state);
  }
}
