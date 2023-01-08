package com.Arrey;
// square of integer using array.

public class A1 {
	public static int[] squareArray(int[] numbers) {
		   int[] result = new int[numbers.length];
		   for (int i = 0; i < numbers.length; i++) {
		       result[i] = numbers[i] * numbers[i];
		   }
		   return result;
		}

		public static void main(String[] args) {
		   int[] numbers = {1, 2, 3, 4, 5};
		   int[] squaredNumbers = squareArray(numbers);
		   for (int i = 0; i < squaredNumbers.length; i++) {
		       System.out.println(squaredNumbers[i]);
		   }
		}

}
