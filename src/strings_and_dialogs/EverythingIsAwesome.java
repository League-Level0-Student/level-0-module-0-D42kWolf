package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome A{
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog( "What do you like?");
		System.out.println(message); 
		JOptionPane.showMessageDialog(null, message + " Is awsome!");
}}
a