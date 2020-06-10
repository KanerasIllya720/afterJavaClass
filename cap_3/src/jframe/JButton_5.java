package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_5 extends JFrame{
	Container con;
	JButton b1;
	
	public static void main(String[] args) {
		new JButton_5().ui();
	}
	
	private void ui() {
		Image icon = Toolkit.getDefaultToolkit().getImage("1.jpg");
		setIconImage(icon);
		con.add(b1);
		
		b1.setOpaque(true);
		b1.setForeground(Color.CYAN);
		b1.setBackground(Color.RED);
		b1.setFont(new Font("HY¸¼Àº»ù¹°M", Font.ITALIC, 22));
		
		pack();
		setVisible(true);
	}
}