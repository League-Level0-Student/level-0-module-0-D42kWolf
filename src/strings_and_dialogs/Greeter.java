package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog( "Whats your name?");
		System.out.println(message); 
		JOptionPane.showMessageDialog(null,"Hi " + message);
}}
