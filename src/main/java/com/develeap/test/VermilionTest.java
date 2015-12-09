package com.develeap.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by Omri at 10/11/2015 21:56
 */
public class VermilionTest {

  @Test @Category(RedGroup.class)
  public void aRedTest() {
    assertEquals("This test requires the Red configuration",RedGroup.class.getName(),UglyGlobal.state);
  }

  @Test @Category(RedGroup.class)
  public void aReallyRedTest() {
    assertEquals("This test requires the Red configuration",RedGroup.class.getName(),UglyGlobal.state);
  }
}
