package com.bayamp.math.library;

public class MathPrograms {
	public static void main(String[] args) {
		int x = 80;
		int y = 20;
		int total;
		int difference;
		int product;
		int modulus;
		
		total = com.bayamp.math.library.MathUtility.addTwoIntNumbers(x, y);
		System.out.println("The total of :" + x + " and " +y + " is :" + total);
		difference = com.bayamp.math.library.MathUtility.subTwoIntNumbers(x, y);
		System.out.println("The difference of :" + x + " and " +y + " is :" + difference);
		product = com.bayamp.math.library.MathUtility.mulTwoIntNumbers(x, y);
		System.out.println("The product of :" + x + " and " +y + " is :" + product);
		modulus = com.bayamp.math.library.MathUtility.modTwoIntNumbers(x, y);
		System.out.println("The modulus of :" + x + " and " +y + " is :" + modulus);
		
		/*x = 50;
		y = 60;
		total = com.bayamp.math.library.additionutility.addTwoIntNumbers(x,y);
		System.out.println("The total of :" + x + " and " +y + " is :" + total);
		difference = com.bayamp.math.library.subutility.subTwoIntNumbers(x, y);
		System.out.println("The total of :" + x + " and " +y + " is :" + difference);*/
		
		
	}

}
