package constructor;

public class UseConstructor {

	// constructor name will be same name as class Name.
	// Constructor has no return type.
	// Constructor are used to  initialize the object.
	// Before creating Parameterized constructor we must create default constructor 
	
	// Default /  non  Parameterized Constructor
	// Parameterized Constructor
	
	// AccessModifier className() {  }
	
	// Declare Variable
	
	String name;
	String address;
	int id;
	
	
	public  UseConstructor() {
		
		// default constructor
		
        System.out.println("Hello World"); 
        
		
	}
		
	public  UseConstructor(String name) {
		//Signature pattern/Parameter: Single parameterized Constructor
		
		this.name = name;
		
		System.out.println("Name is "+this.name);
	}
	
	
	
	public  UseConstructor(String newName, String address) {
		//Signature pattern/Parameter: Multiple parameterized Constructor
		
		this.name = newName;
		this.address = address;
		
		System.out.println("Name is "+this.name +" "+"Address is "+this.address);
		
		
	}
	
	public static void main(String []args) {
			
		// create a object of UseConstructor class
		// className objectName = new constructorOfClass	
		
		UseConstructor obj = new UseConstructor ();
		UseConstructor samirobj = new UseConstructor("Samir");	
		
		 UseConstructor rashidObj = new UseConstructor("Rashid","Queens, NY"); // Argument passing
		
		}


}



