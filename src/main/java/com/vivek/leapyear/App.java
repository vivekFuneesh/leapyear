package com.vivek.leapyear;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        
    }
    
    static boolean isLeapYear(String year) {
    	Integer y=Integer.valueOf(year);
    	if(y%400==0)
    		return true;
    	return false;
    }
}
