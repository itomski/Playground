package de.provinzial;

public class TaschenrechnerTest {

    public static void main(String[] args) {

        double erg = Taschenrechner.add(10, 15);
        System.out.println(erg);
        erg = Taschenrechner.sub(10, 15);
        System.out.println(erg);
        erg = Taschenrechner.multi(10, 15);
        System.out.println(erg);
        erg = Taschenrechner.div(10, 15);
        System.out.println(erg);

    }
}
