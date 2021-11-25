package com.horiaconstantin.coderust;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.FindLowHigh.findHighIndex;
import static com.horiaconstantin.coderust.FindLowHigh.findLowIndex;
import static org.junit.jupiter.api.Assertions.*;

class FindLowHighTest {

	int[] array = new int[]{0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};

	@Test
	void testFindLowIndex() {
		assertEquals(-1, findLowIndex(new int[]{}, -2));
		assertEquals(0, findLowIndex(new int[]{1}, 1));

		assertEquals(-1, findLowIndex(array, -2));
		assertEquals(0, findLowIndex(array, 0));
		assertEquals(19, findLowIndex(array, 6));
		assertEquals(-1, findLowIndex(array, 8));
	}

	@Test
	void testFindHighIndex() {
		assertEquals(-1, findLowIndex(new int[]{}, -2));
		assertEquals(0, findHighIndex(new int[]{1}, 1));

		assertEquals(-1, findHighIndex(array, -2));
		assertEquals(0, findHighIndex(array, 0));
		assertEquals(24, findHighIndex(array, 6));
		assertEquals(-1, findLowIndex(array, 8));
	}
}