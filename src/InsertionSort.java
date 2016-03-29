import java.util.Arrays;

import utilities.ArrayOperations;


public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] primeArr = { 11, 2, 3, 5, 73, 9,7, 11, 35, 17, 19, 23, 29, 31,3, 37, 41, 43,
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 ,1};

		int[] sortedArr = sortArr(primeArr);//O(N2)
		System.out.println("\n" + Arrays.toString(sortedArr));
	}

	public static int[] sortArr(int[] arr) { //O(N2)
		for (int i = 1; i <= arr.length-1; i++) {//O(N)
			ArrayOperations.insertToArr(arr, i-1, arr[i]);
		}
		return arr;
	}
	
}
