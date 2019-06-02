package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		int nickels = Integer.parseInt(JOptionPane.showInputDialog("How many nickels do you have?"));
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		int dimes = Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?"));
		// Ask the user how many quarters they have, and convert their answer
		int quarters = Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have?"));
		// Calculate how much money the user has and save it in a double variable 
		double money = 0.05*nickels + 0.1*dimes + 0.25*quarters;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + money + " dollars!");
	}
}

