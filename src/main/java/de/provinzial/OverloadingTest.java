package de.provinzial;

public class OverloadingTest {

    public static void main(String[] args) {

        new OverloadingTest().go(); // Wechsel vom statischen Kontext auf Instanzkontext

    }

    private void go() {

        byte b = 0b101;
        b = 010;
        b = 0x1a;
        doSomething(b); // primitive widening

        System.out.println(b);
        System.out.println(Integer.toHexString(b));

        // 1. passende Methode
        // 2. primitive Widening
        // 3. Auto-Boxing
        // 4. Auto-Boxing und komplex Widening
        // 5. VarArg

        // Wrapper: Byte, Short, Integer, Long, Float, Double

        Integer i = 100; // Auto-Boxing von int zu Integer
        int j = i; // Auto-Un-Boxing von Integer zu int

        int erg = 5 / 2;
        // erg = 5.0 / 2; // 2 wird zu einem double und erg auch
        //b = b + 1; // b promoviert zu int, erg ist auch int
        //b = b + b; // b promoviert zu int, erg ist auch int

        char c = 'A';
        // char c = "A"; // Error, ist ein String
    }

    /*
    public void doSomething(byte v) {
        System.out.println("byte");
    }

    public void doSomething(int v) {
        System.out.println("int");
    }

    public void doSomething(Byte v) {
        System.out.println("Byte");
    }
    */

    public void doSomething(Integer v) {
        System.out.println("Integer");
    }

    /*
    public void doSomething(Number v) {
        System.out.println("Number");
    }

    public void doSomething(long v) {
        System.out.println("long");
    }

    public void doSomething(float v) {
        System.out.println("float");
    }

    public void doSomething(double v) {
        System.out.println("double");
    }
    */

    public void doSomething(int... v) {
        System.out.println("VarArg");
    }

}
