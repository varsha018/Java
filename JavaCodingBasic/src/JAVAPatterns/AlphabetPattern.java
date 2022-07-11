package JAVAPatterns;

/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E F G 
A B C D E F G H 
A B C D E F G H I            */


public class AlphabetPattern {

	public static void main(String[] args) {
		int alpha = 65; //ascii valUe of A = 65 , B=66, C=67, D=68...
						//ASCII for a =97,b=98...

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + (char)(alpha + j) ); //typeCast ASCII values into char and add blank

			}
			System.out.println();
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		/*
		 * A 
		 * B B 
		 * C C C 
		 * D D D D
		 * 
		 */
		
		
		for(int a = 0 ; a < 5 ; a++) {
			for(int b = 0 ; b <=  a ; b ++) {
				System.out.print((char)alpha + " ");
			}
			alpha++;
			System.out.println();
			
			
		}
	}

}
