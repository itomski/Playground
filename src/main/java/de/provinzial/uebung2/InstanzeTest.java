package de.provinzial.uebung2;

public class InstanzeTest {

    public static void main(String[] args) {

        DiceCupInstance cup = new DiceCupInstance(10);
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());

    }

}
