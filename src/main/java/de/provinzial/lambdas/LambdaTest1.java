package de.provinzial.lambdas;

import de.provinzial.uebung4.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest1 {

    public static void main(String[] args) {

        // Interfaces können nicht instanziert werden!!!
        //Machbar m1 = new Machbar();

        Machbar m2 = new HolzErntent();
        m2.machWas();

        m2 = new WeizenErnte();
        m2.machWas();

        System.out.println();

        List<Machbar> zeug = new ArrayList<>();
        zeug.add(new HolzErntent());
        zeug.add(new WeizenErnte());

        for(Machbar m : zeug) {
            m.machWas();
        }

        // Anonyme Klasse
        // Es wird eine Klasse ohne Namen deklariert, die von Machbar erbt
        // diese Klasse wird sofort instanziert und steht als Definition später nicht mehr zur verfügung
        Machbar m3 = new Machbar() {
            @Override
            public void machWas() {
                System.out.println("Asteroiden Ernte...");
            }
        };

        zeug.add(m3);

        // Voraussetzung für Lambdas ist ein SAM-Interface - Single Abstract Method
        // Solche Interfaces nennt man FunctionalInterfaces
        // void machWas();
        Machbar m4 = () -> System.out.println("Lambda Ernte");
        m4.machWasAnderes("Dies und das");

        zeug.add(m4);
        zeug.add(() -> System.out.println("Kryptonit Ernte"));

        System.out.println();

        for(Machbar m : zeug) {
            m.machWas();
        }

        System.out.println();

        // void accept(T t)
        Consumer<String> cons1 = v -> System.out.println(v);
        Consumer<String> cons2 = v -> System.out.print(v + ", ");
        Consumer<String> cons3 = v -> System.out.println(String.format("| %20s |", v));

        print(Arrays.asList("Peter", "Bruce", "Carol"), cons1);


        Function<String, Double> parseFunc = (s) -> Double.parseDouble(s);
        double d1 = parseFunc.apply("10.0");
        d1 = parseFunc.apply("119.27");

        Function<String, String> clean = s -> s.trim().toLowerCase();
        String c1 = clean.apply("\t xyZ Abc Xr \n");
        System.out.println(c1);

        Function<Double, Product> fabrik = p -> {
            Product product = new Product();
            product.setName("Unbekannt");
            product.setPrice(p);
            return product;
        };

        Product p1 = fabrik.apply(19.99);
        System.out.println(p1);

    }

    static void print(List<String> list, Consumer<String> consumer) {
        list.forEach(consumer);
    }

}

@FunctionalInterface // Prüft ob die SAM-Regeln eingehalten werden
interface Machbar {

    void machWas(); // Automatisch public

    static void machWasStatic(String a, String b) {
        System.out.println("Es wird " + a + " und " + b + " erledigt");
    }

    default void machWasAnderes(String a) {
        System.out.println(a + " wird erledigt");
    }
}

class HolzErntent implements Machbar {

    @Override
    public void machWas() {
        System.out.println("Holz wird geerntet...");
    }
}

class WeizenErnte implements Machbar {

    @Override
    public void machWas() {
        System.out.println("Es wird jetzt weizen geerntet...");
    }
}