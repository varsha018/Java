package com.javastart.day1;

public class IncrementDecrement {

	public static void main(String[] args) {
		int i=1;
		int j= i++;   //assign the value of i to j first i.e j=1 ,and then increment the value of i i.e i=i+1,i=2
		int k=++i;    //increment the value of i first i.e i=i+1=2+1=3,assign that to k,ie k=3 and i is now already incremented to 3,i=3 
		int l=--i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
