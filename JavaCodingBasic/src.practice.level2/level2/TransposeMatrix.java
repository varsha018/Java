package level2;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows of Matrix : ");
		
		int rows = sc.nextInt();
		
		System.out.println("Enter the Columns of Matrix : ");
		
		int cols = sc.nextInt();
		
		//create the matrix
		
		int[][] matrix = new int[rows][cols];
		
		//create the transpose
		
		int[][] transpose = new int[cols][rows];
		
		//fill the matrix
		
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j< cols ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//print the matrix
		System.out.println("input matrix is : ");
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j< cols ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		//create the transpose
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j< cols ; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		//print the matrix
		System.out.println("transpose matrix is : ");
		for(int j = 0; j< cols ; j++) {
			for(int i = 0 ; i < rows ; i++) {
				System.out.print(transpose[j][i] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("transpose matrix is : ");
		for(int[] r : transpose) {
			System.out.println(Arrays.toString(r));
		}
		
	}
	
	
	
	

}
