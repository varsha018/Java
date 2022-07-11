package JAVAPatterns;

public class StarPattern {

	public static void main(String[] args) {

		for(int i =1; i <= 5 ;i++) {
			for(int j =1 ; j <= i ; j++) {
				System.out.print("*"); //write only print for inner loop
			}
			System.out.println(); //write println for outer loop
		}

	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	
	
	for(int k = 1 ; k < 5 ; k ++) {
		for(int l = 5 ; l >= k ; l --) {
			System.out.print("*" ); //write only print for inner loop
		}
		System.out.println();
		
	}
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	for(int a = 1; a <= 5 ; a++) { //for row count (outer loop)
		for(int b = 4 ;b >= a ; b--) { //for initial blank spaces(4,3,2,1.. (inner loop) 
			System.out.print(" ");
		}
		for(int c = 1 ; c <= a ; c++) { //write only print for inner loop
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	for(int a = 1; a <= 5 ; a++) { //for row count (outer loop)
		for(int b = 4 ;b >= a ; b--) { //for initial blank spaces(4,3,2,1.. (inner loop) 
			System.out.print(" ");
		}
		for(int c = 1 ; c <= a ; c++) { //write only print for inner loop
			System.out.print(" *" );  //just add spaces in front of the star in the same code as for above pattern
		}
		System.out.println();
	}
	
  } 

	
}