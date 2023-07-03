package de.provinzial.uebung2;

import java.util.Random;

public class DiceCupInstance {

    private Random random = new Random();

    private int size;

    public DiceCupInstance(int size) {
        this.size = size;
    }

    public int roll() {
        return random.nextInt(size) + 1;
    }

    public int[] roll(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = roll();
        }

        return arr;
    }
}