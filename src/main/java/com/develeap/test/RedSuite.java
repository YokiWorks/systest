package com.develeap.test;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by itamar on 12/9/15.
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(RedGroup.class)
@Suite.SuiteClasses({
        ScarletTest.class,
        VermilionTest.class
})
public class RedSuite extends RedGroup {
}
