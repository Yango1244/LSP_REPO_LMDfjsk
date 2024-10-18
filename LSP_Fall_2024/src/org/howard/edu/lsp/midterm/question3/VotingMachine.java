package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {

	private Map<String, Integer> candidates;
	
	public VotingMachine() {
		candidates = new HashMap<>();
	}
	
	/**
     * Add candidate to voting machine.
     *
     * @param name, the candidate's name
     */
	public void addCandidate(String name) {
		candidates.put(name, 0);
	}
	
	 /**
     * Counts a vote for the candidate
     *
     * @param name, the candidate's name
     */
	public void castVote(String name) {
		candidates.put(name, candidates.get(name) + 1);
	}
	
	/**
     * Sets the Hashmap of votes as a string
     *
     * @return a string of candidates and their votes
     */
    @Override
	public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
}
}
