package JAVACodingJuly22;

public class RemoveJunk {
	
	//use regular expression [^a-zA-Z0-9]
	//REPLACE all char which does not fall under this category with blank >> all special and junk char will be removed..

	public static void main(String[] args) {
		
		String s = "t%e$s!t 100By#100";
		
		String r  = s.replaceAll("[^a-zA-Z0-9]", "");  //Replace all with Regular Expression
		
		System.out.println("The Junk String is ===> " + s);
		System.out.println("Junk Removed ===> " + r);
		
		
		
		

	}

}
