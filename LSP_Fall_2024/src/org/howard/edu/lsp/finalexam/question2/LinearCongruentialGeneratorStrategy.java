package org.howard.edu.lsp.finalexam.question2;

//found this algorithm https://www.geeksforgeeks.org/java-program-to-implement-the-linear-congruential-generator-for-pseudo-random-number-generation/
//pretty sure number is pseudo random where it is a random number based on seed value, so it will stay same if seed stays same.
//in the client, I switch up the seed to demonstrate this.

public class LinearCongruentialGeneratorStrategy implements RandomNumberStrategyInterface {
    private long state;
    private static final long a = 1664525L;
    private static final long c = 1013904223L;
    private static final long m = (1L << 32); // 2^32

    public LinearCongruentialGeneratorStrategy(long seed) {
        this.state = seed;
    }

    @Override
    public int generateRandomNumber() {
        state = (a * state + c) % m;
        return (int) state;
    }
}


