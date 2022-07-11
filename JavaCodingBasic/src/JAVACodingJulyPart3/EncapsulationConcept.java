package JAVACodingJulyPart3;

public class EncapsulationConcept {
	
	//hiding the data members -> variables or methods
	//declare variables as private variables --> and use getters and setters method to access method outside classes
	//data-hiding -> no one from outside class can access data members
	//for security purpose to prevent data hacking
	//improves maintenance,re-usability of the code
	
	
	//declare private variables so that they cannot be accessed outside the class
	private int i =1;
	private String str = "varsha";
	private double j = 2.5;
	
	//generate getters and setters to access them outside class >> not original but using getters function
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public double getJ() {
		return j;
	}

	public void setJ(double j) {
		this.j = j;
	}

	
	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		ec.setI(10);
		ec.setJ(5.5);
	//	ec.setStr("ayushi");
		
		System.out.println(ec.getI());
		System.out.println(ec.getJ());
		System.out.println(ec.getStr());
		
		
	}

}
