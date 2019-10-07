/*
In the name of Allah, the Gracious, the Merciful
 */
package mystery;

/**
 *
 * @author ibrahim
 */
public class Mystery {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println(mystery(5, 4));
	}
	public static int mystery(int a, int b){
		if(b == 1)
			return a;
		else
			return a + mystery(a, b - 1);
	}
	
}
