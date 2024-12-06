package org.howard.edu.lsp.finalexam.question2;

/**
 * Random number generator from Linear Congruential Generator (LCG) algorithm.
 */
public class CustomRandomStrategy implements RandomNumberStrategy {
    private long seed = System.nanoTime();
    private static final long MULTIPLIER = 25214903917L;
    private static final long INCREMENT = 11L;
    private static final long MODULUS = (1L << 48);

    @Override
    public int generateRandomNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) (Math.abs(seed) % Integer.MAX_VALUE) + 1;
    }
}

// Algorithm based off this
// https://www.geeksforgeeks.org/java-program-to-implement-the-linear-congruential-generator-for-pseudo-random-number-generation/
