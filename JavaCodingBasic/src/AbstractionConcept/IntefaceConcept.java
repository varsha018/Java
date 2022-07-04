package AbstractionConcept;

public interface IntefaceConcept {
	
	//complete abstraction
	//cannot create object of Interface
	//no need to write abstract keyword
	//we do not WRITE STATIC in front of methods in Interface as static methods cannot be over-ridden
	//we need to override these methods in our classes and write the body of these methods >>so NO STATIC KEYWORD before methods
	//variables are FINAL and STATIC
	
	//From JDK 1.8 you can have static method in interfaces..
	
	
	public void BMW();
	
	public void Lamborgini();
	
	public void Jaquor();
	
	public void Marcedes();
	
	int i = 10;
	
	String var = "Varsha";
	
	//for using static methods .. use by Interface name
	public static void StaticMethod() {
		System.out.println("from JDK 1.8, STATIC METHODS ARE ALLOWD IN INTERFACES");
	}
	
	
	default void InternShip() { //it cannot be static
		
		System.out.println("default things...");
	}
	
}
