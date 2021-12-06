package com.horiaconstantin.coderust.trees;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.horiaconstantin.coderust.trees.LevelOrderTraversal.levelOrderTraversalAsList;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelOrderTraversalTest {

	@Test
	void levelOrderTraversal() {
		BinaryTreeNode bst = BinaryTree.createBST(asList(100, 50, 200, 25, 75, 350));

		Map<Integer, List<Integer>> actual = levelOrderTraversalAsList(bst);

		Map<Integer, List<Integer>> expected = Map.of(
				0, asList(100),
				1, asList(50, 200),
				2, asList(25, 75, 350));
		assertEquals(expected, actual);
	}
}