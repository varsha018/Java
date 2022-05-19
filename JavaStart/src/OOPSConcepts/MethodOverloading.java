package OOPSConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		 //method overloading >>>> same method name but different parameters within the same class...
		// we can overload main method also..
		
		
		
		MethodOverloading s1 = new MethodOverloading();
		s1.sum();
		int s2=s1.sum(2);
		System.out.println(s2);
		String s3= s1.sum("java");
		System.out.println(s3);
		String s4=s1.sum("selenium", 10);
		System.out.println(s4);
		s1.main();

	}
	
	
	public void main() {
		System.out.println("this is method overloading of main method");
	}

	
	public void sum() {
		System.out.println("sum method");
	}
	
	public int sum(int i) {
		System.out.println("sum method 1 ");
		return i;
	}
	
	public String sum(String j) {
		System.out.println("sum method 2");
		return j;
	}
	
	public String sum(String k , int i) {
		System.out.println("sum method 3");
        String d=	k + i;
        return d;
	}
	
	
}
