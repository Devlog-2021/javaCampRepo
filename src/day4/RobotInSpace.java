package day4;
	import java.awt.KeyEventDispatcher; 
	import java.awt.KeyboardFocusManager; 
	import java.awt.event.KeyEvent; 
	import java.io.File;
	import javax.sound.sampled.AudioInputStream; 
	import javax.sound.sampled.AudioSystem; 
	import javax.sound.sampled.Clip;

import org.jointheleague.graphical.robot.Robot;
	
	public class RobotInSpace implements KeyEventDispatcher {
		
	Robot rob = new Robot("mini");

	/*  Make the Robot move around the screen when the arrow keys are pressed... */
	private void moveRobot(int keyPressed) throws InterruptedException {
	    // 0. Print out the keyPressed variable and write down the numbers for each arrow key
	
	    // 1. If the up arrow is pressed, use microMove() the Robot up the screen.
		
	    // 2. If the down arrow is pressed, use microMove() the Robot down.
		
	    // 3. If the left arrow is pressed, use microMove() to make the Robot move left. Hint: Make sure to end with the Robot facing UP.
	  
	    // 4. If right is pressed, use  microMove() to make the Robot move right.
	   
	    // 5. Then move the Robot to RD-2D for a surprise! 
	}

	private void checkIfR2D2Found() throws Exception {
	    int robotLocationX = rob.getX();
	    int robotLocationY = rob.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
	        playEureka();
	}

	public static void main(String[] args) {
	    new RobotInSpace().controlTheRobot();
	}


	private void controlTheRobot() {
	    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
	    rob.setWindowImage("day4/planet.jpg");
	    rob.penUp();
	    rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
	    if (e.getID() == KeyEvent.KEY_PRESSED) {
	        try {
				moveRobot(e.getKeyCode());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
	            checkIfR2D2Found();
	        } catch (Exception exception) {
	        }
	    }
	    return false;
	}

	public void playEureka() {
	    System.out.println("EUREKA!");
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/day4/r2d2Eureka.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
	}


