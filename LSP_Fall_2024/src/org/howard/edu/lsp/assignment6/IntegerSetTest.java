package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerSetTest{
	private IntegerSet setA;
	private IntegerSet setB;
	private IntegerSet setC;
	private IntegerSet setD;
	
	@BeforeEach
	protected void setUp() {
		setA = new IntegerSet(new ArrayList<>(List.of(5, 1, 6, 2, 4)));
		setB = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
		setC = new IntegerSet(new ArrayList<>(List.of()));
		setD = new IntegerSet(new ArrayList<>(List.of(2, 1, 3)));
		
	}

	@Test
	void testClear() {
		// clears set A (5, 1, 6, 2, 4) to check emptiness
		assertFalse(setA.isEmpty());
		setA.clear();
		assertTrue(setA.isEmpty());
	}

	@Test
	void testLength() {
		// test length of set B (1, 2, 3) and empty set C
		assertEquals(3, setB.length());
		assertEquals(0, setC.length());
	}

	@Test
	void testEqualsObject() {
		// test if two sets (2, 1, 3) and (1, 2, 3) are equal
		assertTrue(setB.equals(setD));
		assertTrue(setD.equals(setB));
		
		// test if (1, 2, 3) and (1, 2, 3) is equal
		setD = new IntegerSet(new ArrayList<>(List.of(1, 2, 3)));
		assertTrue(setD.equals(setB));
		
		// test if non equal sets show as not equal
		assertFalse(setA.equals(setB));
		assertFalse(setC.equals(setD));
	}

	@Test
	void testContains() {
		// check if set (5, 1, 6, 2, 4) has a 1 and set (1, 2, 3) has a 3
		assertTrue(setA.contains(1));
		assertTrue(setB.contains(3));
		
		// check if the empty set has 10 and the set (2, 1, 3) has 6
		assertFalse(setC.contains(10));
		assertFalse(setD.contains(6));
	}

	@Test
	void testLargest() {
		// test for assertion error for empty set
		assertThrows(IntegerSetException.class, () -> setC.largest());
		
		// test if set (5, 1, 6, 2, 4) and set (1, 2, 3) returns largest, 6 and 3 respectively
		try {
			assertEquals(6, setA.largest());
			assertEquals(3, setB.largest());
		}
		catch (IntegerSetException e) {
			fail("Exception thrown in non-empty set");
		}
	}

	@Test
	void testSmallest() {
		setB.add(0);
		// test for assertion error for empty set
		assertThrows(IntegerSetException.class, () -> setC.smallest());
		
		// test if set (2, 1, 3) and (1, 2, 3, 0) return smallest, 1 and 0 respectively
		try {
			assertEquals(1, setD.smallest());
			assertEquals(0, setB.smallest());
		}
		catch (IntegerSetException e) {
			fail("Exception thrown in non-empty set");
		}
	}

	@Test
	void testAdd() {
		// Set C (empty set) has no items
		assertFalse(setC.contains(12));
		
		// Add 12 to set C and ensure it's there
		setC.add(12);
		assertTrue(setC.contains(12));
		assertEquals(1, setC.length());
		
		// Ensure duplicates are not added to set (will remain length = 1)
		setC.add(12);
		assertTrue(setC.contains(12));
		assertEquals(1, setC.length());
	}

	@Test
	void testRemove() {
		// Remove 2 from set B, (1, 2, 3)
		assertTrue(setB.contains(2));
		setB.remove(2);
		assertFalse(setB.contains(2));
		
		// Ensure that removing element that don't exist does nothing
		IntegerSet setBExpected = new IntegerSet(new ArrayList<>(List.of(1, 3)));
		setB.remove(10);
		assertTrue(setB.equals(setBExpected));
		
	}

	@Test
	void testUnion() {
		// make set B equal to (1, 2, 3, 7, 12)
		setB.add(7);
		setB.add(12);
		
		// test union of (5, 1, 6, 2, 4) and (1, 2, 3, 7, 12)
		IntegerSet unionSetExpected = new IntegerSet(new ArrayList<>(List.of(5, 1, 6, 2, 4, 3, 7, 12)));	
		setA.union(setB);
		assertTrue(setA.equals(unionSetExpected));
		
		// test that union of empty set C and (2, 1, 3) is the same as (2, 1, 3)
		setC.union(setD);
		assertTrue(setC.equals(setD));
	}

	@Test
	void testIntersect() {
		// test that intersect of (5, 1, 6, 2, 4) and (1, 2, 3) is (1, 2)
		IntegerSet interceptExpected = new IntegerSet(new ArrayList<>(List.of(1, 2)));
		setA.intersect(setB);
		assertTrue(setA.equals(interceptExpected));
		
		// test intersect of empty set and (2, 1, 3) is empty set
		setC.intersect(setD);
		assertTrue(setC.isEmpty());
		
	}

	@Test
	void testDiff() {
		// test that diff of (5, 1, 6, 2, 4) and (1, 2, 3) is (5, 6, 4)
		IntegerSet diffExpected = new IntegerSet(new ArrayList<>(List.of(5, 6, 4)));
		setA.diff(setB);
		assertTrue(setA.equals(diffExpected));
		
		// test that diff of (2, 1, 3) and empty set is just (2, 1, 3)
		IntegerSet setDOld = new IntegerSet(new ArrayList<>(List.of(2, 1, 3)));
		setD.diff(setC);
		assertTrue(setD.equals(setDOld));
	}

	@Test
	void testComplement() {
		// make U = (5, 1, 6, 2, 4) and set A = (5, 1, 4)
		IntegerSet universal = new IntegerSet(new ArrayList<>(List.of(5, 1, 6, 2, 4)));
		setA.remove(6);
		setA.remove(2);
		
		IntegerSet complementExpected = new IntegerSet(new ArrayList<>(List.of(6, 2)));
		setA.complement(universal);
		assertTrue(setA.equals(complementExpected));
	}

	@Test
	void testIsEmpty() {
		// assert empty set created is empty
		assertTrue(setC.isEmpty());
		
		// assert set (1, 2, 3) is not empty
		assertFalse(setB.isEmpty());
	}

	@Test
	void testToString() {
		// test that strings are working
		assertEquals("[5, 1, 6, 2, 4]", setA.toString());
		assertEquals("[]", setC.toString());
	}

}
