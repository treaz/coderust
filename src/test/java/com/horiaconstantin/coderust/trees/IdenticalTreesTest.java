package com.horiaconstantin.coderust.trees;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.trees.IdenticalTrees.areIdentical;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IdenticalTreesTest {

	@Test
	void testAreIdentical() {
		BinaryTreeNode tree1 = BinaryTree.createBST(asList(100, 50, 200, 25, 75, 125, 350));
		BinaryTreeNode tree2 = BinaryTree.createBST(asList(100, 50, 200, 25, 75, 125, 350));

		assertTrue(areIdentical(tree1, tree2));
	}

	@Test
	void testAreIdenticalNot() {
		BinaryTreeNode tree1 = BinaryTree.createBST(asList(100, 50, 200, 25, 75, 125, 350));
		BinaryTreeNode tree2 = BinaryTree.createBinaryTree(7);

		assertFalse(areIdentical(tree1, tree2));
	}

	@Test
	void testAreIdenticalCornerCases() {
		BinaryTreeNode tree1 = BinaryTree.createRandomBST(2);

		assertFalse(areIdentical(tree1, null));
	}
}