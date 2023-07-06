package de.provinzial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenericTest {

    public static void main(String[] args) {

        //Box b1 = new Box("Hallo Box");
        //System.out.println(b1.getValue());

        Box<String> b1 = new Box<>("Hallo Box");
        System.out.println(b1.getValue());

        Box<Integer> b2 = new Box<>(100);
        System.out.println(b2.getValue());

        Box<Book> b3 = new Box<>(new Book());
        System.out.println(b3.getValue());

        // Der generische Typ fällt auf den RawTyp zurück, hier Object
        Box b4 = new Box(new Book());
        System.out.println(b4.getValue());
        // Book b = b4.getValue();

        //Set<E>
        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Münster", 360_000);
        einwohner.put("Kiel", 250_000);
        einwohner.put("Berlin", 3_000_000);

        System.out.println(einwohner.get("Kiel"));

    }

}

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

/*
// Nicht generisch
class Box {
    private String value;

    public Box(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
*/