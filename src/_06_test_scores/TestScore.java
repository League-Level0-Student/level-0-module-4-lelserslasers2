package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		double score = Double.parseDouble( JOptionPane.showInputDialog("Enter Test Score: "));
		if (score > 93) {
			JOptionPane.showMessageDialog(null, "Wow, you studied hard!");
		}
		else if (score > 83) {
			JOptionPane.showMessageDialog(null, "Wow, Good job");
		}
		else if (score > 73) {
			JOptionPane.showMessageDialog(null, "Wow, nice try");
		}
		else if (score > 50) {
			JOptionPane.showMessageDialog(null, "Wow, you still passed");
		}
		else {
			JOptionPane.showMessageDialog(null, "Well, you tried   :(");
		}

	}

}
