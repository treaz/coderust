package com.horiaconstantin.coderust.misc;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.misc.SumOfThree.findSumOfThree;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumOfThreeTest {

	@Test
	void testFindSumOfThree() {
		int[] arr = {3, 7, 1, 2, 8, 4, 5};

		assertTrue(findSumOfThree(arr, 20));
		assertTrue(findSumOfThree(arr, 10));
		assertFalse(findSumOfThree(arr, 21));
		assertFalse(findSumOfThree(arr, 0));
		assertFalse(findSumOfThree(new int[]{}, 0));
	}
}