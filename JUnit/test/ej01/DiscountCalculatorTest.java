/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rczgr
 */
public class DiscountCalculatorTest {

    private DiscountCalculator dc;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dc = new DiscountCalculator();
    }

    @After
    public void tearDown() {
        dc = null;
    }

    @Test
    public void testWithMaximumDiscountRate() {
        double originalPrice = 100;
        double discountRate = 1;
        double expectedDiscountedPrice = 0;

        dc.setDiscountRate(discountRate);

        double discountedPrice = dc.calculateDiscount(originalPrice);

        assertEquals(expectedDiscountedPrice, discountedPrice, 0.001);
    }

    @Test
    public void testWithZeroDiscountRate() {
        double originalPrice = 100;
        double discountRate = 0;
        double expectedDiscountedPrice = 100;

        dc.setDiscountRate(discountRate);

        double discountedPrice = dc.calculateDiscount(originalPrice);

        assertEquals(originalPrice, discountedPrice, 0.001);
    }

    @Test
    public void testWithValidDiscountRate() {
        double originalPrice = 100;
        double discountRate = 0.1;
        double expectedDiscountedPrice = 90;

        dc.setDiscountRate(discountRate);

        double discountedPrice = dc.calculateDiscount(originalPrice);

        assertEquals(expectedDiscountedPrice, discountedPrice, 0.001);
    }

}
