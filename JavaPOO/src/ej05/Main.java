/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej05;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccountService accountService = new BankAccountService();
        BankAccount account = accountService.create();

        accountService.depositAmount(account);
        accountService.withdrawAmount(account);
        accountService.quickWithdrawAmount(account);
        accountService.getAccountBalance(account);
        accountService.getAccountDetails(account);

    }

}
