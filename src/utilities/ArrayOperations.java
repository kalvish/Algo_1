package utilities;

public class ArrayOperations {
		public static int[] swapArr(int[] arr, int firstIndex, int nextIndex){
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[nextIndex];
			arr[nextIndex] = temp;
			return arr;
		}
		
		/*public static int[] sortedSubArr(int[] fullArr, int min, int max){
			int[] sortedArr;
			//min<=max
			//min,max <fullArr.length
			for (int i = min; i < max; i++) {
				if()
			}
			return minValueIndex;
		}*/
		

		public static int indexOfMinimum(int[] arr, int startIndex){
			//2
			int minValue = arr[startIndex]; //25
			int minIndex = startIndex; //2
			for (int i = startIndex+1; i < arr.length; i++) {
				//3,4,5,6,7,8
				if(minValue>arr[i]){//25<56
					minIndex = i;//2,s,s,s,s,6
					minValue = arr[i];//25,s,18
				}
			}
			return minIndex;
		}
}

