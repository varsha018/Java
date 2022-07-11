package JAVAPatterns;

public class CalculationDataType {

	public static void main(String[] args) {
		
		//this summation will return  1
		
		int i = (char) + (byte) + (int) + (long) + 1; 
		int i1 = (char) + (byte) - (int) + (long) - 1; 
		
		int j = (char)1;
		int k =(byte)1;
		int l = (int)1;
		int m = (int) + (long) - 1;
		
		System.out.println("i : " + i);
		System.out.println("j : " +j);
		System.out.println("k : " + k);
		System.out.println("l : " +l);
		System.out.println("m : " + m);
		
		
		System.out.println(i1);

	}

}
