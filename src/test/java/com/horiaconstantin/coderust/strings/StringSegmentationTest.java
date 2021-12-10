package com.horiaconstantin.coderust.strings;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static com.horiaconstantin.coderust.strings.StringSegmentation.canSegmentString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringSegmentationTest {

	@Test
	void testCanSegmentString() throws Exception {
		Set<String> dictionary = Set.of("hello", "hell", "on", "now");
		assertTrue(canSegmentString("hellonow", dictionary));

		Set<String> swordfishDict = Set.of("word", "sword", "fish", "as");
		assertTrue(canSegmentString("aswordfish", swordfishDict));

		Set<String> catsandogDict = Set.of("cats", "dog", "sand", "and", "cat");
		assertFalse(canSegmentString("catsandog", catsandogDict));

		Set<String> ccbbDict = Set.of("bc", "cb");
		assertFalse(canSegmentString("ccbb", ccbbDict));
	}
}