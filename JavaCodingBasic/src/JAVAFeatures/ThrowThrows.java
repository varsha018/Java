package JAVAFeatures;

public class ThrowThrows {

	public static void main(String[] args){

		ThrowThrows th = new ThrowThrows();
		sum();	
		
		try {
			throw new Exception("this is blank");
		} catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	public static void sum() {
		div();
	}
	
	public static void div() {
		try {
			int i =9/0;
			System.out.println("this will get printed" );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("this will be printed...");
		}
	}
	
	

	

}
