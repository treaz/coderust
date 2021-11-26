package com.horiaconstantin.coderust.linkedlist;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.linkedlist.LinkedList.createLinkedList;
import static com.horiaconstantin.coderust.linkedlist.Reverse.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseTest {

	@Test
	void testReverse() {
		LinkedListNode linkedList = createLinkedList(new int[]{7, 14, 21, 28});

		LinkedListNode actual = reverse(linkedList);

		assertEquals(createLinkedList(new int[]{28, 21, 14, 7}), actual);
	}

	@Test
	void testReverseNull() {
		LinkedListNode linkedList = createLinkedList(new int[]{});

		assertNull(reverse(linkedList));
	}

	@Test
	void testReverseSingle() {
		LinkedListNode linkedList = createLinkedList(new int[]{1});

		assertEquals(createLinkedList(new int[]{1}), reverse(linkedList));
	}

}