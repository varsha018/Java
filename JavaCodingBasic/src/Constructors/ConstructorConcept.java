package Constructors;

public class ConstructorConcept {
	
	//a constructor will never return a value
	//a method/function may/may not return a value
	//initializing class variable and methods..
	
	
	
	String name;
	int	age;
	
	
	//create constructor
	
	ConstructorConcept(){
		
		System.out.println("default constructor");
	}

	ConstructorConcept(int i){
		System.out.println("1 param constructor");
	}
	
	ConstructorConcept(int i, int j ){
		
		System.out.println("2 param constructor");
	}
	
	//initializing class variable and methods..
	ConstructorConcept(String name, int age){
		this.name =name; //value of name that we pass while calling this method will be given to class var(this.name)
		this.age =age;
		System.out.println("name is => " + this.name);
		System.out.println("age is => " + this.age);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(10);
		ConstructorConcept cc2 = new ConstructorConcept(10,20);
		ConstructorConcept cc3 = new ConstructorConcept("varsha",29);
	}

}
