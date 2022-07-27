package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// Create a new Robot

	Robot rob = new Robot();
	
	void go() {
		
		rob.setSpeed(100);
		
		// Make the robot move quickly (setSpeed)

		rob.setPenWidth(5);
		
		// Set the robot's pen width to 5  
		
		rob.penDown();
		
		// Put the robot's pen down
		
		// This numberOfSquares variable will track how many squares the robot has drawn
		// It's set to zero here, because the robot hasn't drawn any squares yet.
		
		int squaresDrawn = 0;

		// LOOP: Start a while loop to repeat the following code until 4 squares have been drawn:

while(squaresDrawn < 4) {
			
	rob.penDown();
	rob.setRandomPenColor();
	rob.move(80);
	rob.turn(90);
	rob.move(80);
	rob.turn(90);
	rob.move(80);
	rob.turn(90);
	rob.move(80);
	rob.penUp();
	rob.move(100);
	squaresDrawn +=1;
	
			
			
		}
			
		
				// PEN COLOR.     Set the pen color to random       setRandomPenColor()
		
				// DRAW A SQUARE. Call the drawSquare() method.  Have you put some code in it?
		
				// TURN.          Turn the robot 90 degrees to the right
			
			    // INCREASE COUNT. Add one to the number of squares drawn
			
		// End the loop here
	}

	
	void drawSquare() {
		System.out.println("Yay! you called the drawSquare() method!");

			
		/*  Put code here to draw one square - don't forget to use a loop! */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
