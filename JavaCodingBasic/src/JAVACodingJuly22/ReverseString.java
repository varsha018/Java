package JAVACodingJuly22;

public class ReverseString {
	
	//create a null string reverse with blank values
	//use a for loop in reverse order

	public static void main(String[] args) {
		
		String s = "Selenium is easy";
		
		String Rev = "";
		
		int Length = s.length();
		
		System.out.println("The length of String is ===> " + Length );
		
		
		for(int i= Length-1 ; i >=0 ; i--) {
			Rev = Rev + s.charAt(i);
			
		}

		System.out.println("The Given String is ===> " + s );
		System.out.println("The Reverse String is ===> " + Rev);
	}

}
