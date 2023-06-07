/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej05;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class BankAccountService {

    Scanner scanner = new Scanner(System.in);

    public BankAccount create() {
        BankAccount account = new BankAccount();
        System.out.print("Enter your bank account ID:");
        account.setId(scanner.nextInt());
        System.out.print("Enter your user ID:");
        account.setUserId(scanner.nextLong());
        System.out.print("Enter initial balance:");
        account.setBalance(scanner.nextInt());

        return account;
    }

    public void depositAmount(BankAccount account) {
        System.out.print("Enter the amount to deposit:");
        account.deposit(scanner.nextDouble());
        System.out.println("Deposit successful. Balance: " + account.getBalance());
    }

    public void withdrawAmount(BankAccount account) {
        System.out.print("Enter the amount to withdraw:");
        account.withdraw(scanner.nextDouble());
        System.out.println("Withdraw successful. Balance: " + account.getBalance());
    }

    public void quickWithdrawAmount(BankAccount account) {
        account.quickWithdraw();
        System.out.println("Quick Withdraw (20%) successful. Balance: " + account.getBalance());
    }

    public void getAccountBalance(BankAccount account) {
        System.out.println("Current balance: " + account.getBalance());
    }

    public void getAccountDetails(BankAccount account) {
        System.out.println(account.toString());
    }

}
