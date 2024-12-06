package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to test RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        // Get the singleton instance of the service
        RandomNumberService randomService = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        randomService.setStrategy(new JavaRandomStrategy());
        System.out.println("Random number from built in random: " + randomService.generateRandomNumber());

        // Use LCG random number generator
        randomService.setStrategy(new CustomRandomStrategy());
        System.out.println("Random number from internet algorithm: " + randomService.generateRandomNumber());
    }
}
