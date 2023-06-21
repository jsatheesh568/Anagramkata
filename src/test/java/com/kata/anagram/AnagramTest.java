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

	@Test
	public void testGetAnagramsNoMatches() {
		List<String> expected = Arrays.asList();
		List<String> actual = anagram.getAnagrams("abc", Arrays.asList("def", "ghi", "jkl"));
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAnagramsCaseInsensitive() {
		List<String> expected = Arrays.asList("alert", "alter", "later");
		List<String> actual = anagram.getAnagrams("LaRtE", Arrays.asList("alert", "alter", "later", "tomato", "heart"));
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAnagramsDifferentLength() {
		List<String> expected = Arrays.asList();
		List<String> actual = anagram.getAnagrams("short", Arrays.asList("shorter", "shortest", "shorty"));
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAnagramsEmptyList() {
		List<String> expected = Arrays.asList();
		List<String> actual = anagram.getAnagrams("abc", Arrays.asList());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAnagramsEmptyString() {
		List<String> expected = Arrays.asList();
		List<String> actual = anagram.getAnagrams("", Arrays.asList("alert", "alter", "later"));
		assertEquals(expected, actual);
	}

}
