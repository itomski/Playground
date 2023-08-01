package de.provinzial;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest {

    private Map<String, City> cities = new HashMap<>();

    public static void main(String[] args) {
        new OptionalTest().start();
    }

    private void start() {

        add("HH", new City("Hamburg", 1_900_000, 9.993682, 53.551086));
        add("KI", new City("Kiel", 350_000, 10.139444, 54.323334));

        City c1 = get("KI");
        System.out.println(c1.getName());

        System.out.println();

        City c2 = get("HB");
        if(c2 != null) System.out.println(c2.getName());

        Optional<City> opt = getOpt("HB");
        opt.ifPresent(c -> System.out.println(c.getName())); // Wird ausgeführt, wenn Optional nicht empty ist

        c2 = opt.orElse(new City()); // Leeres City-Objekt wenn Optional empty
        //c2 = opt.get(); // liest das Objejkt aus dem Optional, Exception, wenn empty
        System.out.println(c2);

        // Produziert eine Exception, wenn Optional empty
        opt.orElseThrow(() -> new RuntimeException("Stadt nicht verfügbar"));
    }

    private void add(String key, City city) {
        cities.put(key, city);
    }

    private City get(String key) {
        return cities.get(key);
    }

    private Optional<City> getOpt(String key) {
        City city = cities.get(key);
        if(city == null)
            return Optional.empty(); // Leeres Optional

        return Optional.of(city); // Gefülltes Optional
    }
}
