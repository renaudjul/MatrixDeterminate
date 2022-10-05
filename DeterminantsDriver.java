* Name: Julie Renaud 	
 * Date: 10/2/22
 * Course Number: CSC-220-D01
 * Course Name: Data Structures and Algorithms 
 * Problem Number:  Matrix Determinats - Part 2
 * Email: jmrenaud2001@student.stcc.edu 
 */


import java.util.Scanner;

public class DeterminantsDriver {
	private final static String TITLE = "Determinants Part 2";
	private final static String CONTINUE_PROMPT = "Do this again? [y/N] ";

	// **********************************************
	// Put as many methods you need here

	
	
	

	// **********************************************
	// Start your logic coding in the process method

	
	
	
	private static void process(Scanner input, String args[]) throws Exception {

		var filename = GetFileName.fileName(input, "Enter determinant filename", "sampledet.txt");
		var a = Determinants.getDeterminant(filename);
		System.out.printf("Matrix Elements = \n");
		a.displayMatrix();
		System.out.printf("The determinate = %10.3f\n", Determinants.det(a));
		input.nextLine(); // Clear the Keyboard

	}

	
	
	
	// **********************************************
	// Do not change the doThisAgain method
	private static boolean doThisAgain(Scanner input, String prompt) {
		System.out.print(prompt);
		String doOver = input.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}

	// **********************************************
	// Do not change the main method
	public static void main(String args[]) throws Exception {
		System.out.println("Welcome to " + TITLE);
		Scanner input = new Scanner(System.in);
		do {
			process(input, args);
		} while (doThisAgain(input, CONTINUE_PROMPT));
		input.close();
		System.out.println("Thank you for using " + TITLE);
	}

}