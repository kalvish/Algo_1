import java.util.Arrays;
import java.util.Random;


public class ThreeSumBruteForce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {40,-30,-20,10,20,30,-10,40,-30,-20,10,20,30,-10,40,-30,-20,10,20,30,-10};
		
		int[] arrAuto = new int[10];

		for (int i = 0; i < arrAuto.length; i++) {
			arrAuto[i] = randInt(-10, 10)*10*oddness();	
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
	
	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

	    // NOTE: This will (intentionally) not run as written so that folks
	    // copy-pasting have to think about how to initialize their
	    // Random instance.  Initialization of the Random instance is outside
	    // the main scope of the question, but some decent options are to have
	    // a field that is initialized once and then re-used as needed or to
	    // use ThreadLocalRandom (if using at least Java 1.7).
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static int oddness(){
		 
		 int decisionOdd= randInt(1, 2);
		 if(decisionOdd==1){
			 return -1;
		 }else{
			 return 1;
		 }

	}
}
