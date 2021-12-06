package com.horiaconstantin.coderust.strings;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.strings.PalindromeSubStrings.findAllPalindromeSubstrings;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeSubStringsTest {

	@Test
	void testFindAllPalindromeSubstrings() {
		int count = findAllPalindromeSubstrings("aabbbaa");
		assertEquals(7, count);

		count = findAllPalindromeSubstrings("aa");
		assertEquals(1, count);

		count = findAllPalindromeSubstrings("ab");
		assertEquals(0, count);

		count = findAllPalindromeSubstrings("xabcbax");
		assertEquals(3, count);

		count = findAllPalindromeSubstrings("abbaeae");
		assertEquals(4, count);

		count = findAllPalindromeSubstrings("abaab");
		assertEquals(3, count);
	}
}