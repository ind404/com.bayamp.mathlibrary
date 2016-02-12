package com.bayamp.arrayutil;

public class ArrayUtil {
	public static int getMax(int[] inArray) {
		int maxValue = inArray[0];
		for (int i = 1; i < inArray.length; i++) {
			if (inArray[i] > maxValue) {
				maxValue = inArray[i];
			}
		}
		return maxValue;

	}

	public static int getMin(int[] inArray) {
		int minValue = inArray[0];
		for (int i = 1; i < inArray.length; i++) {
			if (inArray[i] < minValue) {
				minValue = inArray[i];
			}
		}
		return minValue;
	}

	public static int getTot(int[] inArray) {
		int sum = 0;
		for (int i = 0; i < inArray.length; i++) {
			sum = sum + inArray[i];

		}
		return sum;
	}

}