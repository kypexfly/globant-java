/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej05;

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
public class DateValidatorTest {
    
    public DateValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidDate_WithValidDate_ShouldReturnTrue() {
        int year = 2023;
        int month = 7;
        int day = 13;

        boolean result = DateValidator.isValidDate(year, month, day);

        assertTrue(result);
    }

    @Test
    public void testIsValidDate_WithInvalidYear_ShouldReturnFalse() {
        int year = 0; // Año inválido
        int month = 7;
        int day = 13;

        boolean result = DateValidator.isValidDate(year, month, day);

        assertFalse(result);
    }

    @Test
    public void testIsValidDate_WithInvalidMonth_ShouldReturnFalse() {
        int year = 2023;
        int month = 13; // Mes inválido
        int day = 13;

        boolean result = DateValidator.isValidDate(year, month, day);

        assertFalse(result);
    }

    @Test
    public void testIsValidDate_WithInvalidDay_ShouldReturnFalse() {
        int year = 2023;
        int month = 2;
        int day = 30; // Día inválido para febrero

        boolean result = DateValidator.isValidDate(year, month, day);

        assertFalse(result);
    }

    @Test
    public void testIsValidDate_WithLeapYear_ShouldReturnTrue() {
        int year = 2024; // Año bisiesto
        int month = 2;
        int day = 29;

        boolean result = DateValidator.isValidDate(year, month, day);

        assertTrue(result);
    }

    @Test
    public void testIsValidDate_WithNonLeapYear_ShouldReturnFalse() {
        int year = 2023; // Año no bisiesto
        int month = 2;
        int day = 29;

        boolean result = DateValidator.isValidDate(year, month, day);

        assertFalse(result);
    }
}
