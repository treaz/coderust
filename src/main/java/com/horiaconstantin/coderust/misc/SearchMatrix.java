package com.horiaconstantin.coderust.misc;

import java.util.Objects;

class IntPair extends Pair<Integer, Integer> {
	public IntPair(int first, int second) {
		super(first, second);
	}
}

class Pair<X, Y> {
	public X first;
	public Y second;

	public Pair(X first, Y second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair<?, ?> pair = (Pair<?, ?>) o;
		return first.equals(pair.first) && second.equals(pair.second);
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}
}

public class SearchMatrix {
	//	There's a more efficient way than the brute O(n*m)
	public static IntPair searchInMatrix(int matrix[][], int value) {
		return new IntPair(-1, -1);
	}
}
