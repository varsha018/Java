package interfaces;

public class TestBank {

	public static void main(String[] args) {
		
		//you cannot create obj of interfaces
		//you have to create obj of classes and access all interfaces and classes methods and vars..
		
		HDFCBank h1 = new HDFCBank();
		h1.credit();   //USBank
		h1.debit();		//USBank
		h1.edu_loan();
		h1.hom_loan();
		h1.money();		//USBank
		h1.LIC();		//UKBank
		h1.mutual_fund(); //UKBank
		
		
		System.out.println("***********dynamic polymorphism******************");
		//dynamic polymorphism
		USBank u1 = new HDFCBank();    //interface USBank can access only its methods , not of HDFCBank method..
		u1.credit();
		u1.debit();
		u1.money();
		
		System.out.println("***vars in interfaces are static and final***");
		System.out.println(USBank.min_amt);
		System.out.println(UKBank.min_amt);

	}

}
