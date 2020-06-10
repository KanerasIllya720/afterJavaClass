package jframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class JTabPan_4 extends JFrame {
	
	public static void main(String[] args) {
		new JTabPan_4().run();
	}
	JTabbedPane tabPan;
	JTable1 table;
	JTextArea jta;
	
	String tab[] = "관리자,사용자,도움말".split(",");
	class JTable1 extends JPanel{
		public JTable1(String str) {
			JButton b1 = new JButton("관리");
			add(new JLabel(str));
			add(b1);
		}
	}

	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.LEFT);
		con.add(tabPan, BorderLayout.CENTER);
		for (int i = 0; i < tab.length; i++) {
			table = new JTable1(tab[i]);
			tabPan.add(tab[i], table);
		}
		setVisible(true);
	}
	

}
