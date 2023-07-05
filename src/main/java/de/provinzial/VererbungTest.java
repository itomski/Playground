package de.provinzial;

public class VererbungTest {

    public static void main(String[] args) {

        Student s1 = new Student();

        //Mensch m = new Mensch();

        // IS-A
        JuraStudent s2 = new JuraStudent();
        Student s3 = new JuraStudent();
        Mensch s4 = new JuraStudent();
        s4.setVorname("Peter");
        s4.setNachname("Parker");
        System.out.println(s4.stelltSichVor());

        Object s5 = new JuraStudent();

        // Über die Referenz sind nur Methoden und Eigenschaften sichtbar, die der Referenztyp enthält



    }

}

abstract class Mensch {

    private String vorname;

    private String nachname;

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

    public abstract String stelltSichVor(); // Methode MUISS in den erbenden Klassen eingebaut werden
}

class Student extends Mensch { // Erbt von Mensch

    private boolean aktiv;

    private String matrikelNr;

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String stelltSichVor() {
        return getVorname() + " " + getNachname() + ", " + getMatrikelNr();
    }
}

class JuraStudent extends Student {

    private String rechtSpez;

    public String getRechtSpez() {
        return rechtSpez;
    }

    public void setRechtSpez(String rechtSpez) {
        this.rechtSpez = rechtSpez;
    }
}

class InformatikStudent extends Student {

    private boolean oca;

    public boolean isOca() {
        return oca;
    }

    public void setOca(boolean oca) {
        this.oca = oca;
    }
}