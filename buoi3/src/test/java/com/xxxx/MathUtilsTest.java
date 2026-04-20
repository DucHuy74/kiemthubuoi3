package com.xxxx;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    // ===== 1. Chu vi =====

    @Test
    void testPerimeter_EquivalenceValid() {
        // a > 0, b > 0
        assertEquals(10, MathUtils.rectanglePerimeter(2,3));
    }

    @Test
    void testPerimeter_Boundary() {
        // boundary: a = 1 (min valid)
        assertEquals(4, MathUtils.rectanglePerimeter(1,1));

        // boundary: a = 0 (invalid)
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectanglePerimeter(0,2));

        // outside boundary
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectanglePerimeter(-1,2));
    }

    // ===== 2. Diện tích =====

    @Test
    void testArea_EquivalenceValid() {
        assertEquals(6, MathUtils.rectangleArea(2,3));
    }

    @Test
    void testArea_Boundary() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectangleArea(0,2));

        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.rectangleArea(-1,2));
    }

    // ===== 3. PT bậc 2 =====

    @Test
    void testQuadratic_Equivalence() {
        // Δ > 0
        assertTrue(MathUtils.quadratic(1,-3,2).contains("x1"));

        // Δ = 0
        assertEquals("x=-1.0", MathUtils.quadratic(1,2,1));

        // Δ < 0
        assertEquals("No solution", MathUtils.quadratic(1,0,1));
    }

    @Test
    void testQuadratic_Boundary() {
        // a = 0 → chuyển thành bậc 1
        assertEquals("x=2.0", MathUtils.quadratic(0,2,-4));

        // a = 0, b = 0 → invalid
        assertEquals("No solution", MathUtils.quadratic(0,0,1));
    }

    // ===== 4. Ngày =====

    @Test
    void testDays_Equivalence() {
        assertEquals(31, MathUtils.daysInMonth(1,2024));
        assertEquals(30, MathUtils.daysInMonth(4,2024));
        assertEquals(29, MathUtils.daysInMonth(2,2024));
        assertEquals(28, MathUtils.daysInMonth(2,2023));
    }

    @Test
    void testDays_Boundary() {
        // boundary
        assertEquals(31, MathUtils.daysInMonth(12,2024));

        // invalid
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.daysInMonth(0,2024));

        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.daysInMonth(13,2024));
    }

    // ===== 5. Prime =====

    @Test
    void testPrime_Equivalence() {
        assertTrue(MathUtils.isPrime(2));
        assertFalse(MathUtils.isPrime(4));
    }

    @Test
    void testPrime_Boundary() {
        // boundary
        assertFalse(MathUtils.isPrime(1));

        // n < 0
        assertFalse(MathUtils.isPrime(-5));
    }

    // ===== 6. Alternating =====

    @Test
    void testAlternating_Equivalence() {
        assertEquals(1, MathUtils.alternatingSum(1));
        assertEquals(-1, MathUtils.alternatingSum(2));
        assertEquals(2, MathUtils.alternatingSum(3));
    }

    @Test
    void testAlternating_Boundary() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.alternatingSum(0));

        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.alternatingSum(-1));
    }

    // ===== 7. GCD =====

    @Test
    void testGCD_Equivalence() {
        assertEquals(2, MathUtils.gcd(6,8));
        assertEquals(5, MathUtils.gcd(10,5));
    }

    @Test
    void testGCD_Boundary() {
        // boundary
        assertEquals(5, MathUtils.gcd(0,5));

        // invalid
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.gcd(-1,5));

        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.gcd(-5,-10));
    }

    // ===== 8. Factorial Sum =====

    @Test
    void testFactorial_Equivalence() {
        assertEquals(1, MathUtils.factorialSum(1));
        assertEquals(3, MathUtils.factorialSum(2));
        assertEquals(9, MathUtils.factorialSum(3));
    }

    @Test
    void testFactorial_Boundary() {
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorialSum(0));

        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.factorialSum(-1));
    }
}