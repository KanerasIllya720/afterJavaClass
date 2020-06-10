package jframe;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Border_1 extends JFrame {

	public static void main(String[] args) {
			new Border_1();
	}
	JPanel p1; JButton b1;
	public Border_1() {
		setSize(300, 200);
		setTitle("¤¡¤±¤©");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(p1 = new JPanel(new BorderLayout()));
		p1.add(b1 = new JButton("N"), BorderLayout.NORTH);
		p1.add(b1 = new JButton("W"), BorderLayout.WEST);
		p1.add(b1 = new JButton("C"), BorderLayout.CENTER);
		p1.add(b1 = new JButton("E"), BorderLayout.EAST);
		p1.add(b1 = new JButton("S"), BorderLayout.SOUTH);
		
		setVisible(b);
	}
}
