package com.javastart.day1;

public class Array {

	public static void main(String[] args) {
		
		int j=0;
		//different types of array
		
		int i[]=new int[4];
		char c[]=new char[4];       //stores only char value >>> static array
		double d[]=new double[4];
		boolean b[] =new boolean[4];
		String s[]=new String[5];  
		Object ob[]=new Object[5];  // array which can store different datatypes
		
		s[4]="testing";
		d[3]=99.88;
		c[3]=7;
		c[2]='r';
		b[1]=true;
		ob[0]='s';
		ob[2]="rajesh";
		ob[3]=55.99;
		ob[4]="1/2/1998";
		ob[1]='y';
		
	//	System.out.println(ob[1]);
		
		for(j=0;j<=i.length;j++) {
			
			System.out.println(ob[j]);	
	}
		
		
		
	//	i[j]=k;
		
		i[1]=10;
		i[2]=20;
		i[3]=30;
		i[0]=40;
		
		
	/*	System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[5]); //ArrayIndexOutOfBoundsException */
		
		
		for(j=0;j<i.length;j++) {
	
			System.out.println(i[j]);	
	}
		
		System.out.println(i.length);

}
}
