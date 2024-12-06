package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * strategy that uses Java's built-in Random class to generate a random number.
 * This strategy implements the RandomNumberStrategyInterface and generates random 
 * positive integers using the Java Random class.
 */
public class JavaRandomNumberStrategy implements RandomNumberStrategyInterface { 
    
    // Instance of Java's Random class to generate random numbers
    private Random random;

    /**
     * Constructor that initializes the Random object.
     * The Random object is used for generating random numbers.
     */
    public JavaRandomNumberStrategy() {
        this.random = new Random();
    }

    /**
     * Generates a random positive integer using Java's Random class.
     * The generated number is a positive integer within the range of Integer.MAX_VALUE.
     * 
     * @return A random positive integer
     */
    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;  // Ensures a positive integer
    }
}
