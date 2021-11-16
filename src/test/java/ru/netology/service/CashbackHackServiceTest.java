package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldRemainLessThenBoundaryJUnitVintage() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMoreThenBoundaryJUnitVintage() {
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainMultipleBoundaryJUnitVintage() {
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainZeroJUnitVintage() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainLessThenBoundary() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemainMoreThenBoundary() {
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test

    public void shouldRemainMultipleBoundary() {
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldRemainZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);
    }
}