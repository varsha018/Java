package com.javastart.day1;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {


		Hashtable h = new Hashtable(); //this hashtable accepts all datatypes
		
		h.put("A", "Alphabet");
		h.put("B", "Basket");
		h.put("C", 10);
		h.put("D", 'C');
		h.put("E", 12.234);
		h.put("F", "Fatsman");
		h.put(1, "one");
		h.put(10, "tenth");
		h.put(12.2, 12.22);
		h.put(true, "Boolean");
		h.put('c', "character");
		
		
		System.out.println(h.size());
		System.out.println(h.get(true));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>(); //restricts only to integer..
		
		h1.put(12, 13);
		h1.put(18, 98);
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>(); // you can define different key values to hashtable...
		h2.put(12, "varsi");
		
		Hashtable<Boolean,String> h3 = new Hashtable<Boolean,String>();
		
		Hashtable<Character,String> h4 = new Hashtable<Character,String>();
		
		
		
		
		
		
		for(int i=0; i<h.size();i++) {
			
			
			
		}
		
		
		

	}

}
