/*
In the name of Allah, the Gracious, the Merciful
 */
package fibonaccicalculator;

import java.math.BigInteger;

/**
 *
 * @author ibrahim
 */
public class FibonacciCalculator {
	private static BigInteger TWO = BigInteger.valueOf(2);
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		for(int counter = 0; counter <= 40; counter++){
			System.out.printf("Fibonacci of %d is : %d%n",
					counter, fibonacci(BigInteger.valueOf(counter)));
		}
		
		//System.out.println("F(3) = " + fibonacci(BigInteger.valueOf(3)));
	}
	
	public static BigInteger fibonacci(BigInteger number){
		if(number.equals(BigInteger.ZERO) || 
				number.equals(BigInteger.ONE)) // basecase
			return number;
		else
			return fibonacci(number.subtract(BigInteger.ONE)).add(
				fibonacci(number.subtract(TWO)));
	}
	
}
