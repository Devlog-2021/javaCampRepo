package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
	int number = rand.nextInt(4);
	 

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	
	// 3. Print out this variable

	String Random = JOptionPane.showInputDialog("Enter a number you think is awesome!");
	
	// 4. Get the user to enter something that they think is awesome
	
	if (number == 0) {
		
		JOptionPane.showMessageDialog(null, "Whatever you entered is awesome!");
		
	}
	

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	
	if (number == 1) {
		
		JOptionPane.showMessageDialog(null, "whatever you entered is ok.");
		
	}

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	if (number == 2) {
		
		JOptionPane.showMessageDialog(null, "whatever you entered is boring.");
		
	}
	
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	if (number == 3) {
		
		JOptionPane.showMessageDialog(null, "Whatever you entered is a fine number.");
		
	}
	
	// -- write your own answer

	}
}


