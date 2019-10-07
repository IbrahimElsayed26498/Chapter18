/*
In the name of Allah, the Gracious, the Merciful
 */
package visualizingrecursion;

/**
 *
 * @author ibrahim
 */
public class VisualizingRecursion {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("F(5) = " + factorial(5));
		
	}
	
	public static long factorial(long number){
		if(number <= 1){
			System.out.println("|\n1");
			return 1;
		}
		else{
			System.out.println("|\n" + number);
			return number * factorial(number - 1);
		}
	}
	
}
