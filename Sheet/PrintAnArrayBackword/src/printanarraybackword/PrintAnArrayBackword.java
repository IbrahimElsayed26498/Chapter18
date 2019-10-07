/*
In the name of Allah, the Gracious, the Merciful
 */
package printanarraybackword;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class PrintAnArrayBackword {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		char [] array = input.nextLine().toCharArray();
		printArray(array, array.length - 1);
		System.out.println();
	}
	public static void printArray(char[] array, int index){
		if(index < 0)
			return;
		System.out.print(array[index]);
		printArray(array, index - 1);
	}
	
}
