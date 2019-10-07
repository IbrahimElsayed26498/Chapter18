/*
In the name of Allah, the Gracious, the Merciful
 */
package greatestcommondivisor;

/**
 *
 * @author ibrahim
 */
public class GreatestCommonDivisor {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("gcd for 15, 20 is : " + gcd(15, 20));
	}
	public static int gcd(int x, int y){
		if(y == 0){
			return x;	
		}
		else{
			return gcd(y, x%y);
		}
	}
	
}
