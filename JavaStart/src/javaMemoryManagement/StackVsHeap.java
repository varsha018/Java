package javaMemoryManagement;

public class StackVsHeap {
	
	int a;  //global variable stored in heap memory
	int b;  //stored in heap memory
	
	static int c; //static variables stored in metaspace
	
	public static void main(String[] args) {
		//
		StackVsHeap t1= new StackVsHeap();  // new StackVsHeap() is the object of the class>> stored in heap memory
											// t1 is the object reference >> stored in stack memory..
											//stack memory>>LIFO Concept >>methods&vars which are created/allocated first are deallocated/destroyed last>>done by JVM..garbage collector does not destroys objects from stack memory
											//garbage collector destroys objects from heap memory>>for objects which have no refrence variables or blank refrence vars..
		
		
		
		//HEAP MEMORY HAS>> Young Generation, EDEN , Survivour 1, Survivour 2..
						// when first time objs are created it uses EDEN Space>>known as MINOR GARBAGE COLLECTOR.. and object reference in Stack memory
						//HEAP MEMORY ALLOCATION is present throughout the program execution but STACK for current method..
						//(after JDK 1.8)metaspace>>for static vars storage >>before it was called permanent generation(BEFORE JDK 1.8)..IT HAD STATIC MEMORY..not dynamic 
						//metaspace is not part of heap space it comes from native OS(WINDOWS,MAC,LINUX)>>share the memory of native OS..IS DYNAMIC IN NATURE
						//METASPACE is now dynamic.. expands and contracts as per storage..
	}
	
	public void a() {    // methods stored in stack memory
		int x=2;         //local variable stored in stack memory
	}
	
	public void b() {   // methods stored in stack memory
		int r=2;         //local variable stored in stack memory
	}

}
