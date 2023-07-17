/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03;

import java.util.regex.Pattern;

/**
 *
 * @author rczgr
 */
public class PasswordValidator {

    private static final int MIN_LENGTH = 8;
    private static final Pattern SPECIAL_CHARACTERS = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]");
    private static final Pattern UPPER_CASE_LETTERS = Pattern.compile("[A-Z]");

    public static boolean validatePassword(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            return false;
        }

        if (!SPECIAL_CHARACTERS.matcher(password).find()) {
            return false;
        }

        if (!UPPER_CASE_LETTERS.matcher(password).find()) {
            return false;
        }

        return true;
    }
}
