package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class that demonstrates the use of the RandomNumberService 
 * with different random number generation strategies.
 * This class allows the user to switch between multiple strategies 
 * for generating random numbers at runtime and prints the generated 
 * random numbers to the console.
 */
public class RandomNumberClient {

    /**
     * main method that demonstrates how the RandomNumberService can be used with different 
     * strategies for generating random numbers.
     * 
     * @param args Command-line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator strategy
        service.setStrategy(new JavaRandomNumberStrategy());
        System.out.println("Java Random Number: " + service.generateRandomNumber());

        // Use the Linear Congruential Generator (LCG) strategy for random number generation
        service.setStrategy(new LinearCongruentialGeneratorStrategy(service.generateRandomNumber())); // Using random seed
        System.out.println("LCG Random Number: " + service.generateRandomNumber());
        service.setStrategy(new LinearCongruentialGeneratorStrategy(12345)); // Using seed 12345
        System.out.println("LCG Random Number: " + service.generateRandomNumber());
}
}
