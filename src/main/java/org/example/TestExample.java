package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExample {
    private final Calculator calculator = new Calculator();
    @BeforeClass
    public static void start() {
        System.out.println("Start");
    }
    @Test
    public void empty(){
        assertEquals(0, Calculator.add(""));
    }
    @Test
    public void singleNumber(){
        assertEquals(9, Calculator.add("9"));
    }
    @Test
    public void twonumbers(){
        assertEquals(7, Calculator.add("5,2"));
    }
    @Test
    public void numbersinlines(){
        assertEquals(8, Calculator.add("3,2\n3"));
        assertEquals(10, Calculator.add("1\n2,3,4"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers(){
        Calculator.add("1,-2,3");
    }

    @Test
    public void testAddWithMultipleNumbersIncludingBiggerThan1000() {
        assertEquals(1006, Calculator.add("1000,2,3000,4"));
    }
    @AfterClass
    public static void end(){
        System.out.println("End");
    }
}