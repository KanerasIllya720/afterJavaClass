package jframe;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JTabPan_1 extends JFrame {
	
	public static void main(String[] args) {
		new JTabPan_1().run();
	}
	JTabbedPane tabPan;
	String tab[] = "관리자,사용자,도움말".split(",");

	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		Container con = getContentPane();
		tabPan = new JTabbedPane();
		con.add(tabPan, BorderLayout.CENTER);
		for (int i = 0; i < tab.length; i++) {
			tabPan.add(tab[i], new JLabel(tab[i]+"탭"));
		}
		setVisible(true);
	}
	

}
