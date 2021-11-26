package com.horiaconstantin.coderust.linkedlist;

public class LinkedList {

	public static LinkedListNode createLinkedList(int[] values) {
		LinkedListNode head = null;
		LinkedListNode current = null;
		for (int value : values) {
			LinkedListNode node = new LinkedListNode(value);
			if (head == null) {
				head = node;

			} else {
				current.next = node;
			}
			current = node;
		}
		return head;
	}

	public static int findLength(LinkedListNode head) {
		LinkedListNode current = head;
		int length = 0;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
}
