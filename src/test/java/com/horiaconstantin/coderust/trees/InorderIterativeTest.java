package com.horiaconstantin.coderust.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.horiaconstantin.coderust.trees.InorderIterative.iterativeInorder;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class InorderIterativeTest {

	@Test
	void testIterativeInorder() {
		BinaryTreeNode bst = BinaryTree.createBST(asList(100, 50, 200, 25, 75, 125, 350));

		List<Integer> binaryTreeNodes = iterativeInorder(bst);

		assertIterableEquals(asList(25, 50, 75, 100, 125, 200, 350), binaryTreeNodes);
	}
}