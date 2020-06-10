package jframe;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grid_2 extends JFrame{

	public static void main(String[] args) {
		new Grid_2();
	}
	JPanel p1;
	JButton b1;
	
	public Grid_2() {
		setTitle("구와악");
		setSize(300, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(p1 = new JPanel(new GridLayout(4, 1, 5, 5)));
		p1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String[] nick = "키,요,히,메".split(",");
		for (int i = 0; i < nick.length; i++) {
			p1.add(b1 = new JButton(nick[i]));
		}
		setVisible(true);
	}

}
