package com.horiaconstantin.coderust.linkedlist;

import java.util.Objects;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;

	public LinkedListNode(int data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LinkedListNode that = (LinkedListNode) o;
		return data == that.data && Objects.equals(next, that.next);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next);
	}
}
