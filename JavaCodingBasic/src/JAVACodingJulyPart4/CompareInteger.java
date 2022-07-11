package JAVACodingJulyPart4;

public class CompareInteger {
	
	//compare two int numbers (Integer Caching) >>  (-128 to 127)>>within this range it will give"Numbers Equal"
	//This is called Integer Caching												//if out of range >>num not equal..
	
	public static void main(String[] args) {


		Integer num1 =190;
		Integer num2 =190;
		
		if(num1 ==num2) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are Unequal");
		}
	}

}
