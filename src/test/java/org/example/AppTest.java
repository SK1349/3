package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Тесты для класса PerformanceCheck
 */
public class AppTest 
    extends TestCase
{
    /**
     * Тест метода testAdd на наличие отрицательных значений
     */
    public void testAdd(){
        PerformanceCheck tester = new PerformanceCheck();
        tester.testAdd(1000);
        assertTrue((tester.getTime(0,0)>0) && (tester.getTime(1,0)>0));
    }

    /**
     * Тест метода testGet на наличие отрицательных значений
     */
    public void testGet(){
        PerformanceCheck tester = new PerformanceCheck(1000);
        tester.testGet(1000);
        assertTrue((tester.getTime(0,1)>0) && (tester.getTime(1,1)>0));
    }

    /**
     * Тест метода testRemove на наличие отрицательных значений
     */
    public void testRemove(){
        PerformanceCheck tester = new PerformanceCheck(1000);
        tester.testRemove(1000);
        assertTrue((tester.getTime(0,2)>0) && (tester.getTime(1,2)>0));
    }
}


