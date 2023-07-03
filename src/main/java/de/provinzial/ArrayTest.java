package de.provinzial;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int i = gibZahl();

        int[] zahlen = gibZahlen();
        System.out.println(zahlen);

        System.out.println(Arrays.toString(zahlen));

    }

    private static  int gibZahl() {
        return 10;
    }

    private static int[] gibZahlen() {

        int[] arr = new int[3];
        //int[] arr = new int[]{1,4,5};
        //int[] arr = {1,4,5};
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 8;
        return arr;
    }
}
