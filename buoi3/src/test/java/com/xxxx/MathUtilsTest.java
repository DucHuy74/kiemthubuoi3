package com.xxxx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    // ===== ISSUE #1: VALID TEST CASES =====

    @Test
    void testPerimeter() {
        assertEquals(10, MathUtils.rectanglePerimeter(2,3));
        assertEquals(4, MathUtils.rectanglePerimeter(1,1));
    }

    @Test
    void testArea() {
        assertEquals(6, MathUtils.rectangleArea(2,3));
    }

    @Test
    void testQuadratic() {
        assertTrue(MathUtils.quadratic(1,-3,2).contains("x1"));
        assertEquals("x=-1.0", MathUtils.quadratic(1,2,1));
        assertEquals("No solution", MathUtils.quadratic(1,0,1));
        assertEquals("x=2.0", MathUtils.quadratic(0,2,-4));
    }

    @Test
    void testDays() {
        assertEquals(31, MathUtils.daysInMonth(1,2024));
        assertEquals(30, MathUtils.daysInMonth(4,2024));
        assertEquals(29, MathUtils.daysInMonth(2,2024));
        assertEquals(28, MathUtils.daysInMonth(2,2023));
    }

    @Test
    void testPrime() {
        assertTrue(MathUtils.isPrime(2));
        assertFalse(MathUtils.isPrime(4));
    }

    @Test
    void testAlternating() {
        assertEquals(1, MathUtils.alternatingSum(1));
        assertEquals(-1, MathUtils.alternatingSum(2));
        assertEquals(2, MathUtils.alternatingSum(3));
    }

    @Test
    void testGCD() {
        assertEquals(2, MathUtils.gcd(6,8));
        assertEquals(5, MathUtils.gcd(10,5));
        assertEquals(5, MathUtils.gcd(0,5));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MathUtils.factorialSum(1));
        assertEquals(3, MathUtils.factorialSum(2));
        assertEquals(9, MathUtils.factorialSum(3));
    }
}