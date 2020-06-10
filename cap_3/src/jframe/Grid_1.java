package jframe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grid_1 extends JFrame{

	public static void main(String[] args) {
		new Grid_1();
	}
	JPanel p1;
	JButton b1;
	
	public Grid_1() {
		setTitle("±¸¿Í¾Ç");
		setSize(300, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(p1 = new JPanel(new GridLayout(3, 3, 5, 5)));
		p1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		for (int i = 1; i < 10; i++) {
			p1.add(b1 = new JButton(""+i));
		}
		setVisible(true);
	}

}
