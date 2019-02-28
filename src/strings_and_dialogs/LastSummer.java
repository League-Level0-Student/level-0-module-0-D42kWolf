package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog( "Whats your name?");
		System.out.println(message); 
		JOptionPane.showMessageDialog(null, "I lnow that you played games " + message + " Muhahaha!");
}}
