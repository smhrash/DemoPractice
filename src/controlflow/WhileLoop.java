package controlflow;

public class WhileLoop {
	
	// While Loop is used in situation where we do not know how many times loop need to 
	// executed before hand
	// For Loop is used where we already know about the number of times Loop needs
	 // to be executed.
	// While Loop precondition check
	// while (condition){++}
	
	public static void main(String [] args) {
		
		
		int x = 15;
		int y = 20;
		
		while(x < 30) {
			System.out.println( "We are learning While Loop");
			x++;
			
			
			while(y < 30) {
				System.out.println( "Nested While Loop");
				y++;
			}	
		}
	}

}
