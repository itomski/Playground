package de.provinzial.lambdas;

import java.time.Duration;
import java.time.Instant;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateTest {

    public static void main(String[] args) {

        Instant start = Instant.now();

        IntSupplier w6 = () -> (int)(Math.random() * 6) + 1;

        /*
        int[] zahlen = new int[10_000_0000];

        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = w6.getAsInt();
        }
        */

        IntStream.generate(w6)
                .parallel()
                //.limit(10_000)
                .filter(i -> i >= 2) // Kleiner als 2 wird entfernt
                .forEach(i -> System.out.println(i));

        // Instant = Zeit in Nanosekunden
        Instant end = Instant.now();

        // Zeitraum in Nanosekunden
        System.out.println(Duration.between(start, end).toMillis() + " ms");

    }



}
