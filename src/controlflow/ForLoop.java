package controlflow;

public class ForLoop {

	// Loop is allowing us to Execute a statement or group of statements multiple times
	// For loop 
	// While Loop
	// Do. .While Loop
	// For Each Loop
	
	public static void main(String [] args) {
		
//		System.out.println("Hello world");
//		
//		System.out.println("--------------------");
//		
//		for (int i = 0; i <=5; i++){
//			
//			System.out.println("We are learning For Loop");
//			
		// Nested For Loop
		
			for (int i = 0; i <= 5; i++){
				// Parent For Loop
				
				System.out.println("We are learning Nested For Loop");
				 
				// Child For Loop
				for(int j = 0; j< 5; j++ ) {
					
					System.out.println("Nested Loop");
				}
				
			
		}
		
	}
}
