/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ex02;

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
public class PalindromeCheckerTest {
    
    public PalindromeCheckerTest() {
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
    public void testIsPalindrome_WithPalindromeString_ShouldReturnTrue() {
        String palindrome = "Madam";

        boolean result = PalindromeChecker.isPalindrome(palindrome);

        assertTrue(result);
    }

    @Test
    public void testIsPalindrome_WithNonPalindromeString_ShouldReturnFalse() {
        String nonPalindrome = "Hello";

        boolean result = PalindromeChecker.isPalindrome(nonPalindrome);

        assertFalse(result);
    }

    @Test
    public void testIsPalindrome_WithEmptyString_ShouldReturnFalse() {
        String emptyString = "";

        boolean result = PalindromeChecker.isPalindrome(emptyString);
        
        assertFalse(result);
    }

    @Test
    public void testIsPalindrome_WithNullString_ShouldReturnFalse() {
        String nullString = null;

        boolean result = PalindromeChecker.isPalindrome(nullString);

        assertFalse(result);
    }

    @Test
    public void testIsPalindrome_WithSpecialCharactersAndSpaces_ShouldReturnTrue() {
        String palindromeWithSpecialChars = "A man, a plan, a canal - Panama!";

        boolean result = PalindromeChecker.isPalindrome(palindromeWithSpecialChars);

        assertTrue(result);
    }
    
}
