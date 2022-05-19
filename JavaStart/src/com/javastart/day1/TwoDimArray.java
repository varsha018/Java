package com.javastart.day1;

public class TwoDimArray {

	public static void main(String[] args) {
	//	Object ob[] = new Object[3][4]; //ArrayStoreException
		Object ob1[][] = new Object[3][4];
		String s[][]= new String[3][9];
		int i[][]=new int[4][5];
		
		
		ob1[0][0]="rekha";
		ob1[0][1]="hema";
		ob1[0][2]="jaya";
		ob1[0][3]="lali";
		
		ob1[1][0]="rekha1";
		ob1[1][1]="hema1";
		ob1[1][2]="jaya1";
		ob1[1][3]="lali1";
		
		ob1[2][0]="rekha12";
		ob1[2][1]="hema2";
		ob1[2][2]="jaya2";
		ob1[2][3]="lali2";
		
		
		
		System.out.println(ob1[2][1]);
		System.out.println(ob1.length); //num of rows
		System.out.println(s.length);
		System.out.println(ob1[0].length); //num of column >> give any row value in index
		
		
		for(int row=0; row<ob1.length;row++) {
			for(int col=0;col<ob1[0].length;col++) {     //this inner loop will keep executing for row=0 and all col 0to4 and then with outer loop row=1 and all col 0to4
				System.out.println(ob1[row][col]);
			}
			
			
			
		}
		
		
		
		
		
	}

}
