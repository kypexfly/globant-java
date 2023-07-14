/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej01;

/**
 *
 * @author rczgr
 */
public class DiscountCalculator {

    private double discountRate;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculateDiscount(double originalPrice) {
        double discountAmount = originalPrice * discountRate;

        return originalPrice - discountAmount;
    }

}
