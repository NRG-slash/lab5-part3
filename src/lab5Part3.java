import java.util.Scanner;
/**
 * 
 */

/**
 * @author g.laturski
 *
 */
public class lab5Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int[] values = new int[5];
		int largest;
		
		for(int i = 0; i < values.length; i++){
			
			System.out.print("Please enter an intiger ");
			values[i] = userInput.nextInt();
		
		}
		
		largest = values[0];
		
		for(int i = 0; i < values.length; i++){
			
			if(values[i] > largest){
				
				largest = values[i];
			}
		}
		
		System.out.print("Your largest value is " + largest);
		
	
	}

}
