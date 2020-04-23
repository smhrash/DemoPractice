package hw2;


public class Mobile {
	

	String mobileBrand;
	String mobileModel;
	double price;
	int ramSize;
	
	// Constructor
	public Mobile() {
		
	}

	public Mobile(String mobileBrand, String mobileModel, double price, int ramSize) {
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramSize = ramSize;
	
	
		System.out.println(" Mobile brand is "+this.mobileBrand +" "+"model: "+this.mobileModel+" "+"price: "+this.price+" "+"Ram: "+this.ramSize);
	}
		// Method
		void displayInformation(String mobileBrand,String mobileModel,double price,int ramSize) {
			 
		}
		
	public static void main(String [] args) {
		
		Mobile mobile = new Mobile("Apple", "11Max pro", 1300.00, 150);
	
		System.out.println("=====================================================");
		
		Mobile obj =new Mobile("Samsung", "S20", 1400.00, 150);
		
		System.out.println("=====================================================");
		
		int ramSize=50;
		if(ramSize>=150) {
			System.out.println("It's a 11Max pro mobile");
		}else {
			System.out.println("It's a 11Max mobile");
		}
		System.out.println("=====================================================");
		for (int i = 0; i <= 5; i++){
			// Parent For Loop
			
			System.out.println("I like Apple Mobile");
			 
			// Child For Loop
			for(int j = 0; j< 2; j++ ) {
				
				System.out.println("My friend likes Samsung Mobile");

	}
		
	}
}

}

