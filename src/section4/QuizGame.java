package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		
		int score = 0;

		
		// 2.  Ask the user a question 
		
		String awnser = JOptionPane.showInputDialog("What is the ratio of Pie?");
		
		// 3.  Use an if statement to check if their answer is correct
		
		if (awnser.equalsIgnoreCase("1.5")) {
			
			JOptionPane.showMessageDialog(null, "correct!");
			
			score += 1;
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "Wrong!"); }
		
		// 4.  if the user's answer was correct, add one to their score 
		
		String awnser1 = JOptionPane.showInputDialog("what is E in physics?");
		
		if (awnser1.equalsIgnoreCase("energy")) {
			
			score +=1;
		
			JOptionPane.showMessageDialog(null, "Correct!");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "wrong!"); }
		
		String awnser2 = JOptionPane.showInputDialog("what is the lifespan of a whale?");
		
		if (awnser2.equalsIgnoreCase("115")) {
			
			score +=1;
			
			JOptionPane.showMessageDialog(null, "Correct!");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "wrong!"); }
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			
		
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
