package com.kata.anagram;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author : Satheeshkumar S
 *
 */
public class AnagramTest {
	
	@Test
	public void testGetAnagrams() {
		Anagram anagram = new Anagram();
		List<String> expected = Arrays.asList("alert", "alter", "later");
		List<String> actual = anagram.getAnagrams("larte",
				Arrays.asList("alert", "alter", "later", "tomato", "heart"));
		assertEquals(expected, actual);
	}

}
