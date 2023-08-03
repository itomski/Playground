package de.provinzial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameSelectorTest {

    @Test
    public void getName() {
        String expected = "Bruce";
        NameSelector selector = new NameSelector();
        assertEquals(expected, selector.getName(0));
    }

    @Test
    public void getName_Null() {
        NameSelector selector = new NameSelector();
        assertNull(selector.getName(15));
    }

    @Test
    public void getIndex() {
        String name = "Carol";
        int expected = 1;
        NameSelector selector = new NameSelector();
        assertEquals(expected, selector.getIndex(name));
    }

    @Test
    public void getIndex_GtZero() {
        String name = "Carol";
        NameSelector selector = new NameSelector();
        assertTrue(selector.getIndex(name) > 0);
    }

    @Test
    public void getIndex_LtZero() {
        String name = "Hans";
        NameSelector selector = new NameSelector();
        assertTrue(selector.getIndex(name) < 0);
    }
}
