package de.provinzial;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RechnerTest {

    private Rechner rechner;

    @BeforeAll // Wird einmalig beim Strat der Testklasse ausgeführt
    public static void init() {
        System.out.println("### BEFORE ALL ####");
    }

    @BeforeEach // Wird vor jedem Testfall ausgeführt
    public void initEach() {
        System.out.println("### BEFORE EACH ####");
        rechner = new Rechner();
    }

    @Test
    public void testAdd() {
        rechner = new Rechner();
        double a = 10;
        double b = 15;
        double expected = 25;
        assertEquals(expected, rechner.add(a, b));
    }

    @Test
    public void testMulti() {
        rechner = new Rechner();
        double a = 10;
        double b = 15;
        double expected = 150;
        assertEquals(expected, rechner.multi(a, b));
    }
}
