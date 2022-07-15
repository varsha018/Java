package Sorting;

import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: Number of names you want to sort  ==> ");
		int a = sc.nextInt(); //to get number of elements in Array
		
		//Array
		String names[] = new String[a]; //a is total number of elements in array
		
		Scanner sc1 = new Scanner(System.in); //to read the elements in array
		
		System.out.println("Enter: Names you want to sort  ==> ");
		 for(int i = 0 ;i<names.length ;i++) { //to put elements in array
			 
			 names[i]= sc1.nextLine();
		 }
		
		 
		 
		 for(int c=0; c<a; c++) {
			 for(int d=c+1; d<a; d++) {
				 if(names[c].compareTo(names[d]) > 0 ) {
					 String temp = names[c];
					 names[c] =names[d];
					 names[d] =temp;
					 
				 }
			 }
		 }
		 
		 
		for(String name : names) {
			System.out.println(name);
			
		}
		
		

	}

}
