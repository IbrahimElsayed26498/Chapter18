/*
In the name of Allah, the Gracious, the Merciful
 */
package towerofhanoi;

/**
 *
 * @author ibrahim
 */
public class TowerOfHanoi {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		int startPeg = 1;
		int endPeg = 3;
		int tempPeg = 2;
		int totalDisks = 3;
		
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);
		System.out.println();
	}
	
	public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg){
		if(disks == 1){
			
			System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
			
			return;
		}
		
		//move (disk - 1) disks from source to temp using destination
		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
		
		//move last disk from source to destination
		System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
		
		//move (disk - 1) disks from temp to destination
		solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
	}
	
}
