package AbstractionConcept;

public class ChildClass extends AbstractClass { //childClass extends AbstractCLASS //mandatory to define the abstract method


	public void loan() {  //abstract method >> no need to write abstract in front of method here..
		int i =10;			//define method body here..//this is overridden method of Abstract class
		int j =20;
		
		int k = i* j;
		
		System.out.println("k is ===>" + k);
		
	}

}
