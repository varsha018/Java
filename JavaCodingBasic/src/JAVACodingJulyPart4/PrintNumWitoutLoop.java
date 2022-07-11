package JAVACodingJulyPart4;

import java.util.stream.IntStream;

public class PrintNumWitoutLoop {
	
	//using recursive function >>num calling itself
	
	public static void main(String[] args) {
		
		
		// PrintNum(1);   //>>recursive function
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));  //IntStream function

	}
	
	
	public static void PrintNum(int num) {
		
		if(num <=100) {
		System.out.println(num);
		num++;
		PrintNum(num);
		
		}
		
		
		
	}
}
