package JAVACodingJulyPart4;

public class PracticeDataTypes {
	
	public static final int i = 101010;
	
	static {
		System.out.println("you can write static block anywhere in the program and any number of times");
	}
	public static void main(String[] args) {

		
		System.out.println(Double.MAX_VALUE);	//positive num
		System.out.println(Double.MIN_VALUE);	//positive num
		System.out.println(Integer.MIN_VALUE);	//negative num
		System.out.println(Long.MIN_VALUE);		//-ve num
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));	//0.0d is min
		System.out.println(Math.min(Integer.MIN_VALUE, 0));	//Integer.min_value is min as it is -ve
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); //-ve infinity is min
		
		System.out.println(PracticeDataTypes.i);
		
		//create obj of class to call instance initialization method and constructor
		new PracticeDataTypes();
		

	}

	

static {
	System.out.println("static block is executed before the main method");
}


{
	{
		System.out.println("instance initialization method >>.. don't need any keyword >>just instance initialization");
		System.out.println("called only when you create object of the class");
	}
	

	
}
	PracticeDataTypes(){
		System.out.println("this is the constructor of the class, called only when object is created");
		System.out.println("if instance  initialization method is present, constructor will not be given the first priority ");
}

}

