package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		int first = JOptionPane.showOptionDialog(null, "You come across an old bridge, that is falling apart. Do you ", "First choice", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Cross the bridge", "swim across the water", "Try do find your way around"} , null);
		if (first == 0) {
			JOptionPane.showMessageDialog(null, "You dies because the bridge broke");
		}
		else if (first == 1) {
			JOptionPane.showMessageDialog(null, "You dies because you got eaten by a crocidile");
		}
		else {
			JOptionPane.showMessageDialog(null, "You lived");
		}
	}

}
