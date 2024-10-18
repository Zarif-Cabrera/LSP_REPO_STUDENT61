package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;

/**
 * The VotingMachine class represents a simple voting machine that manages a list of candidates and allows users to cast votes for them.
 */
public class VotingMachine {
    // HashMap to store candidates and their vote counts
    private HashMap<String, Integer> candidates;

    /**
     * Initialize the VotingMachine with an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the voting machine. 
     * If the candidate already there, their vote count is not changed.
     *
     * @param name, the name of the candidate to be added
     * referenced this site to make this: https://www.geeksforgeeks.org/hashmap-putifabsentkey-value-method-in-java-with-examples/
     */
    public void addCandidate(String name) {
        // Initialize the candidate's vote count to 0 if not already present
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for a specified candidate.
     * If the candidate doesn't exist, print an error message.
     *
     * @param name, the name of the candidate for whom the vote is being cast
     */
    public void castVote(String name) {
        // Check if the candidate exists before casting a vote
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate not found: " + name);
        }
    }

    /**
     * Returns a string representation of the voting results, showing each candidate and their vote count.
     *
     * @return a string summarizing the vote counts for all candidates
     * referenced this: https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/#
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String candidate : candidates.keySet()) {
            result.append(candidate);
            result.append(": ");
            result.append(candidates.get(candidate));
            result.append(" votes\n");
        }
        return result.toString();
    }
}
