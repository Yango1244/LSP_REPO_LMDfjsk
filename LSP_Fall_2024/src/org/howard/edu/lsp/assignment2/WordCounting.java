/**
*  Name: Oluwayimika Adeyemi
*/
package org.howard.edu.lsp.assignment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class WordCounting {

	public static void main(String[] args) {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		File testFile = new File("src/org/howard/edu/lsp/assignment2/words.txt");
		try {
			Scanner myScanner = new Scanner(testFile);
			while (myScanner.hasNext()) {
				String s = myScanner.next().toLowerCase();
				List<Character> punctuations = Arrays.asList(',', '!', '?', '.', ':', ';');
				char lastChar = s.charAt(s.length() - 1);

				// if word has an apostrophe, split by apostrophe and try adding words to
				// Hashmap
				if (s.contains("'")) {
					String[] arrString = s.split("'");
					for (int i = 0; i < arrString.length; i++) {
						addWord(words, arrString[i]);
					}
				}

				// if word has punctuation at the end, remove it and try adding to Hashmap
				else if (punctuations.contains(lastChar)) {
					addWord(words, s.substring(0, s.length() - 1));
				}

				// try adding any other word to Hashmap
				else {
					addWord(words, s);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		// display word count
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key + " " + value);
		}
	}

	// function to check if string is just digits
	public static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// function to add value to Hashmap
	public static void addWord(HashMap<String, Integer> words, String s) {

		// any string that's trivial or just digit's is not added
		if (s.length() <= 3 || isNumeric(s)) {
			return;
		}

		// if string is not in Hashmap, gets added with value as 1
		if (words.getOrDefault(s, 0) == 0) {
			words.put(s, 1);
		}

		// if string is already in Hashmap, value gets incremented by 1
		else {
			words.put(s, words.get(s) + 1);
		}
	}
}
