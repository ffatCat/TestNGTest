package com.framework.util.assertion;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
/**
 * 
 * @author wx
 *
 */
public class Assertion {

	public static boolean flag = true;

    public static List<Error> errors = new ArrayList<Error>();

    /**
     * String对比
     * @param actual
     * @param expected
     */
    public static void verifyEquals(Object actual, Object expected){
    	
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }

    /**
     * String对比+msg
     * @param actual
     * @param expected
     * @param message
     */
    public static void verifyEquals(Object actual, Object expected, String message){
    	try{
            Assert.assertEquals(actual, expected, message);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
    
    /**
     * boolean对比
     * @param condition
     */
    public static void verifyTrue(boolean condition){
    	
        try{
            Assert.assertTrue(condition);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
    
    /**
     * boolean对比
     * @param condition
     * @param message
     */
    public static void verifyTrue(boolean condition, String message){
    	
        try{
            Assert.assertTrue(condition, message);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
    
    /**
     * 
     * @param condition
     * @param message
     */
    public static void verifyFalse(boolean condition, String message){
    	
        try{
            Assert.assertFalse(condition, message);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
    
    /**
     * 
     * @param condition
     */
    public static void verifyFalse(boolean condition){
    	
        try{
            Assert.assertFalse(condition);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
    
}
