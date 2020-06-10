package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Border_3 extends JFrame{

	public static void main(String[] args) {
		new Border_3().run();
	}
	JPanel p1, p2;
	JButton[] b1 = new JButton[3];
	JButton[] b2 = new JButton[7];
	private void run() {
		setTitle("¤±¤¤¤·¤©");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(2);
		setSize(400, 200);
		
		add(p1 = new JPanel(new GridLayout(1,3,5,5)),BorderLayout.CENTER);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		p1.setBackground(Color.LIGHT_GRAY);
		for (int i = 0; i < b1.length; i++) {
			p1.add(b1[i] = new JButton("Button"+(i+1)));
		}
		
		add(p2 = new JPanel(new GridLayout(2,3,5,5)),BorderLayout.SOUTH);
		p2.setBorder(new EmptyBorder(5, 5, 5, 5));
		p2.setBackground(Color.GRAY);
		for (int i = 0; i < b2.length; i++) {
			p2.add(b2[i] = new JButton("Button"+(i+4)));
		}
		setVisible(true);
	}
}
