package com.example.l34;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class IsEvenCustomTest {

    @Autowired
    public IsEvenCustom isEvenCustom;

    @Test
    public void testIsEvenWithPositiveEvenNumber() {

        assertTrue(isEvenCustom.isEven(4), "4 should be even");
    }

    @Test
    public void testIsEvenWithPositiveOddNumber() {
        assertFalse(isEvenCustom.isEven(5), "5 should be odd");
    }

    @Test
    public void testIsEvenWithNegativeEvenNumber() {
        assertTrue(isEvenCustom.isEven(-2), "-2 should be even");
    }

    @Test
    public void testIsEvenWithNegativeOddNumber() {
        assertFalse(isEvenCustom.isEven(-3), "-3 should be odd");
    }

    @Test
    public void testIsEvenWithZero() {
        assertTrue(isEvenCustom.isEven(0), "0 should be even");
    }
}
