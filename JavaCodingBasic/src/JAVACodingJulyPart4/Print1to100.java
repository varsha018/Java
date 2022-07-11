package JAVACodingJulyPart4;

public class Print1to100 {
	
	//print 1 to 100, without using any numbers in your code..

	public static void main(String[] args) {
		
		//1. simple way
			for( int i=1 ; i <=100 ; i++) {  //we are using numbers here..
				System.out.println(i);
			}
		
			System.out.println("**********");
			
		//2.quick solution
			
			int one  = 'A'/'A';
			
			String s = "..........";
			
			for(int i = one ; i <= (s.length() * s.length()) ; i++) {  //we are not using any numbers
				System.out.println(i);
			}
			
			System.out.println("**********");
			
		//3.ASCII table >> a:97 ;b:98 ; c:99; d :100
			
			for(int i =one ; i <= 'd' ; i++) {
				System.out.println(i);
				
			}
			
			
			
			
			
			
			
			
			
		
	}

}
