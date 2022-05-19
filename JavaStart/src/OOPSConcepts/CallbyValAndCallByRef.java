package OOPSConcepts;

public class CallbyValAndCallByRef {

			int p;
			int q;
	
	public static void main(String[] args) {
		//call by value
		int x =10;
		int y =20;
		
		CallbyValAndCallByRef ob =new CallbyValAndCallByRef();
		ob.sum(x, y);  // in this func , you are passing value x and y (since it is used by object, x and y are photocopy vars and not the original vars..
						// whatever value you give in this method for x and y , that will not impact the original value of x and y ie 10 and 20..
		
		
		//call by reference
		ob.p = 30;
		ob.q = 50;
		// before swapping
		System.out.println(ob.p);
		System.out.println(ob.q);
		
		// after swapping method called...
		
		ob.swap(ob);
		
		System.out.println(ob.p);
		System.out.println(ob.q);
		
		
		
		
		
		
		
		

	}
	
	//call by value method
	public int sum(int a , int b ) {  // x and y are passed here
		a =50;							// but a here is 50 and b is 60, so these values will be taken for calculating sum..
		b =60;
		int c =a + b;
		return c;
		
	}
	
	//call by refrence method    >> by passing ob reference
	//creating a new obj refernce of class and using...
	public void swap (CallbyValAndCallByRef t) {            // create a new reference of your class as t
		int temp;
		temp = t.p;  //temp= 30 as t and ob both are object of this class, both have photocopy of p and q which are defined inside class..
		t.p = t.q;   //t.p = 50
		t.q = temp;  //t.q =30
		
		
		
	}
	
	

}
