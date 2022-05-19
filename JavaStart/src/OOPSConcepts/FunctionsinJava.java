package OOPSConcepts;

public class FunctionsinJava {
	int p1= 56;   //global variable ,with the obj reference created for this class,use this variable>>   o1.p1 
	String s2= "Java";

	public static void main(String[] args) {
		FunctionsinJava o1 =new FunctionsinJava();
		o1.abc();
		String s1 = o1.pqr();
		System.out.println(s1);
		int a1= o1.xyz(1, 2);
		System.out.println(a1);
		
		test t1= new test();
		System.out.println(t1.i);
		System.out.println(t1.j);
		
		
		
		System.out.println(o1.p1);
		System.out.println(o1.s2);

	}

	public void abc() {                            //void method>>no input,no output
		System.out.println("abc method");
	}
	
	public String pqr() {                           //return type:string>> no input, but output we are getting
		System.out.println("pqr method");
		int a=2;
		String b="cat";
		
		return b;
				
	}
	
	public int xyz(int x, int y) {              //return type:int>> we give input and get output.
		System.out.println("xyz method");
		int d= x+y;
		int k=x+p1;
		
		return d;
		
	}
	
	
	
}


class test{
	
	int i=1;
	int j=2;
	
	
	


	
	
}
