package ru.gb.test.seminars.third.hw;

import org.junit.Test;
import third.hw.IntervalChecker;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class IntervalCheckerTest {

    @Test
    public void testNumberInInterval() {
        assertTrue(IntervalChecker.isNumberInInterval(50));
    }

    @Test
    public void testNumberBelowInterval() {
        assertFalse(IntervalChecker.isNumberInInterval(20));
    }

    @Test
    public void testNumberAboveInterval() {
        assertFalse(IntervalChecker.isNumberInInterval(110));
    }

    @Test
    public void testLowerBound() {
        assertFalse(IntervalChecker.isNumberInInterval(25));
    }

    @Test
    public void testUpperBound() {
        assertFalse(IntervalChecker.isNumberInInterval(100));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () ->
                IntervalChecker.isNumberInInterval(Integer.parseInt("invalid")));
    }
}


