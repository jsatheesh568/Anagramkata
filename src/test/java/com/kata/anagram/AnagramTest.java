package com.kata.anagram;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author : Satheeshkumar S
 *
 */
public class AnagramTest {

	private Anagram anagram;

	@Before
	public void setUp() {
		anagram = new Anagram();
	}

	@Test
	public void testGetAnagrams() {

		List<String> expected = Arrays.asList("alert", "alter", "later");
		List<String> actual = anagram.getAnagrams("larte", Arrays.asList("alert", "alter", "later", "tomato", "heart"));
		assertEquals(expected, actual);
	}

}
