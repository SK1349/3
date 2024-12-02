package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testAdd(){
        PerformanceCheck tester = new PerformanceCheck();
        tester.testAdd(1000);
        assertTrue((tester.getTime(0,0)>0) && (tester.getTime(1,0)>0));
    }

    public void testGet(){
        PerformanceCheck tester = new PerformanceCheck(1000);
        tester.testGet(1000);
        assertTrue((tester.getTime(0,1)>0) && (tester.getTime(1,1)>0));
    }

    public void testRemove(){
        PerformanceCheck tester = new PerformanceCheck(1000);
        tester.testRemove(1000);
        assertTrue((tester.getTime(0,2)>0) && (tester.getTime(1,2)>0));
    }
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
}


