package utilities;

public class ArrayOperations {
		public static int[] swapArr(int[] arr, int firstIndex, int nextIndex){
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[nextIndex];
			arr[nextIndex] = temp;
			return arr;
		}
}
