package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private final MathUtils mathUtils = new MathUtils();

	@Test
	void testFactorial() {
		assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
		assertEquals(1, mathUtils.factorial(1), "Factorial of 1 should be 1");
		assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
		assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
               "Factorial of negative numbers should throw IllegalArgumentException");
	}

	@Test
	void testIsPrime() {
		assertFalse(mathUtils.isPrime(4), "4 is not a prime number");
		assertTrue(mathUtils.isPrime(7), "7 is a prime number");
		assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
        assertFalse(mathUtils.isPrime(0), "0 is not a prime number");
        assertFalse(mathUtils.isPrime(-3), "-3 is not a prime number");
		
	}

	@Test
	void testGcd() {
		assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
		assertEquals(12, mathUtils.gcd(0, 12), "GCD of 0 and 12 should be 12");
		assertEquals(6, mathUtils.gcd(6, 0), "GCD of 6 and 0 should be 6");
		assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
                "GCD of 0 and 0 should throw IllegalArgumentException");
		
	}

}
