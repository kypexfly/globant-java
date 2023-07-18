/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ex03;

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
public class SecurePasswordGeneratorTest {

    public SecurePasswordGeneratorTest() {
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
    public void testInstanciateSecurePasswordGenerator_WithInvalidLength_ShouldThrowException() {
        int invalidLength = 4;
        boolean includeLowerCase = true;
        boolean includeUpperCase = true;
        boolean includeDigits = true;
        boolean includeSpecialCharacters = true;

        assertThrows(IllegalArgumentException.class, () -> {
            SecurePasswordGenerator generator = new SecurePasswordGenerator(
                    invalidLength,
                    includeLowerCase,
                    includeUpperCase,
                    includeDigits,
                    includeSpecialCharacters
            );
        });
    }

    @Test
    public void testGeneratePassword_WithDefaultSettings_ShouldReturnValidPassword() {
        SecurePasswordGenerator generator = new SecurePasswordGenerator(12, true, true, true, true);

        String password = generator.generatePassword();

        assertNotNull(password);
        assertEquals(12, password.length());
    }

    @Test
    public void testGeneratePassword_WithLowerCaseOnly_ShouldReturnValidPassword() {
        SecurePasswordGenerator generator = new SecurePasswordGenerator(8, true, false, false, false);

        String password = generator.generatePassword();

        assertNotNull(password);
        assertEquals(8, password.length());
        assertTrue(password.matches("[a-z]+"));
    }

    @Test
    public void testGeneratePassword_WithUpperCaseOnly_ShouldReturnValidPassword() {
        SecurePasswordGenerator generator = new SecurePasswordGenerator(10, false, true, false, false);

        String password = generator.generatePassword();

        assertNotNull(password);
        assertEquals(10, password.length());
        assertTrue(password.matches("[A-Z]+"));
    }

    @Test
    public void testGeneratePassword_WithDigitsOnly_ShouldReturnValidPassword() {
        SecurePasswordGenerator generator = new SecurePasswordGenerator(6, false, false, true, false);

        String password = generator.generatePassword();

        assertNotNull(password);
        assertEquals(6, password.length());
        assertTrue(password.matches("[0-9]+"));
    }

    @Test
    public void testGeneratePassword_WithSpecialCharactersOnly_ShouldReturnValidPassword() {
        SecurePasswordGenerator generator = new SecurePasswordGenerator(14, false, false, false, true);

        String password = generator.generatePassword();

        assertNotNull(password);
        assertEquals(14, password.length());
        assertTrue(password.matches("[!@#$%^&*()-_=+\\[\\]{};:',.<>/?]+"));
    }
    
}
