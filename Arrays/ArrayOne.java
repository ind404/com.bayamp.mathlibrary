package com.bayamp.arrayutil;

public class ArrayOne {
	public static void main(String[] args) {
		int inp_array[] = { 10, 32, 42, 54, 96 };
		int max = com.bayamp.arrayutil.ArrayUtil.getMax(inp_array);
		System.out.println("The max value in array is : " + max);
		int min = com.bayamp.arrayutil.ArrayUtil.getMin(inp_array);
		System.out.println("The min value in arrays is:" + min);
		int tot = com.bayamp.arrayutil.ArrayUtil.getTot(inp_array);
		System.out.println("The summation of elements in array is :" + tot);

	}

}
