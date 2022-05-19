package OOPSConcepts;

public class ClassObjects {

	int num; //global variable
	String type; //global variable
	
	public static void main(String[] args) {
		// class is a entity where properties and methods are defined.
		
		
		ClassObjects a =new ClassObjects(); // new ClassObjects() this is object of the class ClassObjects
		ClassObjects b =new ClassObjects(); // a ,b ,c are the object reference variable which we use to reference the class "ClassObjects"
		ClassObjects c =new ClassObjects();
		
		a.num =4;
		b.num =5;
		c.num =6;
		
		a.type= "row1";
		b.type= "row2";
		c.type= "row3";
		
		System.out.println(b.type);
		System.out.println(c.num);
		
		a=b;  // a will refer b now >> value of b will be represented by a
		b=c;  // b will refer c now >> value of c will be represented by b
		c=a;  // c will refer b now >> value of a(which is now b) will be represented by c
		      // b will be represented by (a&c) , c will be represented by b, nothing will represent a
		
		System.out.println(a.type); // value of a is same
		System.out.println(b.num); // value of b is pointing c now
		System.out.println(c.num); // value of c is pointing b now
		c.num=10;
		System.out.println(a.num);// value of a and c will be same as they both point to b
		
		
		
		
		
		
		
	}

}
