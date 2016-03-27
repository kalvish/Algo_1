import utilities.NumberOperations;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberToSearch = 97;

		int[] primeArr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

		int searchIndex = searchAlgo(primeArr, numberToSearch);
		System.out.println("\n" + searchIndex);
		System.out.println("\n" + primeArr[searchIndex]);
	}

	public static int searchAlgo(int[] arr, int numberToSearch) {

		int min = 0;
		int max = arr.length - 1;

		int index;

		while (true) {
			
			boolean isLowerBound = true;
			index = NumberOperations.getHalfValue(min+max, isLowerBound);
			
			int guess = arr[index];

			System.out.println(guess);
			
			if (guess == numberToSearch) {
				return index;
			} else if (numberToSearch > guess) {
				min = index + 1;
			} else {
				max = index - 1;
			}

		}

	}


}
