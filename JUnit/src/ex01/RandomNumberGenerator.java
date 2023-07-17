package ex01;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rczgr
 */
public class RandomNumberGenerator {

    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int generate(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "El valor mínimo no puede ser mayor que el máximo"
            );
        }

        return random.nextInt(max - min + 1) + min;
    }

}
