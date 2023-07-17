/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ex01;

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
public class RandomNumberGeneratorTest {

    public RandomNumberGeneratorTest() {
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
    public void testGenerateRandomNumber_WithinRange() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int min = 1;
        int max = 10;

        int randomNumber = generator.generate(min, max);

        assertTrue(randomNumber >= min && randomNumber <= max);
    }
    
    @Test
    public void testGenerateRandomNumber_WithEqualMinAndMax() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int min = 5;
        int max = 5;

        int randomNumber = generator.generate(min, max);

        assertEquals(min, randomNumber);
    }
    
    @Test
    public void testGenerateRandomNumber_WithInvalidRange() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int min = 10;
        int max = 5;

        assertThrows(IllegalArgumentException.class, () -> {
            generator.generate(min, max);
        });
    }

}
