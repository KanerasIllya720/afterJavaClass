package jframe;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_2 {
	public static void main(String[] args) {
		new JButton_2().ui();
	}

	private void ui() {
		JFrame jf = new JFrame();
		jf.setSize(200, 320);
		jf.setTitle("Button");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		Font font1 = 	new Font("HY¾èÀº»ù¹°M", Font.BOLD, 20);
		String[] bn = {"Å°", "¿ä" ,"È÷", "¸Þ"};
		
		for(int i = 0; i<bn.length; i++) {
			JButton jb = new JButton(bn[i]);
			jb.setBounds(20, 30 + 60*i, 136, 40);
			jb.setFont(font1);
			jf.add(jb);
		}
		jf.setVisible(true);
	}
}