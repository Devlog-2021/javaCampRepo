package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		
			String response = JOptionPane.showInputDialog("Do you know how to Write Code?");
			
			if (response.equalsIgnoreCase("yes")) {
				
				JOptionPane.showInternalMessageDialog(null, "You will rule the world.");
			
			
		}
			
			else {
				
				JOptionPane.showInternalMessageDialog(null, "good luck washing dishes.");
				speak("hahahahahahahaha");
				
			}

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
	
	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	}