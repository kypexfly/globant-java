/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej02;

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
public class TemperatureConverterTest {

    public TemperatureConverterTest() {
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
    public void testCelsiusToFahrenheit() {
        double celsius = 25.0;
        double expectedFahrenheit = 77.0;

        double result = TemperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(expectedFahrenheit, result, 0.001);
    }

    @Test
    public void testCelsiusToKelvin() {
        double celsius = 25.0;
        double expectedKelvin = 298.15;

        double result = TemperatureConverter.celsiusToKelvin(celsius);

        assertEquals(expectedKelvin, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        double fahrenheit = 77.0;
        double expectedCelsius = 25.0;

        double result = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(expectedCelsius, result, 0.001);
    }

    @Test
    public void testFahrenheitToKelvin() {
        double fahrenheit = 77.0;
        double expectedKelvin = 298.15;

        double result = TemperatureConverter.fahrenheitToKelvin(fahrenheit);

        assertEquals(expectedKelvin, result, 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        double kelvin = 298.15;
        double expectedCelsius = 25.0;

        double result = TemperatureConverter.kelvinToCelsius(kelvin);

        assertEquals(expectedCelsius, result, 0.001);
    }

    @Test
    public void testKelvinToFahrenheit() {
        double kelvin = 298.15;
        double expectedFahrenheit = 77.0;

        double result = TemperatureConverter.kelvinToFahrenheit(kelvin);

        assertEquals(expectedFahrenheit, result, 0.001);
    }
    
}
