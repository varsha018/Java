package AbstractionConcept;

public class ImplementsInterfaceClass implements IntefaceConcept {

	public static void main(String[] args) {
		
		ImplementsInterfaceClass obj = new ImplementsInterfaceClass();
		obj.BMW();
		obj.Jaquor();
		obj.Lamborgini();
		
		IntefaceConcept.StaticMethod();  //for using static methods .. use by Interface name
		
		obj.InternShip(); //defined inside parent >>able to access parent properties..
		
		
		
		int j = obj.i;
		String s = obj.var;
		
		System.out.println(j);
		System.out.println(s);
		

	}

	@Override
	public void BMW() {
		System.out.println("BMW");
		
	}

	@Override
	public void Lamborgini() {
		System.out.println("Lamborgini");
		
	}

	@Override
	public void Jaquor() {
		System.out.println("Jaquor");
		
	}

	@Override
	public void Marcedes() {
		System.out.println("Marcedes");
		
	}

}
