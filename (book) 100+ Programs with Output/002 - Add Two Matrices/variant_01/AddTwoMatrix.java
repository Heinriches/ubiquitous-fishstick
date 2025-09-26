/**
 * This code adds two matrices, but you easily modify it to add any number
 * of matrices. One approach is to create a 'Matrix' class. Whithin this class, 
 * you would implement an 'add' method that sums two matrix objects. To add
 * more than two matrices, simply call this 'add' method repeatedly inside a loop. 
 */

import java.util.Scanner;

class AddTwoMatrix{
	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		//	---	---	---	---	---	---	---	---	---
		
		System.out.println("Inform the number of rows and columns in your two matrices: ");
		int m = in.nextInt();
		int n = in. nextInt();
		
		int first [][]		= new int [m][n];
		int second [][]		= new int [m][n];
		int sum [][]			= new int [m][n];
		
		//	---	---	---	---	---	---	---	---	---
		
		System.out.println("Enter the elements of your firt matrix: ");
		for(int c = 0; c < m ; c++) {
			for( int d = 0; d < n; d++) {
				first [c][d] = in.nextInt();
			}
		}
		
		System.out.println("Enter the elements of your second matrix: ");
		for(int c = 0; c < m; c++) {
			for(int d = 0; d < n; d++) {
				second[c][d] = in.nextInt();
			}
		}
		
		//	---	---	---	---	---	---	---	---	---
		System.out.println("Here is your first matrix: ");
		for(int c = 0 ; c < m ; c++) {
			System.out.println(first [c][d]);
		}
		
		
		
		
		
		//	---	---	---	---	---	---	---	---	---
		
		for(int c = 0; c < m; c++) {
			for(int d = 0; d < n; d++) {
				sum [c][d] = (first[c][d] + second [c][d]);
			}
		}
		
		//	---	---	---	---	---	---	---	---	---
		
		System.out.println("Sum of entered matrices = ");
		for(int c = 0; c < m; c++) {
			for(int d = 0; d < n; d++) {
				System.out.print(sum [c][d] +"\t");
			}
		}
		System.out.println();
		
		//	---	---	---	---	---	---	---	---	---
	}
}