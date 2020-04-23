package hw2;

public class Car {
	
	String name;
	String model;
	double price;

	
	
	
	public Car() {
		
	System.out.println("Car");	
	
	}

	 

	public Car(String name, String model, double price) {
	
		this.name = name;
		this.model = model;
		this.price = price;
	
		System.out.println("Car name is "+this.name +" "+"model: "+this.model+" "+"price: "+this.price);
	}
	// Method
			void displayInformation() {
				String name;
				String model;
				double price;

			}
	public static void main(String[] args) {
		
		Car car= new Car("Toyota","RAV4", 3400.00);
		
		System.out.println("=====================================================");
		
		Car obj= new Car("Honda","CRV", 3200.00);
		
		System.out.println("=====================================================");
		
		double price= 10000.00;
		
		if (price>= 20000.00) {
			System.out.println("It's a Toyota SUV");
		
		}else {
			System.out.println("It's a Toyota Sidan");
		}
		System.out.println("=====================================================");
	
			for (int i = 0; i <= 5; i++){
			// Parent For Loop
			
			System.out.println("I like Toyota");
			 
			// Child For Loop
			for(int j = 0; j< 2; j++ ) {
				
				System.out.println("It's good car");
			}

	}	

		}

}
