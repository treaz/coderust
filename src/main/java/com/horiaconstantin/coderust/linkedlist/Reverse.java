package com.horiaconstantin.coderust.linkedlist;

class Reverse {

	public static LinkedListNode reverse(LinkedListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode previous = null;
		LinkedListNode current = head;
		while (current.next != null) {
			LinkedListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		current.next = previous;
		return current;
	}
}
