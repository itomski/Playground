package de.provinzial;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        // Referenztyp = ArrayList
        // Objekttyp = ArrayList
        ArrayList<Integer> zahlen = new ArrayList<>();

        // Referenztyp = List
        // Objekttyp = ArrayList (andere Klassen die List implementieren sind auch möglich)
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2 = new LinkedList<>();
        zahlen2 = new ArrayList<>();

        // Referenztyp = Collection
        // Objekttyp = ArrayList (andere Klassen die Collection implementieren sind auch möglich)
        Collection<Integer> zahlen3 = new ArrayList<>();
        zahlen3 = new LinkedList<>();
        zahlen3 = new HashSet<>();
        zahlen3 = new ArrayDeque<>();
        // Referenz zahlen3 bietet lediglich Methoden an, die in Collection deklariert sind

        Set<String> strSet = new HashSet<>();
        strSet.add("Bruce");
        strSet.add("Carol");
        strSet.add("Steve");
        strSet.add("Steve"); // Wird nicht gespeichert
        System.out.println(strSet);

        // Zuerst wird geschaut, ob ein Objekt mit gleichem HashCode vorhanden ist
        // Wenn ja, erfolgt ein Vergleich über equals

        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(new Vehicle("AB:ZA127", 2000));
        vehicles.add(new Vehicle("AB:ZA123", 2010));
        vehicles.add(new Vehicle("AB:ZA123", 2015));
        vehicles.add(new Vehicle("AB:ZA124", 2010));
        vehicles.add(new Vehicle("AB:ZA124", 2022));

        System.out.println(vehicles);

        List<Vehicle> vList = new ArrayList<>(vehicles); // Baut eine List mit Ihnalten des Sets
        System.out.println(vList.get(2).getRegistration());

        System.out.println();

        System.out.println(vehicles);

        // TreeSet ist IMMER sortiert
        // Verwendet das Comparable = Natürliche Reihenfolge
        Set<Vehicle> sorted = new TreeSet<>(vehicles);
        System.out.println(sorted);

        Comparator<Vehicle> comparator = (a, b) -> a.getRegistration().compareTo(b.getRegistration());
        Comparator<Vehicle> yearComparator = (a, b) -> a.getYear() - b.getYear();

        // Verwendet zum sortieren nicht das Comparable sondern den Comparator
        //sorted = new TreeSet<>(comparator); // der Comparator beschreibt, wie sortiert wird
        sorted = new TreeSet<>(yearComparator.reversed()); // Nach Jahr
        //sorted = new TreeSet<>(yearComparator.thenComparing(comparator)); // Nach Jahr und Kennzeichen
        sorted.addAll(vehicles);
        System.out.println(sorted);


    }
}

class Vehicle implements Comparable<Vehicle> {
    private String registration;

    private int year;

    public Vehicle(String registration, int year) {
        this.registration = registration;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration='" + registration + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(registration, vehicle.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, year);
    }

    @Override
    public int compareTo(Vehicle other) {
        return registration.compareTo(other.getRegistration());
    }
}
