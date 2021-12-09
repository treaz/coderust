package com.horiaconstantin.coderust.strings;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.strings.RegxMatch.regxMatch;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// The implementation assumes the pattern is correct
// I might need to revisit this algorithm to understand it better:
// https://leetcode.com/problems/regular-expression-matching/discuss/5802/Simple-java-recursive-solution-with-two-cases
class RegxMatchTest {

	@Test
	void testRegxMatchMatches() throws Exception {

		assertTrue(regxMatch("aabbbbbcdda", "a*bb*cdda"));
		assertTrue(regxMatch("aabbbbbcdda", "a*bb*.dda"));
		assertTrue(regxMatch("aabbbbbcdda", "aab*e*cd*a"));
		assertTrue(regxMatch("aabbbbbcdda", "a*b*c*d*a*"));
		assertTrue(regxMatch("aabbbbbcdda", ".*b*c*d*a*"));
		assertTrue(regxMatch("aabbbbbcdda", "aabbbbbcdda"));

		assertTrue(regxMatch("aab", "c*a*b"));
	}

	@Test
	void testRegxMatchStatingWithAll() throws Exception {

		assertTrue(regxMatch("aabbbbbcdda", ".*"));
		assertTrue(regxMatch("aabbbbbcdda", ".*da"));
	}

	@Test
	void testRegxMatchNotMatching() {
		assertFalse(regxMatch("aabbbbbcdda", "aabbbbbcdd"));
		assertFalse(regxMatch("aabbbbbcdda", "a*b*c*da"));
	}
}