package org.howard.edu.lsp.assignment5;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Add method test
		IntegerSet set1 = new IntegerSet();
		set1.add(10);
		set1.add(3);
		set1.add(4);
		set1.add(4);

		// toString, smallest, and largest test
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		
		System.out.println();

		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(4);
		set2.add(5);

		// Union test
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		// Set1: [1,2,3]
		System.out.println("Value of Set2 is: " + set2.toString());
		// Set2: [3,4,5]
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());	// result of union of set1 and set2
		// Result: [1,2,3,4,5]
		System.out.println();
		
		// Clear and isEmpty test
		System.out.println("Set 1 " + set1.toString());
		System.out.println("Set 1 is empty: " + set1.isEmpty());
		System.out.println("Clearing set1 ");
		set1.clear();
		System.out.println("The now clear set1 is: " + set1.toString());
		System.out.println("Set 1 is empty: " + set1.isEmpty());
		System.out.println();
		
		// Length test
		set1.add(14);
		set1.add(4);
		set1.add(10);
		System.out.println("The length of set " + set1.toString() + " is " + set1.length());
		System.out.println();
		
		// Equal test
		System.out.println("Set1 " + set1.toString() + " and Set2 " + set2.toString() + " are equal: " + set1.equals(set2));
		set1.clear();
		set1.add(4);
		set1.add(5);
		set1.add(2);
		System.out.println("Set1 " + set1.toString() + " and Set2 " + set2.toString() + " are equal: " + set1.equals(set2));
		IntegerSet set3 = new IntegerSet();
		set3.add(2);
		set3.add(4);
		set3.add(5);
		System.out.println("Set3 " + set3.toString() + " and Set2 " + set2.toString() + " are equal: " + set3.equals(set2));
		System.out.println();
		
		// Contains test
		System.out.println("Set1 " + set1.toString() + " contains 4: " + set1.contains(4));
		System.out.println("Set1 " + set1.toString() + " contains 10: " + set1.contains(10));
		System.out.println();
		
		// Remove test
		System.out.println("Set1 is: " + set1.toString());
		System.out.println("Removing 4");
		set1.remove(4);
		System.out.println("Set1 is: " + set1.toString());
		System.out.println("Removing 9");
		set1.remove(9);
		System.out.println("Set1 is: " + set1.toString());
		System.out.println();
		
		// Set intersect test
		set1.clear();
		set1.add(10);
		set1.add(5);
		set1.add(2);
		set1.add(6);
		set1.add(12);
		System.out.println("Set1 is: " + set1.toString());
		System.out.println("Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("The intersect of set1 and set2: " + set1.toString());

		// Testing diff
		set1.clear();
		set1.add(10);
		set1.add(5);
		set1.add(2);
		set1.add(6);
		set1.add(12);
		set1.diff(set2);
		System.out.println("The set difference of set1 and set2 " + set1.toString());
		System.out.println();
		
		// Testing complement
		IntegerSet universalSet = new IntegerSet();
		universalSet.add(3);
		universalSet.add(9);
		universalSet.add(2);
		universalSet.add(15);
		universalSet.add(5);
		universalSet.add(8);
		System.out.println("The universal set is " + universalSet.toString());
		
		set1.clear();
		set1.add(15);
		set1.add(8);
		set1.add(2);
		set1.add(9);
		System.out.println("Set1 is " + set1.toString());
		
		set1.complement(universalSet);
		System.out.println("The complement of set1 is " + set1.toString());
		




	}

}
