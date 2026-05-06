package com.vishal;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

    public void testDivide() {
        Calc calc = new Calc();
        int actual = calc.divide(10,5);
        int expected = 2;
        assertEquals(expected, actual);
    }
}