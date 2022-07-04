package JAVACodingJulyPart3;

public class StrHasDigit {
	
	//If a string has only digits >>> we can find by Character.isDigit(cs.charAt(i) ...
	//first check if string string is Empty or null or blank
	//uniCode character >>represents a specific numeric digit >>true for this case
	//for alphanumeric and special char it is false..
	
	
	public static boolean IsEmpty( CharSequence cs)  {
		
		return cs == null || cs.length() == 0 ;
			
		
	}
	
	public static boolean IsNumeric(CharSequence cs) {
		
		if(IsEmpty(cs)) {
		return false;
		}	
		
		
		int len = cs.length();
		for(int i = 0 ; i < len ; i++) {
			if(! Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		System.out.println(IsNumeric(null)); //false
		System.out.println(IsNumeric("")); //false
		System.out.println(IsNumeric("ayushi"));//false
		System.out.println(IsNumeric("shiv!@#"));//false
		System.out.println(IsNumeric("123"));//true
		System.out.println(IsNumeric("a"));//false
		System.out.println(IsNumeric("2.3"));//false
		System.out.println(IsNumeric("0"));//true
		System.out.println(IsNumeric("\u0967")); // >>>true //uniCode character >>represents a specific numeric digit 
		System.out.println(IsNumeric("\u0967\u0968\u0969")); //TRUE
	}

}
