package jframe;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_1 extends JFrame {

	JPanel p1;
	JButton b1;
	public static void main(String[] args) {
		new Flow_1();
	}
	public Flow_1() {
		setSize(350, 200);
		setTitle("플로우차트");
		setLocationRelativeTo(null);
		
		add(p1 = new JPanel(new FlowLayout()));
		
		for (int i = 0; i < 10; i++) {
			p1.add(b1 = new JButton("ㅋㅍㄴㅌ "+i));
		}
		setVisible(true);
	}

}
