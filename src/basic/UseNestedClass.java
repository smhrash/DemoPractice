package basic;

public class UseNestedClass {
	
	// Parent class
	
	
	
	public static void main(String[]args) {
		
		
		System.out.println(Computer.name);
		
	
		Computer.display();
		
	}
	public static class Computer{
		
		// Nested class / Child class
		
	
		static String name = "Nafis";
		
		
		public static void display() {
			System.out.println("Display is Good");
		}

		public String computerBrandName;
		
	}
	
	public class Car{
		
		// Nested class / Child class
		
		
		
		
		
		
	}


}