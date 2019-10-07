/*
In the name of Allah, the Gracious, the Merciful
 */
package factorialcalcoulator1;
import java.math.BigInteger;

/**
 *
 * @author ibrahim
 */
public class FactorialCalcoulator1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		for(int counter = 0; counter <= 50; counter++){
			System.out.printf("%d! = %d%n",
					counter, factorial(BigInteger.valueOf(counter)));
		}
	}
	
	public static BigInteger factorial(BigInteger number){
		if(number.compareTo(BigInteger.ONE) <= 0)
			return BigInteger.ONE;
		return number.multiply(factorial(number.subtract(BigInteger.ONE)));
	}
	
}
