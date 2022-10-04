/*
 * Name: Julie Renaud 	
 * Date: 10/2/22
 * Course Number: CSC-220-D01
 * Course Name: Data Structures and Algorithms 
 * Problem Number:  Matrix Determinats - Part 2
 * Email: jmrenaud2001@student.stcc.edu 
 */

import java.io.File;
import java.util.Scanner;

public class GetFileName {
	
	
	public static String fileName(Scanner input, String prompt, String defaultFilename) {
		String filename = "";
		while (true) {
			System.out.printf(prompt + " [%s]: ", defaultFilename);
			filename = input.nextLine().trim();
			if (filename.equals("")) {
				filename = defaultFilename;
			}
			var file = new File(filename);
			if (file.exists()) {
				break;
			}
			System.out.println("File does not exist!");
		}
		return filename;
	}
	
}
