package interfaces;

public interface USBank {  // this is an interface..we don't give main method here

	
	int min_amt = 100;		//declare variables..which are by default and static and value of these variables will not be changed
							//don't need to give static keyword for variables
	
	
	public void credit();  // we don't give complete body of method here..we just define..
	
	public void debit();	//only declare method ..method prototype...
	
	public void money();  // ****No static methods in interface >>>as interfaces are part of OOPS concept ..inferfaces are objects..so no static method for objects
								// we cannot create object for interfaces>>> ABSTRACT IN NATURE 

	
	
	
}
