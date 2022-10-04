/*
 * Name: Julie Renaud 	
 * Date: 10/2/22
 * Course Number: CSC-220-D01
 * Course Name: Data Structures and Algorithms 
 * Problem Number:  Matrix Determinats - Part 2
 * Email: jmrenaud2001@student.stcc.edu 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeterminatesDriver {
	private final static String TITLE = "Determinants Part 2";
	private final static String CONTINUE_PROMPT = "Do this again? [y/N] ";

	// **********************************************
	// Put as many methods you need here

	
	private static double det(Matrix a) {
		int size = a.getSize();
		double temp = 1.0;
		double coeff = 0;
		int i, j, l;
		
		for (i = 0; i < size; i++) {
			if (a.getElement(i,i)== 0.0) {
				for (j = i; j < size; j++)
					if (a.getElement(j,i)!= 0)
						break;
				if (j < size) {
					a.swaprows(size, i, j);
					temp = -temp;
				} else
					break;
			}
			
			
			
//			double value = 0;
//			double value2 = 0;
			
//			temp *= coeff = a.getElement(i,i);
//			for (j = i; j < size; j++)
//				value = a.getElement(i, j) / coeff;
//				a.setElement(i,j, value); 
//			for (l = i + 1; l < size; l++) {
//				coeff = a.getElement(l, i);
//				for (j = i; j < size; j++) {
//					value2 = a.getElement(l,j)- coeff * a.getElement(i, j);
//					a.setElement(l, j, value2); 
//				}
//			}
			
			
			
			
//			a.setElement(i, i, temp *= coeff );
//			for (j = i; j < size; j++)
//				a.setElement(i, j, a.getElement(i, j) / coeff);
//			for (l = i + 1; l < size; l++) {
//				coeff = a.getElement(l, i);
//				for (j = i; j < size; j++)
//					a.setElement(l, j, a.getElement(l, j) - coeff * a.getElement(i,j));
//			}
			
			
			
			
			
			double value2 = 0;
			double value3 = 0;
			double value =  temp *= coeff;
			a.setElement(i,i,value);
			
			for (j = i; j < size; j++) {
				value2 = a.getElement(i, j) / coeff;
				a.setElement(i, j, value2);
			}
			for (l = i + 1; l < size; l++) {
				coeff = a.getElement(l, i);
				for (j = i; j < size; j++)
					value3 = a.getElement(l, j) - coeff * a.getElement(i,j);
					a.setElement(l, j, value3);
			}
			
		}
		return i < size ? 0.0 : temp;
	}
	
	
	

	
	private static Matrix getDeterminant(String detFilename) throws FileNotFoundException {
		// opens and reads file
		var detData = new Scanner(new File(detFilename));
		var size = detData.nextInt();
		detData.nextLine();
		
		Matrix a = new Matrix();
		a.matrix(size);
		a.readMatrix(detData);
		
		return a;
	}
	
	
	
	
	// **********************************************
	// Start your logic coding in the process method
	
	
	private static void process(Scanner input, String args[]) throws Exception {
		
		var filename = GetFileName.fileName(input, "Enter determinant filename", "sampledet.txt");
		var a = getDeterminant(filename);
		System.out.printf("Matrix Elements = \n");
		a.displayMatrix();
		System.out.printf("The determinate = %10.3f\n", det(a));
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