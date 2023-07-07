package de.provinzial.collections;

import java.util.*;

import static de.provinzial.collections.MitarbeiterTyp.*;

public class CollectionTest1 {

    public static void main(String[] args) {

        Integer[] arr = {1,5,7,8,11,22,7,9};

        // Generische Typen sind IMMER komplex
        List<Integer> zahlen = Arrays.asList(arr); // Fixedsize

        zahlen = new ArrayList<>(Arrays.asList(arr));

        zahlen.add(10);
        zahlen.add(2, 10); // an Index 2 hinzufügen
        zahlen.set(2, 200); // Element an Index 2 ersetzen
        zahlen.remove(2); // Entfernt das Element an Index 2
        zahlen.remove(new Integer(2)); // Entfernt die 2 aus der Liste
        zahlen.removeAll(Arrays.asList(1,2,3)); // 1, 2 und 3 werden als Elemente entfernt
        zahlen.retainAll(Arrays.asList(1,2,3)); // 1, 2 und 3 werden beibehalten, Rest wird entfernt

        if(zahlen.contains(10)) {
            System.out.println("10 ist verfügbar!");
        }

        zahlen = new ArrayList<>(Arrays.asList(arr));

        zahlen.size(); // Anzahl der Elemente

        // seit Java 1.8

        // Verwendet ein Consumer
        zahlen.forEach(i -> System.out.println(i));
        // zahlen.forEach(System.out::println); // Methodenreferenz

        // Verwendet ein Predicate
        zahlen.removeIf(i -> i > 100); // Alles über 100 wird entfernt

        // Erzeugt eine Pipeline für Werte
        zahlen.stream().filter(i -> i < 50).limit(10).count(); // für sequenzielle Verarbeitung
        zahlen.parallelStream(); // Für parallele verarbeitung

        zahlen = new LinkedList<>(zahlen); // Änderung von ArrayList auf LinkedList

        Set<Integer> menge = new HashSet<>(zahlen); // LinkedList wird zu einem Set

        // SET
        System.out.println();

        Set<String> namen = new HashSet<>();
        //Set<String> namen = new LinkedHashSet<>(); // Merkt sich die Reihenfolge beim Einfügen

        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Steve");
        namen.add("Bruce");
        namen.add("Tony");
        System.out.println(namen);

        namen.forEach(System.out::print);

        System.out.println();

        namen.add("Bruce"); // wird abgelehnt
        namen.forEach(System.out::print);

        System.out.println();

        Project p1 = new Project(10, "Vertrags API");
        Project p2 = new Project(10, "Vertrags API");

        Set<Project> projects = new HashSet<>();
        projects.add(p1);
        projects.add(p2);
        projects.add(new Project(10, "Contract API"));

        System.out.println(projects);

        System.out.println();

        Comparator<Project> comp1 = (a,b) -> a.getNr() - b.getNr();
        Comparator<Project> comp2 = (a,b) -> a.getName().compareTo(b.getName());

        Set<Project> sortProjects = new TreeSet<>(comp2); // Wechsel vom HashSet auf TreeSet
        sortProjects.addAll(projects);

        System.out.println(sortProjects);

        System.out.println();

        // QUEUE
        Queue<Integer> warteschlange = new LinkedList<>();
        warteschlange.offer(10);
        warteschlange.offer(22);
        warteschlange.offer(18);
        warteschlange.offer(33); // Fügt ein Element hinzu

        System.out.println(warteschlange);

        while(!warteschlange.isEmpty()) {
            System.out.println(warteschlange.poll()); // Entfernt das Element aus der Warteschlange
            //System.out.println(warteschlange.peek()); // Zeigt das aktuelle Element ohne es zu entfernen
        }

        System.out.println(warteschlange);

        // MAP



        Map<MitarbeiterTyp, List<String>> mitarbeiter = new HashMap<>();

        mitarbeiter.put(AZUBI, new ArrayList<>());
        mitarbeiter.put(JUNIOR, new ArrayList<>());
        mitarbeiter.put(NORMALO, new ArrayList<>());
        mitarbeiter.put(SENIOR, new ArrayList<>());
        mitarbeiter.put(SUPER_SENIOR, new ArrayList<>());

        mitarbeiter.get(AZUBI).add("Peter Parker");
        mitarbeiter.get(AZUBI).add("Bruce Banner");
        mitarbeiter.get(SENIOR).add("Carol Denvers");
        mitarbeiter.get(SUPER_SENIOR).add("Tony Stark");

        System.out.println(mitarbeiter);
        System.out.println(mitarbeiter.get(AZUBI));

        System.out.println(); // WERTE

        for(List<String> data : mitarbeiter.values()) {
            System.out.println(data);
        }

        System.out.println(); // KEYS

        for(MitarbeiterTyp mt : mitarbeiter.keySet()) {
            System.out.println(mt);
        }

        System.out.println(); // BEIDES

        for(Map.Entry<?, ?> eintrag  : mitarbeiter.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

    }
}

enum MitarbeiterTyp {

    AZUBI, JUNIOR, NORMALO, SENIOR, SUPER_SENIOR;

}


// Immutable
class Project {

    private final int nr;
    private final String name;

    // Static Initializer
    static {
        // Initialisierung von statischen Konstanten
        System.out.println("STATIC INIT");
    }

    // Instanz-Initialiser
    {
        System.out.println("INSTANZ INIT");
    }

    // finale Eigenschaften müssen spätestens im Konstruktor hinzugefügt werden
    public Project(int nr, String name) {
        System.out.println("CONST");
        this.nr = nr;
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return nr == project.nr && Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(nr, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Project{");
        sb.append("nr=").append(nr);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
