package com.develeap.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by itamar on 12/8/15.
 */


@RunWith(Categories.class)
@Categories.IncludeCategory(BlueGroup.class)
@Suite.SuiteClasses({
        AzureTest.class,
        UltraMarineTest.class
})
public class BlueSuite extends BlueGroup {

}