package section2;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	// This code creates a Batman Robot
	Robot batman = new Robot("batman");
	
	void makeStars() {
		
		// This code will draw one star whose size is 150 pixels per side....
		// but first you have to write some code. Find the drawStar() method and 
		// write the code to draw a star.
		drawStar(150);
		
		// Run the program. Check that your star is the same as the first picture in the recipe.
		// Remove the drawStar(150) from the program before you proceed.
		
		// Set the robot speed to 100

		// Make a variable to hold the X position of the Robot and set it to 10

		// Make a variable to hold the Y position of the Robot and set it to 600

		// Make a variable to hold the star size and set it to 25
	
		// Make a variable to count how many stars have been drawn and set it to 0

		// LOOP: Start a while loop to repeat the following code until 7 stars have been drawn

			// Set the pen width to the number of stars drawn so far

			// Set the X position of the robot to your X variable

			// Set the Y position of the robot to your Y variable

			// Call the drawStar() method with your star size variable

			// Increase the value of the X position variable by star size. See Figure 2

			// decrease the value of the Y position variable by star size. See Figure 3

			// Increase the star size by 20

			// Turn the robot 12 degrees

			// Change the pen color (random)

		
			// Increase the number of stars that have been drawn by 1,
		
		
		// End the while loop here

		// Run the program. Check that your star looks like the picture in the recipe.
	}

	private void drawStar(int starSize) {
		// Put the robot's pen down

    	// COUNT. Create an int variable that will count how many lines of the star we have drawn.
    	//        The start value will be zero because no lines have yet been drawn. Use this code:
		  /**     int lines = 0;    **/

		// LOOP: Start a while loop to repeat the following code until 5 lines have been drawn

				// MOVE the robot the distance of the starSize variable

				// TURN the robot 144 degrees

				// COUNT. Add one to the number of lines the robot has drawn      lines+=1;

    	// End the while loop here

	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



