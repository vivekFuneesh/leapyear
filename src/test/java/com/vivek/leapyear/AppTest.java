package com.vivek.leapyear;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    private String[] validList= {"202000","2000"};
    private String[] inValidList= {"20200","2021","2003"};
    
    
    public void testisLeap()
    {
    	int i=-1;
    	while(++i<validList.length)
        assertTrue("Year "+validList[i]+" is a valid leap year but code says INvalid",App.isLeapYear(validList[i]));
    	i=-1;
    	while(++i<inValidList.length)
        assertFalse("Year "+inValidList[i]+" is an INvalid leap year but code says VALID",App.isLeapYear(inValidList[i]));
    
    }
    
    
    
}
