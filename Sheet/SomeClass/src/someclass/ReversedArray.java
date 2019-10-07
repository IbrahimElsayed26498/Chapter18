/*
In the name of Allah, the Gracious, the Merciful
 */
package someclass;

/**
 *
 * @author ibrahim
 */
public class ReversedArray {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		String ressult = printRecersedArray(array, 0);
		System.out.println(ressult);
	}
	public static String printRecersedArray(int[] array2, int x){
		if(x < array2.length)
			return String.format(
				"%s%d", printRecersedArray(array2, x + 1), array2[x]);
		else
			return "";
	}
	
}
