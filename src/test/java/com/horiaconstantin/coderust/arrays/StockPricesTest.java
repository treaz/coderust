package com.horiaconstantin.coderust.arrays;

import org.junit.jupiter.api.Test;

import static com.horiaconstantin.coderust.arrays.StockPrices.findBuySellStockPrices;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StockPricesTest {

	@Test
	void testFindBuySellStockPricesBullish() {
		Tuple<Integer, Integer> actualStockPrices = findBuySellStockPrices(new int[]{1, 2, 3, 4, 3, 2, 1, 2, 5});
		assertEquals(new Tuple<>(1, 5), actualStockPrices);
	}

	@Test
	void testFindBuySellStockPricesBearish() {
		Tuple<Integer, Integer> actualStockPrices = findBuySellStockPrices(new int[]{8, 6, 5, 4, 3, 2, 1});
		assertEquals(new Tuple<>(6, 5), actualStockPrices);
	}

	@Test
	void testFindBuySellStockPricesInvalidInput() {
		assertNull(findBuySellStockPrices(new int[]{}));
		assertNull(findBuySellStockPrices(new int[]{1}));
	}

	@Test
	void testFindBuySellStockPricesTwoValues() {
		Tuple<Integer, Integer> actualStockPrices = findBuySellStockPrices(new int[]{1, 5});
		assertEquals(new Tuple<>(1, 5), actualStockPrices);
	}
}