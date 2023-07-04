package de.provinzial;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        char[] chars = {'A', 'c', 'X'}; // fixed size
        System.out.println(chars[1]); // Lesen
        chars[2] = 'B';

        System.out.println();

        for(char c : chars) {
            System.out.println(c);
        }

        System.out.println(chars);
        System.out.println(Arrays.toString(chars));

        int[] zahlen = {1,5,19,22};
        System.out.println(zahlen);
        System.out.println(Arrays.toString(zahlen));

        String[] namen;
        //namen = {"Bruce", "Peter", "Carol"}; // nur bei gleichzeitiger Deklaration erlaubt
        namen = new String[]{"Bruce", "Peter", "Carol"};
        System.out.println(Arrays.toString(namen));

        namen = new String[10]; // erzeugt ein leeres Array mit 10 Positionen
        System.out.println(Arrays.toString(namen));

        Arrays.fill(namen, "Unbekannt");
        System.out.println(Arrays.toString(namen));

        System.out.println();

        zahlen = new int[]{10, 17, 22,1,8,100,200,1,7,9,18};
        System.out.println(Arrays.toString(zahlen));

        Arrays.sort(zahlen); // Sortiert
        System.out.println(Arrays.toString(zahlen));

        int pos = Arrays.binarySearch(zahlen, 100);
        System.out.println(pos);

        pos = Arrays.binarySearch(zahlen, 2);
        System.out.println(pos);

        pos = Arrays.binarySearch(zahlen, -3);
        System.out.println(pos);

        int[] a, b; // beides int-Arrays
        int c[], d; // c int-Array, d int

        int[][] e;
        // int[] e[]; // macht das gleiche

        e = new int[][]{{1,2}, {3,4}, {5,6}};
        System.out.println(e[1][1]);
        System.out.println(e[2][0]);

        for(int[] sub : e) {
            for (int z : sub) {
                System.out.print(z + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();

        String[][] arr = new String[10][]; // mind. die Größe der erste Dimension muss vorgegeben werden

        //arr = new String[10][-5]; // NegativeArraySizeException
        arr = new String[10][5];

        for(String[] row : arr) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        try {
            System.out.println(arr[10][5]);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Position nicht vorhanden");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("Ende");

    }


}
