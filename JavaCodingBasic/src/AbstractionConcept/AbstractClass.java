package AbstractionConcept;

public abstract class AbstractClass {  //define in class abstract keyword
	//abstraction >> hiding the implementation logic
	//partial abstraction >>> only some methods are abstract and some are normal methods
	//full abstraction in Interface
	//We cannot create the object of Abstract class
	
	
	//final,static and normal variable declarations can be done in abstract class
	int i = 10;
	final int j =10;
	static int k =10;
	
	
	public abstract void loan();  // abstract method should be there in abstract class >>method declaration >> no method body
									//implementation of this method will be there in respective child class
	public void credit() { //normal method
		
		System.out.println("bank credit *** ");
		
	}
	
	public void debit() { //normal method
		
		System.out.println("bank debit *** ");
		
	}
	
}
