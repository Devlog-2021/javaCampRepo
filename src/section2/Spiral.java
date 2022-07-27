package section2;

import org.jointheleague.graphical.robot.Robot;

import com.sun.tools.javac.util.Log;

public class Spiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		
		Robot rob = new Robot();
		
		// Set your robot's pen down 
		
		rob.penDown();
		
		// SPEED. Set the robot to go at max speed (100)

		rob.setSpeed(100);	
		
		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.
		
		int lines = 0;
		int Count = 0;

		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT code below until 50 lines have been drawn
		
		while(lines < 50) {
			
			rob.setRandomPenColor();
			rob.move(5*Count);
			rob.turn(360/7);
			Count += 1;
			lines += 1;
			
			
		//	color: 3, 252, 32 ();
		
		}

			// COLOR.   Have the robot set a random pen color:      setRandomPenColor()

		
		
			// DRAW.    Move the robot (5*count) pixels
			//          count is the name of the variable you created earlier

			// TURN.    Turn the robot (360/7) degrees to the right

			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 )

			// Change the robot pen width to the current value of the count variable 


		//  End the while loop here

		
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
