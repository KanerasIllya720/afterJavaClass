package jframe;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_2 extends JFrame {

	JPanel p1;
	JButton b1;
	public static void main(String[] args) {
		new Flow_2();
	}
	public Flow_2() {
		setTitle("�÷ο���Ʈ");
		setLocationRelativeTo(null);
		
		add(p1 = new JPanel(new FlowLayout()));
		
		String[] nick = "Ű,��,��,��".split(",");
		for (int i = 0; i < nick.length; i++) {
			p1.add(b1 = new JButton(nick[i]));
		}
		pack();
		setVisible(true);
	}

}
