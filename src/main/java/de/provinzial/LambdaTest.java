package de.provinzial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {

    public static void main(String[] args) {

        Machbar m = new Machbar() {
            @Override
            public void machWas() {
                System.out.println("Macht dies und das...");
            }
        };

        m.machWas();

        System.out.println();

        m = () -> System.out.println("Macht was anderes...");
        m.machWas();

        System.out.println();

        MathOperation add = (a, b) -> a + b;

        // double exe(double a, double b);
        MathOperation div = (a, b) -> a / b;

        System.out.println(add.exe(100, 225));

        System.out.println(div.exe(100, 225));


        // void accept(T t);
        Consumer<String> cons = v -> System.out.println(v + "...");

        List<String> namen = new ArrayList<>(List.of("Peter", "Carol", "Bruce", "Natasha"));
        namen.forEach(cons);

        //boolean test(T t);
        Predicate<String> pred = v -> v.startsWith("B");
        namen.removeIf(pred);
        System.out.println(namen);


    }
}

@FunctionalInterface
interface Machbar {
    void machWas();
}

@FunctionalInterface
interface MathOperation {
    double exe(double a, double b);
}
