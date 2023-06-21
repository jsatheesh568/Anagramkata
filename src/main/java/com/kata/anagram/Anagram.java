package com.kata.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Satheeshkumar S
 *
 */
public class Anagram {

	public List<String> getAnagrams(String word, List<String> possibleAnagrams) {
		List<String> anagrams = new ArrayList<>();
		char[] wordChars = word.toLowerCase().toCharArray();
		Arrays.sort(wordChars);
		String sortedWord = new String(wordChars);
		
		for (String possibleAnagram : possibleAnagrams) {
			if (possibleAnagram.length() != word.length()) {
				continue;
			}
			char[] anagramChars = possibleAnagram.toLowerCase().toCharArray();
			Arrays.sort(anagramChars);
			String sortedAnagram = new String(anagramChars);
			if (sortedAnagram.equals(sortedWord)) {
				anagrams.add(possibleAnagram);
			}
		}

		return anagrams;
	}

}
