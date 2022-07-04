package AbstractionConcept;

public class TestAbstract {

	public static void main(String[] args) {

		//create object of childClass
		
		ChildClass cc = new ChildClass();
		cc.credit();
		cc.debit();
		cc.loan();
		
		
		System.out.println("*************dynamic polymorphism*********************");
		
		//dynamic polymorphism >> child class object>>parent class reference
		
		AbstractClass ac =new ChildClass(); //parent class referring childClass object
		
		ac.credit();
		ac.debit();
		ac.loan();

	}

}
