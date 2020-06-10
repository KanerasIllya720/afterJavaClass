package jframe;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIcon_01 extends JFrame {
	Container con;
	JLabel l1, l2;
	ImageIcon img;
	public static void main(String[] args) {
		new ImageIcon_01().run();
	}

	private void run() {
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			con = getContentPane();
			con.setLayout(new FlowLayout());
			
			l1 = new JLabel("¾È³çÇÏ»ì¹ý");
			con.add(l1);
			
			img = new ImageIcon("D:/javaWork/cap_3/src/jframe/1.jpg");
			l2 = new JLabel(img);
			con.add(l2);
			
			pack();
			setVisible(true);
	}

}
