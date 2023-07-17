/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej03;

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
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
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
    public void testValidatePassword_WithValidPassword_ShouldReturnTrue() {
        String validPassword = "Password123!";

        boolean result = PasswordValidator.validatePassword(validPassword);

        assertTrue(result);
    }

    @Test
    public void testValidatePassword_WithShortPassword_ShouldReturnFalse() {
        String shortPassword = "Pwd123!"; // Contraseña demasiado corta

        boolean result = PasswordValidator.validatePassword(shortPassword);

        assertFalse(result);
    }

    @Test
    public void testValidatePassword_WithoutSpecialCharacters_ShouldReturnFalse() {
        String passwordWithoutSpecialChars = "Password123"; // Falta un carácter especial

        boolean result = PasswordValidator.validatePassword(passwordWithoutSpecialChars);

        assertFalse(result);
    }

    @Test
    public void testValidatePassword_WithoutUpperCaseLetters_ShouldReturnFalse() {
        String passwordWithoutUpperCase = "password123!"; // Falta una letra mayúscula

        boolean result = PasswordValidator.validatePassword(passwordWithoutUpperCase);

        assertFalse(result);
    }
}
