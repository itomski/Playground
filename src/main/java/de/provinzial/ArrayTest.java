package de.provinzial;

public class ArrayTest {

    public static void main(String[] args) {

        int i = gibZahl();

        int[] zahlen = gibZahlen();

    }

    private static  int gibZahl() {
        return 10;
    }

    private static int[] gibZahlen() {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 8;
        return arr;
    }
}
