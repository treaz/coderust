package com.horiaconstantin.coderust.arrays;

import java.util.Objects;

class Tuple<X, Y> {
	public X x;
	public Y y;

	public Tuple(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Tuple<?, ?> tuple = (Tuple<?, ?>) o;
		return Objects.equals(x, tuple.x) && Objects.equals(y, tuple.y);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public String toString() {
		return "Tuple{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}

public class StockPrices {
	public static Tuple<Integer, Integer> findBuySellStockPrices(int[] array) {
		return null;
	}
}
