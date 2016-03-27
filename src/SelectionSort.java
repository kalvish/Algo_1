import java.util.Arrays;

import utilities.ArrayOperations;


public class SelectionSort {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] primeArr = { 11, 2, 3, 5, 73, 9,7, 11, 35, 17, 19, 23, 29, 31,3, 37, 41, 43,
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 ,1};

		int[] sortedArr = sortArr(primeArr); //O(N2)
		System.out.println("\n" + Arrays.toString(sortedArr));

	}
	
	public static int[] sortArr(int[] arr) { //O(N)
		for (int i = 0; i < arr.length; i++) {
			int minIndex = ArrayOperations.indexOfMinimum(arr, i); //O(N)
			arr = ArrayOperations.swapArr(arr, i, minIndex); //O(1)
		}
		return arr;
	}
}
