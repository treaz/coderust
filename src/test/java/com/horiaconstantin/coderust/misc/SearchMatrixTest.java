package com.horiaconstantin.coderust.misc;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.misc.SearchMatrix.searchInMatrix;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchMatrixTest {

	@Test
	void testSearchInMatrix() {
		int[][] matrix = new int[][]{
				{2, 4, 9, 13, 15},
				{3, 5, 11, 18, 22},
				{6, 8, 16, 21, 28},
				{9, 11, 20, 25, 31},
		};

		assertEquals(new IntPair(2, 1), searchInMatrix(matrix, 8));
		assertEquals(new IntPair(1, 2), searchInMatrix(matrix, 11));
		assertEquals(new IntPair(-1, -1), searchInMatrix(new int[][]{}, 11));
	}
}