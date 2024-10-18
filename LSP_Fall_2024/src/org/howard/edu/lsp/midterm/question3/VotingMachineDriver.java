package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        // Create an instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // Add candidates
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // Cast votes
        vm.castVote("Alsobrooks");  // Voting for Alsobrooks
        vm.castVote("Alsobrooks");  // Another vote for Alsobrooks
        vm.castVote("Hogan");        // Voting for Hogan

        // Print out the current voting results
        System.out.println(vm.toString()); // Display the candidates and their vote counts
    }
}