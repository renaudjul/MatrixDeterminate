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


public class Determinates {
	
	
	// Calculates Determinates in Matrix 
	public static double det(Matrix a) {
			int size = a.getSize();
			double temp = 1.0;
			double coeff;
			int i, j, l;

			for (i = 0; i < size; i++) {
				if (a.getElement(i, i) == 0.0) {
					for (j = i; j < size; j++)
						if (a.getElement(j, i) != 0)
							break;
					if (j < size) {
						a.swaprows(size, i, j);
						temp = -temp;
					} else
						break;
				}

				temp *= coeff = a.getElement(i, i);
				for (j = i; j < size; j++)
					a.setElement(i, j, a.getElement(i, j) / coeff);
				for (l = i + 1; l < size; l++) {
					coeff = a.getElement(l, i);;
					for (j = i; j < size; j++)
						a.setElement(l, j, a.getElement(l, j) - coeff * a.getElement(i,j));
				}
			}
			return i < size ? 0.0 : temp;
		}
		
		
		
		

		public static Matrix getDeterminant(String detFilename) throws FileNotFoundException {
			// opens and reads file
			var detData = new Scanner(new File(detFilename));
			var size = detData.nextInt();
			detData.nextLine();

			Matrix a = new Matrix();
			a.matrix(size);
			a.readMatrix(detData);

			return a;
		}

}
