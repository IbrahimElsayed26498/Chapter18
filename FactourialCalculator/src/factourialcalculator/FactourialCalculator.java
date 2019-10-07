/*
In the name of Allah, the Gracious, the Merciful
 */
package factourialcalculator;

/**
 *
 * @author ibrahim
 */
public class FactourialCalculator {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		for (int counter = 0; counter <= 21; counter++){
			System.out.printf("%d! = %d%n", counter, factorial(counter));
		}
	}
	
	public static long factorial(long number){
		if(number <= 1)
			return 1;
		else
			return number * factorial(number - 1);
	}
	
}
