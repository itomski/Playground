package de.provinzial;

public class ExceptionTest2 {

    public static void main(String[] args) {

        System.out.println("MAIN start");

        try {
            method1();
        }
        catch(RuntimeException e) {
            System.out.println("BEHANDELT MAIN");
        }

        System.out.println("MAIN ende");
    }

    static void method1() {
        System.out.println("M1: start");
        method2();
        System.out.println("M1: ende");
    }

    static void method2() {
        System.out.println("M2: start");
        try {
            method3();
        }
        catch(RuntimeException e) {
            System.out.println("BEHANDELT M2");
        }
        System.out.println("M2: ende");
    }

    static void method3() {
        System.out.println("M3: start");
        method4();
        System.out.println("M3: ende");
    }

    static void method4() {
        System.out.println("M4: start");
        int[] arr = {};
        arr[1] = 10; // RuntimeException - ArrayIndexOutOfBoundsException
        System.out.println("M4: ende");
    }
}
