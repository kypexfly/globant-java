/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import java.security.SecureRandom;

/**
 *
 * @author rczgr
 */
public class SecurePasswordGenerator {

    private static final String LOWER_CASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:',.<>/?";

    private SecureRandom secureRandom;
    private int passwordLength;
    private boolean includeLowerCase;
    private boolean includeUpperCase;
    private boolean includeDigits;
    private boolean includeSpecialCharacters;

    public SecurePasswordGenerator(int passwordLength, boolean includeLowerCase, boolean includeUpperCase,
            boolean includeDigits, boolean includeSpecialCharacters) {
        
        if (passwordLength <= 4) {
            throw new IllegalArgumentException("Password length must be greater than four.");
        }
        
        this.passwordLength = passwordLength;
        this.includeLowerCase = includeLowerCase;
        this.includeUpperCase = includeUpperCase;
        this.includeDigits = includeDigits;
        this.includeSpecialCharacters = includeSpecialCharacters;
        secureRandom = new SecureRandom();
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        String validCharacters = getValidCharacters();

        while (password.length() < passwordLength) {
            int randomIndex = secureRandom.nextInt(validCharacters.length());
            char randomChar = validCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

    private String getValidCharacters() {
        StringBuilder validCharacters = new StringBuilder();

        if (includeLowerCase) {
            validCharacters.append(LOWER_CASE_CHARACTERS);
        }
        if (includeUpperCase) {
            validCharacters.append(UPPER_CASE_CHARACTERS);
        }
        if (includeDigits) {
            validCharacters.append(DIGITS);
        }
        if (includeSpecialCharacters) {
            validCharacters.append(SPECIAL_CHARACTERS);
        }

        return validCharacters.toString();
    }
}
