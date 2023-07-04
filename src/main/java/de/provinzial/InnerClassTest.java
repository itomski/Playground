package de.provinzial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Top-Level-Klasse
public class InnerClassTest {


    public static void main(String[] args) {

        InnerClassTest t1 = new InnerClassTest();

        // Verlangt für die Instanzierung ein Objekt der äußeren Klasse
        InnerClassTest.InnerClass inner = t1.new InnerClass();

        // Braucht kein Objekt der äußeren Klasse
        InnerClassTest.StaticInnerClass sinner = new InnerClassTest.StaticInnerClass();

        List<String> namen = new ArrayList<>();
        namen = new LinkedList<>();

        Machbar m = t1.machWas();
        System.out.println(m.machWas());

        m = t1.machWasAnderes();
        System.out.println(m.machWas());

    }

    class InnerClass {
    }

    static class  StaticInnerClass {
    }

    public Machbar machWas() {

        class LocalClass implements Machbar {

            @Override
            public String machWas() {
                return "machWas aus der Lokalen-Klasse";
            }
        }

        return new LocalClass();
    }

    public Machbar machWasAnderes() {

        class LocalClass implements Machbar {

            @Override
            public String machWas() {
                return "machWasAnderes aus der Lokalen-Klasse";
            }
        }

        return new LocalClass();
    }

    interface Machbar {
        String machWas();
    }

}
