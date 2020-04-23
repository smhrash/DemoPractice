package hw2;

public class Computer {
	
	String name;
	String brand;
	double price;
	int ramSize;
	
	
	// Constructor
	public Computer() {
		
	System.out.println("Computer");	
	
	}

	 

	public Computer(String name, String brand, double price, int ramSize) {
	
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.ramSize=ramSize;
	
		System.out.println("Computer name is "+this.name +" "+"brand: "+this.brand+" "+"price: "+this.price+" "+"Ram Size: "+this.ramSize);
	}

	// Method
		void displayInformation() {
			String name;
			String brand;
			double price;
			int ramSize;
			
		}
		
	public static void main(String[] args) {
		
		Computer computer= new Computer("Apple", "MacBook Pro", 2700.00, 500);
		
		System.out.println("=====================================================");
		
		Computer obj = new Computer("Dell", "Express", 1700.00, 500);
		
		System.out.println("=====================================================");
		
		int ramSize= 500;
		
		if (ramSize>= 500) {
			System.out.println("It's a MacBook Pro Computer");
		
		}else {
			System.out.println("It's a MacBook Computer");
		}
			System.out.println("=====================================================");
			
			for (int i = 0; i <= 5; i++){
					// Parent For Loop
					
					System.out.println("I like MacBook");
					 
					// Child For Loop
					for(int j = 0; j< 2; j++ ) {
						
						System.out.println("It's good computer");
						
		}
	


	}	


}
}