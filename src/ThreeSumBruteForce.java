import java.util.Arrays;
import java.util.Random;

import utilities.NumberOperations;


public class ThreeSumBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {40,-30,-20,10,20,30,-10,40,-30,-20,10,20,30,-10,40,-30,-20,10,20,30,-10};
		
		int[] arrAuto = new int[10];

		for (int i = 0; i < arrAuto.length; i++) {
			arrAuto[i] = NumberOperations.randInt(-10, 10)*10*NumberOperations.randPositiveNegative();	
		}
		System.out.println(Arrays.toString(arrAuto));
		
		long beforeT = System.nanoTime();
		int noOfTimes = ThreeSumZeros(arrAuto);
		long afterT = System.nanoTime();
		System.out.println(noOfTimes+ " Time elapsed:" + Long.toString(afterT-beforeT));
	}

	public static int ThreeSumZeros(int[] inputArr){
		int count = 0;
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i+1; j < inputArr.length; j++) {
				for (int j2 = j+1; j2 < inputArr.length; j2++) {
					if(inputArr[i]+inputArr[j]+inputArr[j2]==0){
						System.out.println("\n{"+Integer.toString(inputArr[i])+","+Integer.toString(inputArr[j])+","+Integer.toString(inputArr[j2])+"}");
						count++;
					}
				}
			}
		}
		return count;
	}
	
	
}
