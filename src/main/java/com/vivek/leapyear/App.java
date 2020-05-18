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
    	
    	if(y%400==0)return true;
    	
    	if(y%100==0 && y%400!=0)return false;
    	
    	
    	if(y%4==0 && y%100!=0)return true;
    	
    	return false;
    }
}
