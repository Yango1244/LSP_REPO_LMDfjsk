package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;


/**
 * Random number generator with Java's built in "Random".
 */
public class JavaRandomStrategy implements RandomNumberStrategy {
    private final Random random = new Random();

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}
