package utilities;

import java.util.Random;

public class NumberOperations {
	public static boolean isNumOdd(int numToAccess) {
		if (numToAccess % 2 == 1) {
			return true;
		}
		return false;
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
	
	public static int randPositiveNegative(){
		 
		 int decisionOdd= randInt(1, 2);
		 if(decisionOdd==1){
			 return -1;
		 }else{
			 return 1;
		 }

	}
	
	public static int getHalfValue(int valueToDevide, boolean isLowerBound){
		int devidedValue;
		if (NumberOperations.isNumOdd(valueToDevide)) {
			if(isLowerBound){
				devidedValue = (valueToDevide - 1) / 2;
			}else{
				devidedValue = (valueToDevide + 1) / 2;
			}		
		} else {
			devidedValue = valueToDevide / 2;
		}
		return devidedValue;
	}
}
