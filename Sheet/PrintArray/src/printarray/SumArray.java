/*
In the name of Allah, the Gracious, the Merciful
 */
package printarray;

/**
 *
 * @author ibrahim
 */
public class SumArray {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int result = sumArrayElements(array, array.length);
		System.out.printf("Result is: %d%n", result);
	}
	
	public static int sumArrayElements(int[] array, int size){
		if(size == 1)
			return array[0];
		return array[size-1] + sumArrayElements(array, size - 1);
	}
	
}
