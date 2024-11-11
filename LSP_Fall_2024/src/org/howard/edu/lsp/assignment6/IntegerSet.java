package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class IntegerSet {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
	/**
	 * Clear the current set of all it's values
	 */
	public void clear() {
		this.set.clear();
	};

	// Returns the length of the set. 5 pts.
	/**
	 * Return the current size of the set
	 * @return set length
	 */
	public int length() {
		return this.set.size();
	}; // returns the length

	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class. 10 pts.
	*/
	/**
	 * Checks to see if two sets have the same values in any order
	 * @param o the other set object to compare
	 * @return boolean, true if set is equal and false otherwise
	 */
	public boolean equals(Object o) {
		IntegerSet set2 = (IntegerSet) o;
		return this.set.containsAll(set2.set) && set2.set.containsAll(this.set);
	}; 

	// Returns true if the set contains the value, otherwise false. 5 pts.
	/**
	 * Check if value is inside of set
	 * @param value, the value thats checked for
	 * @return boolean that's true if value is in set, and false otherwise
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	};    
	
	// Returns the largest item in the set. 5 pts.
	/**
	 * Finds the largest value in the set and returns it
	 * @return largest set value
	 */
	public int largest() throws IntegerSetException  {
		if (!this.set.isEmpty()) {
			return Collections.max(this.set);
		}
		
		else {
			throw new IntegerSetException("Can't retrieve largest of empty list");
		}
		
	}; 

	// Returns the smallest item in the set. 5 pts.
	/**
	 * Finds the smallest value in the set and returns it
	 * @return smallest set value
	 */
	public int smallest() throws IntegerSetException {
		if (!this.set.isEmpty()) {
			return Collections.min(this.set);
		}
		
		else {
			throw new IntegerSetException("Can't retrieve smallest of empty list");
		}
	};

	// Adds an item to the set or does nothing it already there. 5 pts.
	/**
	 * Adds a value to the set, or does nothing if set already has value
	 * @param item, value to be added to the set
	 */
 	public void add(int item) {
 		if (this.set.contains(item)){
 			return;
 		}
 		this.set.add(item);
 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there. 5 pts.
 	/**
 	 * Removes value from the set, or does nothing if value is not in set
 	 * @param item, value to be removed from set
 	 */
	public void remove(int item) {
		if (!this.set.contains(item)) {
			return;
		}
		this.set.remove(Integer.valueOf(item));
	}; 

	// Set union. 11 pts.
	/**
	 * Performs a set union operation, where values of two sets are combined with no duplicates
	 * @param intSetb, the second set
	 */
	public void union(IntegerSet intSetb) {
		for (Integer num : intSetb.set) {
			this.add(num);
		}
		
	};

	// Set intersection, all elements in s1 and s2. 12 pts.
	/**
	 * Performs a set intersection operation, where only the values the two sets share are added
	 * @param intSetb, the second set
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersect = new ArrayList<>();
	    for (Integer num : this.set) {
	        if (intSetb.contains(num)) {
	            intersect.add(num);
	        }
	    }
	    this.set = intersect;
	}; 

	// Set difference, i.e., s1 –s2. 12 pts.
	/**
	 * Performs a set difference operation, where the values that are in the first set but
	 * not the second are shown
	 * @param intSetb, the second set
	 */
	public void diff(IntegerSet intSetb) {
		for (Integer num : intSetb.set) {
			if (this.contains(num)) {
				this.remove(num);
			}
		}
	}; // set difference, i.e. s1 - s2

	// Set complement, all elements not in s1. 11 pts.
	/**
	 * Provides the complement of a set when checked with a universal set
	 * @param intSetb, the universal set
	 */
	public void complement(IntegerSet intSetb) {
		List<Integer> complement = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                complement.add(item);
            }
        }
        this.set = complement;
	}

	// Returns true if the set is empty, false otherwise. 5 pts.
	/**
	 * Checks to see if set is empty or not
	 * @return boolean which is true if the set is empty, and false otherwise
	 */
	boolean isEmpty() {
		return this.set.isEmpty();
	}; 

	// Return String representation of your set.  This overrides the equal method from 
	// the Object class. 5 pts.
	/**
	 * Makes a string representation of the set
	 */
	public String toString() {
		return this.set.toString();
	};	// return String representation of your set


}
