package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers with different algorithms.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {}

    /**
     * Returns the singleton instance of RandomNumberService.
     * @return the instance of RandomNumberService
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy.
     * @param strategy the strategy to set
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using set strategy.
     * @return a random positive integer
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.generateRandomNumber();
    }
}
