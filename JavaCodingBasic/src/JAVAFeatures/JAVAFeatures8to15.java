package JAVAFeatures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class JAVAFeatures8to15 {

	public static void main(String[] args) {

		//JAVA 8: Stream, Optional
			
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e ->  e%2 == 0).forEach(e -> System.out.println(e));
		
		Stream.of("hello" , "world").map(e -> e + " check $ ").forEach(System.out::println);
		
		//JAVA 9: JShell>>execute java cmd on command line 
				//factory method for immutable collections
		
			List<Integer> list =	Arrays.asList(1,2,3,4,5,6);
			
			List<String> lang =   List.of("java" , "python", "NodeJS");
			
			lang.stream().forEach(e -> System.out.println(e));
			
			
			
		//JAVA 10 : var variable >>does not need to write int,String before variable declaration...
			var x  =10;	//considered as int
			System.out.println(100 + x);
			var y  = "varisha"; //considered as String
			System.out.println(x + y);
			
			var z  = new HashSet<String>(); //object reference can also be used with "var" keyword
			z.add("ayu");
			
		//JAVA 12 : new switch case
			
			//old one:
			
			String browser = "chrome";
			
			switch(browser) {
			
			case "chrome":
				System.out.println("good");
				break;
				
			case "FF":
				break;
				
			case "IE":
				break;
			
			default:
				break;
			
			}
			
			//new one
			
		//	var n = 2;
		//	var m = switch(n) {
		//	case 1 -> "one";
		//	case 2 -> "two";
		//	case 3 ->	"three";
		//	default -> "number not found";
		//	}
			
		//	System.out.println(m);
		
			
		//JDK 13 : multi line string support >>to get the JSON response like things
			
	//	var response = 	"""{ 	"name : "varsha",
	//						   	"age" : "12",
	//					  	}""";
	
	// System.out.println(response);
			
			
			//JDK 14 : getter and setter , record , instance of
			
			 
			//JDK  15 : Sealed keyword
	
	
	}

}
