/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej05;

/**
 *
 * @author rczgr
 */
public class BankAccount {

    private int id;
    private long userId;
    private double balance; // changed int to double

    public BankAccount() {
    }

    public BankAccount(int id, long userId, int balance) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // What if: user enters a negative value?
    // Should we add validation for this?
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount <= 0) {
            balance = 0;
            return;
        }

        balance = balance - amount;
    }

    // TODO: check if validation is ok
    public void quickWithdraw() {
        if (balance > 0) {
            balance -= balance * 0.2;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", userId=" + userId + ", balance=" + balance + '}';
    }

}
