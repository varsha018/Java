package OOPSConceptPart2;

public class TestCar {
	
	//METHOD OVERRIDING>>>INHERITANCE.. SAME method name in parent and child class and child class method gets the priority..FOR different classes
	//METHOD OVERLOADING>>within same class..same METHOD NAME..DIFFERENT ARGUMENTS
	//polymorphism >> when method/function takes multiple forms>> method overriding and method overloading
	
	
	
	public static void main(String[] args) {
		
		//compile time polymorphism ..when you run your program then at compile time>>compiler will decide which method to access between the common method of parent and class>>method overriding..
		
	//	comile time polymorphism or static polymorphism..
		BMW b1 = new BMW();
		b1.start();
		
		Car C1= new Car();
		C1.start();
		
		b1.drive();
		
		System.out.println("********TOP CASTING**********");
		//Run time polymorphism.. create object of your child class and take reference from it..
	//	new BMW(); //CHILE CLASS OBJECT
	//	Car c1 ; // parent call refernce variable
		
		//dynamic polymorphism or Run time polymorphism
		//also called TOP CASTING..OBJ child CLASS referred by parent class
		Car c2 = new BMW(); // ONLY parent c2 can refer the common methods/vars of its child class and all its own method..
		c2.start();
		c2.stop();
		c2.drive();
//		c2.speed();  >>> cannot access child class method..
		
		
		
		//down casting
	//	BMW b1 =new Car(); // obj parent class referred by child class.. not possible>>cannot fit big thing(PARENT car) into small(child class BMW)
		BMW b2 =(BMW)new Car(); //YOU NEED TO CAST IT BY ADDING(BMW)... YOU WILL GET ClassCastException
							//WE don't do DOWN CASTING generally
		
		
		
	}

}
