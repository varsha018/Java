package FinalvsFinallyvsFinalize;

public class FinalizeConcept {
		
/*	called before garbage collector to finalize the cleaning up process
	no need to create a obj for this and call in main method
	it will be automatically called before system.gc()
	it will remove all those objects which have no references and blank reference in memory...
	 *
	 */
	
	
	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
	//	f2 = null;
		
		System.gc();

	}
	
	
	public void finalize() {
		System.out.println("called before garbage collector to finalize the cleaning up process");
		System.out.println("no need to create a obj for this and call in main method");
		System.out.println("it will be automatically called before system.gc()");
	}

}
