package org.howard.edu.lsp.finalexam.question2;

/**
 * The RandomNumberService class provides a singleton service for generating random numbers
 * using different strategies. The strategy to be used is provided at runtime, and the service
 * allows for the generation of random numbers based on the selected strategy.
 */
public class RandomNumberService {
    
    // Singleton instance of the RandomNumberService
    private static RandomNumberService instance;
    
    // Strategy used for random number generation
    private RandomNumberStrategyInterface strategy; 

    /**
     * Private constructor to prevent instantiation from outside.
     * This ensures that the RandomNumberService can only be instantiated once (singleton).
     */
    private RandomNumberService() {}

    /**
     * Returns the singleton instance of RandomNumberService.
     * If an instance does not exist, a new one is created.
     * 
     * @return The singleton instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy to be used for generating random numbers.
     * The strategy can be switched at runtime.
     * 
     * @param strategy, The strategy to use for generating random numbers
     */
    public void setStrategy(RandomNumberStrategyInterface strategy) { 
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the currently selected strategy.
     * If no strategy has been set, an IllegalStateException is thrown.
     * 
     * @return A random positive integer based on the selected strategy
     * @throws IllegalStateException if no strategy has been set
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set.");
        }
        return strategy.generateRandomNumber(); 
    }
}
