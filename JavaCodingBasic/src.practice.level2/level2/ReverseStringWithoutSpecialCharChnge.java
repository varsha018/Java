package level2;

public class ReverseStringWithoutSpecialCharChnge {
	
	
	public static void reverse(char[] chararray) {
		
		int i = 0 ;
		int j = chararray.length-1  ;
		
		while(i<j) {
			
			if(!Character.isAlphabetic(chararray[i])) {
				i++;
			}else if(!Character.isAlphabetic(chararray[j])) {
				j--;
			}else {
				char temp;
				temp = chararray[i];
				chararray[i] = chararray[j];
				chararray[j] = temp;
				i++;
				j--;
			}	
		}
		
	}

	public static void main(String[] args) {
		
		//input : abcd$$efgh**ij
		//output : jihg$$fedc**ba
		
		
		String s1 = "abcd$$ef"; //input string
		System.out.println("input string : " + s1);
		
		//convert string into char array
		
		char[] c1 = s1.toCharArray();
		
		reverse(c1);
		
		String rev = new String(c1);
		
		System.out.println("output string : " + rev);

		
		
		
		
		

	}

}
