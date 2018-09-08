import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "What is your birthday?");

		if (answer.equals("9/8")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");

		} else {
			JOptionPane.showMessageDialog(null, "I wish you a very merry unbirthday!");
		}
	}

}
