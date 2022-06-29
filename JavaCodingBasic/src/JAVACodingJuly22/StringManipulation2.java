package JAVACodingJuly22;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String srg = "my_name_is_/_@_(*)_varsha_Gupta_*****_+_%_&&_!";
		
		String srgarray[] = srg.split("_");
		
		for(int i = 0; i < srgarray.length; i++) {
			System.out.println(srgarray[i]);
		}
		

		
		String s = "welcome";
		String p ="home";
		int i = 100;
		int j = 123;
		
		System.out.println(s+p+i+j);
		System.out.println(s+p+(i+j));
		System.out.println(i+j+s+p);
		
		
	}

}
