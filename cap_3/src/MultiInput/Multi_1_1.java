package MultiInput;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multi_1_1 extends JFrame{

	public static void main(String[] args) {
		new Multi_1_1().run();
	}
	JButton b1;
	JPanel p1, pan;

	private void run() {
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(p1 = new JPanel(new GridLayout(3, 1)));
		
		String str[][] = {{"1","2"},
									{"3"},
									{"4","5"}};
		for (int i = 0; i < str.length; i++) {
			p1.add(pan = new JPanel(new FlowLayout()));
			for (int j = 0; j < str[i].length; j++) {
				pan.add(b1 = new JButton(str[i][j]));
			}
		}
		
		setVisible(true);
	}

}
