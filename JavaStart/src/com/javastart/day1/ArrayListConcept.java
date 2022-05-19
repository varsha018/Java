package com.javastart.day1;

import java.util.ArrayList;

public class ArrayListConcept {
	
	//for ARRAY you have to give specific length/size of array..it is static and fixed
	//for ARRAYLIST it is dynamic in nature.. you keep on adding/removing values from arraylist,the array size is adjusted..

	public static <E> void main(String[] args) {

			int a[] = new int[4];  //Array--> static in nature
		ArrayList ar =new ArrayList();   //it will take all the datatypes..list of array >>you don't specify any length
											//maintains insertion order, allows duplicate values..
										//not synchronize>>not thread safe>> it is slow in comparison to other collections
										//allows random access of elemnts as based on index
		
		ar.add("100");
		ar.add("200");
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add("1/2/09");
		ar.add('c');
		ar.add(true);
		ar.add(12.99);
		ar.add("12/12/2017");
		ar.add("12/23/40");
		
		System.out.println(ar.size());
		
		for(int i=0 ; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(); // if you want to restrict your array to specific datatype..parameterize it..
		
		a1.add(100);		//WILL ADD ONLY INTEGER VALUE
//		a1.add("queen");  // cannot add string
		
		a1.add(900);
		
		System.out.println(a1.size());
		
		
		ArrayList<String> s1 = new ArrayList<String>(); // if you want to restrict your array to specific datatype..parameterize it..
		
		ArrayList<Boolean> b1 = new ArrayList<Boolean>();
		
		ArrayList<Double> d1 = new ArrayList<Double>();
		
		ArrayList<Long> l1 = new ArrayList<Long>();
		
		ArrayList<Character> c1 = new ArrayList<Character>();
		
		ArrayList<E> e1 = new ArrayList<E>(); //when we are not sure which kind of object we are going to pass in array ,we give "E"..
		

	}

}
