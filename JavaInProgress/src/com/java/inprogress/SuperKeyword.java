package com.java.inprogress;

public class SuperKeyword {
	
	//SUPER keyword is used to call parentclass constructor
	//it should always be written within the child class
	//it should always be the frst statement in childclass constructor..never second
	//never you can use 2 super within childclass..
	//if you want to use more/different constructor of parent class..creat different objects of childclass..
	

	public static void main(String[] args) {
		
		//when child class extend parentclass, first parentclass constructor is called and then childclass
		
		childclass c1 = new childclass();
		
		
	
		

	}

}

class parentclass{
	
	parentclass(){
		System.out.println("parent class constructor");
	}
	
	parentclass(int i){   //when you maually define the parentclass constructor with some params..
		System.out.println("the value of i in parentclass is : " + i);
	}
	
	
}



class childclass extends parentclass{
	
	childclass(){
		super(10);			//and while creating childclassconstructor you use SUPER, it will go to parent first
		System.out.println("child class constructor");
	}
}
