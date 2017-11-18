import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyActionListener implements ActionListener {

	JTextField tf;
	JLabel label;
	
	public MyActionListener(JTextField tf, JLabel label) {
		this.tf = tf;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command == "yes") {
			label.setText(tf.getText() + " Good job!");
		} else if (command == "no") {
			label.setText(tf.getText() + " FOLLOW INSTRUCTIONS!!!!");
		}
	}

}
