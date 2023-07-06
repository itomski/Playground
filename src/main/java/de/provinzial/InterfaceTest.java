package de.provinzial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(2,3,7,9,22,1,19,100,-22,-1); // Fixed-Size Liste

        // Seit Java 1.9
        // List<Integer> ints = List.of(2,3,7,9,22,1,19,100,-22,-1); // Fixed-Size Liste
        Collections.sort(ints);
        System.out.println(ints);

        List<String> namen = Arrays.asList("Peter", "Carol", "Bruce", "Natasha", "Steve", "Tony"); // Fixed-Size Liste
        Collections.sort(namen);
        System.out.println(namen);

        List<LocalDate> termine = new ArrayList<>();
        termine.add(LocalDate.now());
        termine.add(LocalDate.of(2000, 10, 23));
        termine.add(LocalDate.of(2015, 7, 1));
        termine.add(LocalDate.now().minusDays(322));

        Collections.sort(termine);
        System.out.println(termine);

        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setVorname("Steve");
        s1.setNachname("Rogers");

        Student s2 = new Student();
        s2.setVorname("Carol");
        s2.setNachname("Danvers");

        students.add(s1);
        students.add(s2);

        Collections.sort(students);
        System.out.println(students);

    }
}
