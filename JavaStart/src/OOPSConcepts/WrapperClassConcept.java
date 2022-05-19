package OOPSConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//conversion from String to int,double,boolean..

		String i = "100";
		System.out.println(i + 20);
		
		int j = Integer.parseInt(i);  // this Integer class and parseInt method converts string into integer.
		System.out.println(j + 20);
		
		
		// Integer ,Double ,Boolean all datatypes have their own WRAPPER CLASS.
		
		String o ="90";
		double k = Double.parseDouble(o);   //double class and parsedouble method converts string to double..
		System.out.println(k + 44.005);
		
		
		String c = "fased 876";
		boolean d = Boolean.parseBoolean(c);
		System.out.println(c + d + true + d);
		
		
		//conersion from int to String
		
		int g =90;
		System.out.println(g +20);
		
		String h = String.valueOf(g); // converting int to string by String class and value of method(int)..
		System.out.println(h+20);
		
		
		String y = "100D";
		int r =Integer.parseInt(y);  //NumberFormatException
			
		//when you are trying to convert string to integer, but your string is not purely integer value , you get number format exception..
	
	
	
	
	
	
	
	
	}
	
	

}
