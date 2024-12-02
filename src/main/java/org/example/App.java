package org.example;

/**
 *  Класс для демонстрации стравнения производительности коллекций
 */
public class App 
{
    public static void main( String[] args )
    {
        PerformanceCheck tester = new PerformanceCheck();
        tester.doTests(1000);
        System.out.println( "Hello World!" );
    }
}
