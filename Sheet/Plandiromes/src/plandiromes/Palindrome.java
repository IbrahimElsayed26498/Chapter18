/*
In the name of Allah, the Gracious, the Merciful
 */
package plandiromes;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Palindrome {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter phrase : ");
		//ignore punc.
		String s = input.nextLine();
		char [] string = s.replace("\\p{Punct}", "").toCharArray();
		for(char ch : string)
			System.out.println(ch);
		System.out.printf("the phrase is %s palindrome.\n" 
				, testPalindrome(string, 0, string.length - 1) ? "" : "not");
	}
	
	public static boolean testPalindrome(char[] string, int init, int last){
		if(init >= last)
			return true;
		else if(string[init] != string[last])
			return false;
		else
			testPalindrome(string, init+1, last-1);
		return true;
	}
	
}
