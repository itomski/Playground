package de.provinzial.uebung2;

import java.util.Random;

public class DiceCup {

    private static Random random = new Random();

    public static int roll() {
        return roll(6);
    }

    public static int roll(int size) {
        return random.nextInt(size) + 1;
    }

    public static int[] roll(int size, int num) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = roll(size);
        }

        return arr;
    }
}
