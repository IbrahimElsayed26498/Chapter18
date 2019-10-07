/*
In the name of Allah, the Gracious, the Merciful
 */
package printanarray;

/**
 *
 * @author ibrahim
 */
public class PrintAnArray {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5, 6};
		printArray(array, 0);
		System.out.println();
	}
	public static void printArray(int [] array, int index){
		if(index == array.length)
			return;
		System.out.print(array[index] + " ");
		printArray(array, index + 1);
	}
	
}
