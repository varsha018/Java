package JAVACodingJulyPart4;

public class PrintHelloWorld {
	
	//print hello world without using Semi colon
	
	public static void main(String[] args) {
		
		//1. printf
		
		if(System.out.printf("Hello World"+ "\n")  == null){
			
		}
		
		
		//2. append
		
		if(System.out.append("Hello World" + "\n") == null) {
			
		}
		
		//3.equals
		
		if(System.out.append("Hello World" + "\n").equals(null)) {
			
		}
		
		
		//4.for loop (semi colon used but not with println statement
		for(int i =0 ; i < 1 ; System.out.println("Hello World")) {
			i++;
		}
	}

}
