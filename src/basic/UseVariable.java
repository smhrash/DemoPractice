package basic;
 
public class UseVariable {
	
		
	// Variable is a container which can hold value
	
	// Integer is a data type
	
	// DataType variableName = value;

	// Non static Global variable
	
	// Variable type:
	
		// Global Variable
		// Local Variable
		
		/**
		 * Variable
		 * Local Variable: inside of a method
		 * Global Variable/Instance variable/Reference variable: inside of a class but outside of a method
		 * Class Variable: static keyword is used
		 */
	
	int x	=	5; 
	int p   =	7;
	// class Variable
	
	static int z=10;
	
	// Declare variable
	
	int a;
	
	// Declare and Initialized value
	
	int b=80;

	
	
	// constant variable;
	String Max_width="44";
	
	final String Min_width="36";
	 
	public static void main(String[]args) {
		
		
		// Local Variable
		
		int y= 6;
		
	
	System.out.println(UseVariable.z);
	 
	
	//need to create a object and then call it by object name
	
	//ClassName objectName= new constructorOfClass();
	
	
	UseVariable obj= new UseVariable();
	obj.p=14;
	
	System.out.println(obj.p); // call by object name
	 
	obj.p=37;
	
	System.out.println(obj.p);
	
	obj.a=55;
	
	System.out.println(obj.a);
	
	obj.b=200;
	
	System.out.println(obj.b);
	
	
	obj.Max_width="50";
	
	System.out.println(obj.Max_width);
	
	double first = 1;
	int second = 3;
	
	System.out.println("first is 1 second = 3" + "\n");
	

	
	
	
	
	
	}
	
}
