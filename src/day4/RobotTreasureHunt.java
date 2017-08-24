package day4;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.robot;
import org.jointheleague.graphical.robot.Robot;

public class RobotTreasureHunt implements KeyEventDispatcher {

	int robotSpeed = 5;
	// 1. Create a new mini robot
	Robot rob = new Robot("mini");
	
	private void goUp() {
		// 2. Make the robot move up the screen
		rob.move(10);
	}

	private void goDown() {
		// 3. make the robot move down the screen
		rob.move(-10);
	}

	private void turnLeft() {
		// 4. Make the robot turn to the left
		rob.turn(-90);

	}

	private void turnRight() {
		// 5. make the robot turn to the right
		rob.turn(90);
	}

	private void spaceBarWasPressed() {
		int robotLocationX = rob.getX();
		int robotLocationY = rob.getY();

		// 5. Print out the variables for robotLocationX and robotLocationY
		System.out.println("robot X: " + rob.getX());
		System.out.println("robot Y: " + rob.getY());
		// 6. If robot is at same location as the little girl,
		// make a pop-up tell the robot where to go next
		if (rob.getX() == 520 && rob.getY() == 330) {
			JOptionPane.showMessageDialog(null, "Get the next clue at the blue flowers!");
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		if (rob.getX() == 70 && rob.getY() == 150) {
			JOptionPane.showMessageDialog(null, "Find the treasure at the waterfall!");
		}
		if (rob.getX() == 350 && rob.getY() == 350) {
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS!  YOU FOUND THE TREASURE!");
		}
		// 8.  For the final location - play a video for the user when they find the treasure (use the method below)
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and
		 * change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		//Paintable backgroundImage = new
		//ImageBackground("file:/Users/mattfreedman/Documents/The League/solvedrecipes/2dField.jpg");
		//rob.getBackgroundWindow().addPaintable(backgroundImage);
		Robot.setWindowImage("file:/Users/mattfreedman/Documents/The League/solvedrecipes/2dField.jpg");
		rob.penUp();
		JOptionPane.showMessageDialog(null, "Ask the whale for help with your quest. Press the space bar to ask.");

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				turnRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				turnLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main (String[] args) throws MalformedURLException {
		new RobotTreasureHunt().go();
	}
}
