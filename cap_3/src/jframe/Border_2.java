package jframe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_2 extends JFrame{

	public static void main(String[] args) {
		new Border_2().form();
	}
	JButton[] b1 = new JButton[4];
	JButton[] b2 = new JButton[2];
	JPanel p1,pan;
	private void form() {
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel p1 = new JPanel(new BorderLayout(5,5));
		add(p1);
		String name[] = "North,East,Center,South".split(",");
		for (int i = 0; i < name.length; i++) {
			p1.add(b1[i] = new JButton(name[i]), name[i]);
		}
		p1.add(pan = new JPanel(new GridLayout(2,1,10,10)),BorderLayout.WEST);
		for (int i = 0; i < b2.length; i++) {
			pan.add(b2[i]=new JButton("West"+(i+1)));
		}
		setTitle("Leatitia");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
