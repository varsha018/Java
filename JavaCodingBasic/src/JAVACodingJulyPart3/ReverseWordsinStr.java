package JAVACodingJulyPart3;

public class ReverseWordsinStr {

	public static void main(String[] args) {
		
		
		String str = "Welcome To JAVA class";
		
		String str1[] = str.split(" ");
		
		String ReverseWords ="";
		
		
		
		for(String s : str1) {
			
			String rev = "";
			
			for(int i = s.length()-1 ; i >= 0 ; i--) {
				
				rev = rev + s.charAt(i);
				
			}
			
			 ReverseWords =  ReverseWords + rev + " ";
			
		}
		
		System.out.println(ReverseWords);
	}

}
