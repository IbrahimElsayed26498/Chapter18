/*
In the name of Allah, the Gracious, the Merciful
 */
package factorialcalculator2;

/**
 *
 * @author ibrahim
 */
public class FactorialCalculator2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		for(int counter = 0; counter <= 10; counter++){
			System.out.printf("%d! = %d%n",
					counter, factorial(counter));
		}
	}
	
	public static long factorial(long number){
		long result = 1;
		
		// iterative decleration of method factorial
		for(long i = number; i >= 1; i--){
			result *= i;
		}
		return result;
	}
	
}
