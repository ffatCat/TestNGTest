package com.testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 * 
 * @author fc
 *
 */
@Listeners({com.framework.util.retry.RetryListener.class})
public class MyRetryTest {
	/**
	 * 
	 */
	@Test
    public void testOne() {
        Assert.assertEquals("google", "google");
    }
	/**
	 * 
	 */
    @Test(dataProvider = "testData")
    public void testTwo(int a, String b) {
        Assert.assertEquals("hello", "hallo"); //Will fail

    }
    
    @DataProvider
    public Object[][] testData() {
        return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" },new Object[] { 3, "c" },new Object[] { 4, "d" } };
    }

}
