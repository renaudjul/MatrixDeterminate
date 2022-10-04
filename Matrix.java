/*
 * Name: Julie Renaud 	
 * Date: 10/2/22
 * Course Number: CSC-220-D01
 * Course Name: Data Structures and Algorithms 
 * Problem Number:  Matrix Determinats - Part 2
 * Email: jmrenaud2001@student.stcc.edu 
 */

import java.util.Scanner;

public class Matrix {
	// Fields
	private int size;
	private double[][]matrix;
	
	
	

	// Constructor that initializes an size x size matrix of all zeros
		// it constructs a matrix object of dimension size x size
	public void matrix(int size) {
		this.matrix = new double[size][size];
	}

	
	
	
	// returns the Matrix's size
	public int getSize() {
		return this.size;
	}
	
	
	
	
	// return the element located in position row, col
	public double getElement(int row, int col) {
		double element = matrix[row][col];
		return element;
	}
	
	
	
	
	// Sets the value of the rowth, colth element to value
	// Works like mat[row][col] = value
	public void setElement(int row, int col, double value) {
		this.matrix[row][col] = value;
	}
	
	
	
	
	public void displayMatrix() {
		for (var i = 0; i < matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++) {
				System.out.printf("%10.2f", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public void readMatrix(Scanner input) {
		for (var i = 0; i < matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}
	}	
	
	
	public void swaprows(int size, int i, int j) {
		for (var k = 0; k < size; k++) {
			double temp = matrix[i][k];
			matrix[i][k] = matrix[j][k];
			matrix[j][k] = temp;
		}
	}
}
	
	
	
	
	

