package com.horiaconstantin.coderust.linkedlist;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.linkedlist.LinkedList.createLinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateListTest {

	@Test
	void rotateListPositive() {
		LinkedListNode listHead = createLinkedList(new int[]{1, 2, 3, 4, 5});

		LinkedListNode expectedListHead = createLinkedList(new int[]{5, 1, 2, 3, 4});

		LinkedListNode actual = RotateList.rotateList(listHead, 1);
		assertEquals(expectedListHead, actual);
	}

	@Test
	void rotateListPositiveOverflow() {
		LinkedListNode listHead = createLinkedList(new int[]{1, 2, 3, 4, 5});

		LinkedListNode expectedListHead = createLinkedList(new int[]{4, 5, 1, 2, 3});

		LinkedListNode actual = RotateList.rotateList(listHead, 7);
		assertEquals(expectedListHead, actual);
	}

	@Test
	void rotateListNegative() {
		LinkedListNode listHead = createLinkedList(new int[]{1, 2, 3, 4, 5});

		LinkedListNode expectedListHead = createLinkedList(new int[]{3, 4, 5, 1, 2});

		LinkedListNode actual = RotateList.rotateList(listHead, -2);
		assertEquals(expectedListHead, actual);
	}
}