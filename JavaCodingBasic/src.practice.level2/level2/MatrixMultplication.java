package level2;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultplication {
	
	// [2*3] [3*4] = [2*4] // ColsInFirstRowsInSec should be same for matrix multiplication
	//output of multiplication will be RowsInFirst and ColsInSec [2*4]
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows of first matrix : ");
		int RowsInFirst = sc.nextInt();
		System.out.println("enter number of cols of first matrix or rows of second matrix : ");
		int ColsInFirstRowsInSec = sc.nextInt();
		System.out.println("enter number of cols of second matrix : ");
		int ColsInSec = sc.nextInt();
		
		//define matrices:
		 int[][] matrix1 = new int[RowsInFirst][ColsInFirstRowsInSec];
		 int[][] matrix2 = new int[ColsInFirstRowsInSec][ColsInSec];
		 int[][] productMatrix = new int[RowsInFirst][ColsInSec];
		 
		 //enter matrix1 data
		 
		 System.out.println("enter data for first matrix : ");
		 for(int i =0; i < RowsInFirst ; i++) {
			 for(int j=0 ;j < ColsInFirstRowsInSec ; j++) {
				 matrix1[i][j]= sc.nextInt();
			 }
		 }
		 
		//enter matrix2 data
		 System.out.println("enter data for second matrix : ");
		 for(int i =0; i < ColsInFirstRowsInSec ; i++) {
			 for(int j=0 ;j < ColsInSec ; j++) {
				 matrix2[i][j]= sc.nextInt();
			 }
		 }
		 
		 //print matrix1 data
		 
		 System.out.println("print data for first matrix : ");
		 for(int i =0; i < RowsInFirst ; i++) {
			 for(int j=0 ;j < ColsInFirstRowsInSec ; j++) {
				 System.out.print(matrix1[i][j] + " ");
			 }
			 System.out.println();
		 } 
		
		 //print matrix2 data
		 
		 System.out.println("print data for second matrix : ");
		 for(int i =0; i < ColsInFirstRowsInSec ; i++) {
			 for(int j=0 ;j < ColsInSec ; j++) {
				 System.out.print(matrix2[i][j] + " ");
			 }
			 System.out.println();
		 } 
		 
		 //generate product matrix
		 
		 for(int i =0; i <RowsInFirst ; i++) {
			 for(int j=0; j <ColsInSec; j++) {
				 for(int k=0 ; k < ColsInFirstRowsInSec ; k++ ) {
					 
					 productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
					 
				 }
			 }
		 }
		 
		 
		 //print the product:
		 
		 for(int[] r : productMatrix ) {
			 System.out.println(Arrays.toString(r));
		 }
		 
		 
		 
	}

}
