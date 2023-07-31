package de.provinzial;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class GenericMethodsTest {

    public static void main(String[] args) {

        System.out.println(add(10.0, 20.0));
        System.out.println(nextAdd(10.0, 20.0));

        // Eingangsparameter definieren den generischen Typ
        List<Double> werte = nextAdd(10.0, 20.0);
        List<Integer> werte2 = nextAdd(10, 20);

        List<String> werte3 = getList();
        //List<String> werte3b = getZahlenList();

        // Der Inhalt der Liste ist variable
        List<?> werte4 = getList();
        List<?> werte5 = getZahlenList();

        System.out.println();
        print(getList()); // Strings
        System.out.println();
        print(getZahlenList()); // Integer
        System.out.println();
        print(Set.of(2,7,19,22,1));

    }

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> List<T> nextAdd(T a, T b) {
        return List.of(a, b);
    }

    public static List<String> getList() {
        // return List.of("Bruce", "Carol", "Steve"); // Ab Java 9
        return Arrays.asList("Bruce", "Carol", "Steve");
    }

    public static List<Integer> getZahlenList() {
        return Arrays.asList(2,7,9,22,11);
    }

    public static void print(Collection<?> werte) {
        werte.forEach(o -> System.out.println(o));
    }
}
