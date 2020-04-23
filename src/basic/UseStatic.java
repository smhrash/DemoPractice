package basic;

import basic.UseNestedClass.Computer;

public class UseStatic {
	
	
	// Static:
	// if variable and method is static then you can call those variable and method
	// by its class name.
	// if variable and method is non-static then you can call those variable and
	// method by its object name.

	// Global Variable

	// Static type Global variable
	
	static int age = 24;

	// Non-Static Global Variable
	String name= "James";

	public static void main(String[] args) {
		// className.variable
		UseStatic.age = 25; // Re Initialize value/ Re-Assign value
		System.out.println("My Age is " + UseStatic.age);

		// Object:
		/*
		 * An object is nothing but a self-contained component which consists of methods
		 * and properties to make a particular type of data useful. Object determines
		 * the behavior of the class. When you send a message to an object, you are
		 * asking the object to invoke or execute one of its methods. From a programming
		 * point of view, an object can be a data structure, a variable or a function.
		 * It has a memory location allocated. The object is designed as class
		 * hierarchies.
		 */

		// className objectName=new ContractorOfClass();
		
		Computer com = new Computer();
		com.computerBrandName ="Dell";
		System.out.println("Computer Brand Name is " + com.computerBrandName);

		UseStatic use = new UseStatic();


	
	}
	

}