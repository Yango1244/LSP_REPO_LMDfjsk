package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {

	public static void main(String[] args) {
		VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString()); /* prints out candidate and number of votes … your choice of format */

	}

}