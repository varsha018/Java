package JAVACodingJulyPart2;

public class PalindromeNumbers {
	
	//for integer palindrome >>> reverse integer logic
	//for string palindrome >>> use string buffer..
	
	
	
	public static void testPalindrome(int num ) {
		int r = 0 ;
		
		while (num > 0) {
			
			r = r * 10 + num % 10;
			num = num /10;
			
		}
		
		System.out.println(r);
		
		
	}
	
	

	public static void main(String[] args) {

		String name = "argennegra";
		
		StringBuffer sf = new StringBuffer(name);
		
		String rev = sf.reverse().toString();
		
		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is NOT a palindrome");
		}
		
		
		testPalindrome(123456702);
	}
	
	
	
	

}
