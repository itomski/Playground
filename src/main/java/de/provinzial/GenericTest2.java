package de.provinzial;

public class GenericTest2 {

    public static void main(String[] args) {
        GenericBox<String> strBox = new GenericBox<>();
        strBox.setContent("Hi");
        System.out.println(strBox.getContent());

        System.out.println();

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setContent(10);
        System.out.println(intBox.getContent());

        System.out.println();

        GenericBox<Kunde> kundenBox = new GenericBox<>();
        kundenBox.setContent(new Kunde("Peter", "Parker"));
        System.out.println(kundenBox.getContent().getVorname());

        System.out.println();

        GenericBox objBox = new GenericBox(); // RawType ist Object
        objBox.setContent(new Kunde("Peter", "Parker"));
        System.out.println(objBox.getContent());

        System.out.println();

        // Generischer Typ muss von Number abgeleitet sein
        NumberGenericBox<Double> numBox = new NumberGenericBox<>(); // RawType ist Number
        numBox.setZahl(10.0);
        System.out.println(numBox.getZahl());


    }
}


class GenericBox<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

class NumberGenericBox<N extends Number> {

    private N zahl;

    public N getZahl() {
        return zahl;
    }

    public void setZahl(N zahl) {
        this.zahl = zahl;
    }
}

class NextNumberGenericBox<N extends Number> extends GenericBox<N> {
}

class StringBox extends GenericBox<String> {
}

class NextGenericBox<T> extends GenericBox<T> {

    private T nextValue;

    public T getNextValue() {
        return nextValue;
    }

    public void setNextValue(T nextValue) {
        this.nextValue = nextValue;
    }
}

class Kunde {
    private String vorname;
    private String nachname;

    public Kunde() {
    }

    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}