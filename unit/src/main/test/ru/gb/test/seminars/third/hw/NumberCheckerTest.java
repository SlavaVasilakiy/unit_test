package ru.gb.test.seminars.third.hw;

import org.junit.Test;
import third.hw.NumberChecker;

import static org.junit.Assert.*;

public class NumberCheckerTest {

    @Test
    public void testEvenOddNumberForEvenNumber() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(4));
    }

    @Test
    public void testEvenOddNumberForOddNumber() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.evenOddNumber(7));
    }

    @Test
    public void testEvenOddNumberForZero() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(0));
    }

    @Test
    public void testEvenOddNumberForNegativeEvenNumber() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.evenOddNumber(-2));
    }

    @Test
    public void testEvenOddNumberForNegativeOddNumber() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.evenOddNumber(-3));
    }
}
