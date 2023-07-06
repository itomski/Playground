package de.provinzial;

import java.util.Collection;
import java.util.List;

public class GenerischeVererbung {

    public static void main(String[] args) {

        ZahlenAnalyse<Double> a1 = new ZahlenAnalyse<>();
        String s = a1.analysiere(List.of(10.2, 22.17, 100.12));

        ZahlenAnalyse<Long> a2 = new ZahlenAnalyse<>();
        s = a2.analysiere(List.of(10l, 22l, 100l));

        // Der RawTyp ist gleich dem Bound: hier Number
        ZahlenAnalyse a3 = new ZahlenAnalyse();
        s = a3.analysiere(List.of(10l, 22l, 100l));

    }

}

interface Analyse<T> {

    String analysiere(Collection<T> list);

}

class NamenAnalyse implements Analyse<String> {

    @Override
    public String analysiere(Collection<String> list) {
        return null;
    }
}

class GanzzahlenAnalyse implements Analyse<Integer> {
    @Override
    public String analysiere(Collection<Integer> list) {
        return null;
    }
}

// extends schränkt die generischen Typen auf Zahlen ein
class ZahlenAnalyse<T extends Number> implements Analyse<T> {

    @Override
    public String analysiere(Collection<T> list) {
        return null;
    }
}