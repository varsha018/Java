package JAVACodingJulyPart2;

public class SwapString {
	
	//using subString method in String

	public static void main(String[] args) {
		
		
		String a = "before marriage";
		
		String b = "after marriage";
		
		System.out.println("Before Swapping :::");
		
		System.out.println("a is ::: " + a);
		System.out.println("b is ::: " + b);
		
		a = a + b; // before marriage after marriage //whole string value in a
		
		b = a.substring(0, a.length() - b.length()); // length of a - length of b = value of a which will be stored in b now //before marriage
		
		a = a.substring(b.length());  // total length of a - subString with length of b
		
		System.out.println("After Swapping :::");
		System.out.println("a is ::: " + a);
		System.out.println("b is ::: " + b);	
		

		
	}

}
