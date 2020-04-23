package hw2;

public class Pizza {
	

	String name;
	String size;
	double price;

	
	
	//Constructor
	public Pizza() {
		
	System.out.println("Pizza");	
	
	}

	 

	public Pizza(String name, String size, double price) {
	
		this.name = name;
		this.size = size;
		this.price = price;
	
		System.out.println(" Pizza name is "+this.name +" "+"size: "+this.size+" "+"price: "+this.price);
	}

	// Method
	void displayInformation() {
		String name;
		String size;
		double price;

		
		
	}
	
	public static void main(String[] args) {
		
		Pizza pizza= new Pizza("Dominos", "Large", 30.00);
		

		System.out.println("=====================================================");
		
		Pizza obj= new Pizza("Buddy's Pizza","large", 32.00);

		System.out.println("=====================================================");
		
		double price= 30.00;
		
		if (price>= 30.00) {
			System.out.println("It's a large pizza");
		
		}else {
			System.out.println("It's a medium or small pizza");
		}
			

		System.out.println("=====================================================");
			
		for (int i = 0; i <= 5; i++){
				// Parent For Loop
				
				System.out.println("I like Pizza");
				 
				// Child For Loop
				for(int j = 0; j< 2; j++ ) {
		
					System.out.println("Pizza is good");

		}
		
		
	}
	}
}