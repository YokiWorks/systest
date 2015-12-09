package com.develeap.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Created by Omri at 10/11/2015 21:56
 */
public class UltraMarineTest {

  @Test @Category(BlueGroup.class)
  public void aVeryBlueTest() {
    assertEquals("This test requires the Blue configuration",BlueGroup.class.getName(),UglyGlobal.state);
  }
}
