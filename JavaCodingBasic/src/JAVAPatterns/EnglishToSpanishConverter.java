package JAVAPatterns;

import java.lang.reflect.Field;

public class EnglishToSpanishConverter {
	//String class >>getDeclaredField >>set "value" >> store in field var
	//set accessible as true for value
	//value.set ,value.get...
	
	static {
		
		try {
			Field value = String.class.getDeclaredField("value"); //declare field
			value.setAccessible(true);
			value.set("Hello Varsha "  , value.get("Hola Varsha, How are you??? ")); //set the values and get what you need reply...
			value.set("I am good, How about you??"  , value.get("I am fine. Thank you :)"));
			
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("Hello Varsha " );  //you will get output value as whatever is set for this field
		System.out.println("I am good, How about you??");
		System.out.println("Java");

	}

}
