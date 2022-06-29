package JAVACodingJuly22;

public class StringManipulation {

	public static void main(String[] args) {


		String str = "Java is a easy lanuage";
		
		String str1 = str.concat("with Selenium");
		
		String str2 = str.toUpperCase();
		
		String str3 = str.substring(10, 15);
		
		String str4 ="    My birth day is on ===>  18/06/1994    ";
				
				
		System.out.println("The length of string is ===>  " + str.length());
		
		System.out.println("The char at position 10 is  ===> " + str.charAt(10));
		
		System.out.println("The char value at index g is ===> " +  str.indexOf('g'));
		
		System.out.println("The second occurance of e after 12th position is ===> " + str.indexOf('e', 11)); //hard code >>give value of e after 11th position i.e the second occurrence
		
		System.out.println("The second occurance of e after 12th position is ===> " + str.indexOf('e', str.indexOf('e') + 1)); //soft code >>> after the first occurrence of e, whichever is the second occurrence give that
		
		System.out.println("The first occurance of a is ===> " + str.indexOf('a', str.indexOf('a') ));
		System.out.println("The second occurance of a is ===> " + str.indexOf('a', str.indexOf('a') + 1));
		System.out.println("The third occurance of a is ===> " + str.indexOf('a', str.indexOf('a') + 3));
		System.out.println("The fourth occurance of a is ===> " + str.indexOf('a', str.indexOf('a') + 8));
		System.out.println("The fifth occurance of a is ===> " + str.indexOf('a', str.indexOf('a') + 11));
		
		
		System.out.println("The position of string easy is ===> " + str.indexOf("easy"));
		
		System.out.println("if the string or char is not available, it will return ===> " + str.indexOf("not"));
		
		System.out.println("Comparing 2 strings str and str1  ===> " + str.equals(str1)); //it will return true or false
		
		System.out.println("Checking case sensitive JAVA >> ignoring cases for comparing string str and str2 ===> " + str.equalsIgnoreCase(str2));
	
		System.out.println("The substring of str is ===> " + str3);
	
		System.out.println("Triming spaces(before/after) of String str4 ====>" + str4.trim());
		
		System.out.println("Removing middle spaces present in str4 ===> " + str4.replace(" " , ""));
		
		System.out.println("Replacing '/' by '-' in str4 ===> " + str4.replace("/" , "-"));
		
		
	
	
	
	}

}
