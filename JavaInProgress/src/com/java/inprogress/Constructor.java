package com.java.inprogress;

public class Constructor {
	
	String name = "varsha";
	int age = 29;
	
	public void test1(int age, String name) {
		 age = this.age;
		 name = this.name;
		System.out.println(age);
		System.out.println(name);
		
		
	}
	
	//the moment we create an object,default constructor is called.. unless we have manually defined it..
	//when we manually define a constructor , our constructor is called then ,not the default one..
	
	//constructor overloading...
	
	Constructor(){
		System.out.println("constructor1..no input no output");
	}
	
	Constructor(int i){
		System.out.println("constructor2..1 param");
	}
	
	Constructor(int i , int j){
		System.out.println("constructor3..2 input params");
	} 
	


	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(2);
		Constructor c3 = new Constructor( 2 , 3);
		
		c1.test1(12, "anoop");
		

	}
	
	
	
	
		
	

}
