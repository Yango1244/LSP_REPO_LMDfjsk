package org.howard.edu.lsp.midterm.question2;

public class Calculator {

	/**
     * Print the sum of two integers.
     *
     * @param a first integer
     * @param b second integer
     * @return a and b's sum
     */
	public static int sum(int a, int b) {
		return a + b;
	}
	
	/**
     * Sums two double values.
     *
     * @param a first double
     * @param b second double
     * @return a and b's sum
     */
	public static double sum(double a, double b) {
		return a + b;
	}
	
	/**
     * Sums of all array elements.
     *
     * @param array of numbers
     * @return sum of all elements
     */
	public static int sum(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum = sum + num;
		}
		return sum;
	}

}
