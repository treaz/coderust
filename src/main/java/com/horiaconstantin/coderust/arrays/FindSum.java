package com.horiaconstantin.coderust.arrays;

import java.util.HashSet;
import java.util.Set;

// Also known as twoSum on leetcode https://leetcode.com/problems/two-sum/
public class FindSum {

	static boolean findSumOfTwo(int[] A, int val) {
		Set<Integer> values = new HashSet<>();
		for (int arrayVal : A) {
			if (values.contains(val - arrayVal)) {
				return true;
			} else {
				values.add(arrayVal);
			}
		}

		return false;
	}

}
