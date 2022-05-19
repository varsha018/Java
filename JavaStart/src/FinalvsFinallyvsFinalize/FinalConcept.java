package FinalvsFinallyvsFinalize;

public class FinalConcept {

	public static void main(String[] args) {
		
		final int i = 10; // to make the variable value permanent>>cannot be changed.
						// to prevent inheritance
						//to prevent method overriding
	}

}


/*     final class parentclass{ //as soon as we make the parent clas final , no child class can inherit parent class
	
		public final void start() { // as soon as we make method final, method overiding will not happen in child class
		
		System.out.println("parent-->start");
	}
	
}

//class childclass extends parentclass{  //child class can inherit parent class if no final keyword
		
	public void start() {   				//method overiding is possible if no final in parent
		
	System.out.println("chile-->start");
}

	} */
	
