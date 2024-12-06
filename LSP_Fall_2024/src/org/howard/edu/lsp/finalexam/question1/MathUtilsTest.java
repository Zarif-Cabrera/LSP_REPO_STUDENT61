package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // Test factorial method
    @Test
    public void testFactorialPositive() {
        assertEquals(120, mathUtils.factorial(5));  // 6! = 720
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, mathUtils.factorial(0));  // 0! = 1
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, mathUtils.factorial(1));  // 1! = 1
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);  // should throw IllegalArgumentException
        });
    }

    // Test isPrime method
    @Test
    public void testIsPrimeTrue() {
        assertTrue(mathUtils.isPrime(5));  // 5 is prime
    }

    @Test
    public void testIsPrimeFalse() {
        assertFalse(mathUtils.isPrime(4));  // 4 is not prime
    }

    @Test
    public void testIsPrimeNegative() {
        assertFalse(mathUtils.isPrime(-5));  // Negative numbers are not prime
    }

    @Test
    public void testIsPrimeZero() {
        assertFalse(mathUtils.isPrime(0));  // 0 is not prime
    }

    @Test
    public void testIsPrimeOne() {
        assertFalse(mathUtils.isPrime(1));  // 1 is not prime
    }

    // Test gcd method
    @Test
    public void testGcdPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24));  // GCD of 54 and 24 is 6
    }

    @Test
    public void testGcdNegativeNumbers() {
        assertEquals(6, mathUtils.gcd(-54, -24));  // GCD of -54 and -24 is 6
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(24, mathUtils.gcd(0, 24));  // GCD of 0 and 24 is 24
        assertEquals(54, mathUtils.gcd(54, 0));  // GCD of 54 and 0 is 54
    }

    @Test
    public void testGcdBothZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);  // should throw IllegalArgumentException
        });
    }
}
