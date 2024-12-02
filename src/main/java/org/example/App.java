package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PerformanceCheck tester = new PerformanceCheck();

        tester.testAdd(1000);
        tester.testGet(1000);
        tester.testRemove(1000);

        tester.printTable();;
        System.out.println( "Hello World!" );
    }
}
