package JAVACodingJulyPart3;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {


		String x  = "GONDaaa";
		String y  = "AAADoo";
		
		//remove all spaces,if present 
		String I = x.replace(" ", "");
		String J = y.replace(" ", "");
		
		//convert if there are mixed cases,either to upper or to lower
		
		I = I.toUpperCase();
		J = J.toUpperCase();
		
		//convert into char array
		char a[] = I.toCharArray();
		char b[] = J.toCharArray();
		
		//sort these arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		//compare both the sorted arrays
		
		Boolean result = Arrays.equals(a, b);
		
		if(result.equals(true)) {
			System.out.println(x  + " and " + y + " are anagrams");
		}else {
			System.out.println(x  + " and " + y + " are not anagrams");
		}
		
		
		
		
		
		
	}

}
