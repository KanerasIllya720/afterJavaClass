package jframe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenu_1 extends JFrame {
	public static void main(String[] args) {
		new JMenu_1().run();
	}
	JMenuBar bar;
	JMenu m1;
	JMenuItem item[] = new JMenuItem[4];
	
	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(bar = new JMenuBar(), BorderLayout.NORTH);
		m1 = new JMenu("���");
		String mb1[] = "�� �ܹ�,�ҳ���,������".split(",");
		for (int i = 0; i < mb1.length; i++) {
			m1.add(item[i] = new JMenuItem(mb1[i]));
		}
		m1.addSeparator();
		m1.add("����");
		bar.add(m1);
		setVisible(true);
	}

}
