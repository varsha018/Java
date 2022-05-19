package interfaces;

public class HDFCBank implements USBank , UKBank {  //multiple inheritance >> also called IS-A relationship (interface and class relationship)
												
	
	
	public void credit() {
		System.out.println(("hdfc..credit"));
	
	}
	
	public void debit() {
		System.out.println("hdfc..debit");
	}
	
	public void money() {
		System.out.println("hdfc..money");
	}
	
	public void edu_loan() {
		System.out.println("hdfc..edu loan");
	}
	
	public void hom_loan() {
		System.out.println("hdfc..home loan");
	}
	
	public void mutual_fund() {
		System.out.println("hdfc..mutual fund");
	}
	
	
	public void LIC() {
		System.out.println("hdfc..LIC");
		
	}
	
	
	
	

}
