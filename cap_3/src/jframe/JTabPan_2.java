package jframe;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JTabPan_2 extends JFrame {
	
	public static void main(String[] args) {
		new JTabPan_2().run();
	}
	JTabbedPane tabPan;
	ImageIcon img;

	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.LEFT);
		con.add(tabPan, BorderLayout.CENTER);
		img = new ImageIcon("D:/javaWork/cap_3/src/jframe/1.jpg");
		
		tabPan.add("그림보기", new JLabel(img));
		tabPan.add("설명", new JTextArea("이 그림은 나도 모르겠다"));
		
		setVisible(true);
	}
	

}
