package com.horiaconstantin.coderust.arrays;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.arrays.FindSum.findSumOfTwo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindSumTest {

	@Test
	void testFindSumOfTwo() {
		int[] v = new int[]{5, 7, 1, 2, 8, 4, 3};

		assertTrue(findSumOfTwo(v, 3));
		assertFalse(findSumOfTwo(v, 300));
	}

	@Test
	void testFindSumOfTwoEmptyArray() {
		int[] v = new int[]{};

		assertFalse(findSumOfTwo(v, 0));
	}

	@Test
	void testFindSumOfTwoOneElemArray() {
		int[] v = new int[]{1};

		assertFalse(findSumOfTwo(v, 1));
	}

	@Test
	void testFindSumOfTwoWithnegatives() {
		int[] v = new int[]{5, 7, 1, -2, 8, 4, 3};

		assertTrue(findSumOfTwo(v, -1));
	}
}