package jframe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenu_2 extends JFrame {
	public static void main(String[] args) {
		new JMenu_2().run();
	}
	JMenuBar bar;
	JMenu m1, m2;
	JMenuItem item[] = new JMenuItem[4];
	JMenuItem item2[] = new JMenuItem[3];
	
	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(bar = new JMenuBar(), BorderLayout.NORTH);
		
		m1 = new JMenu("기능");
		String mb1[] = "야 꿀벌,소난다,넣을게".split(",");
		
		m2 = new JMenu("관리자메뉴");
		String mb2[] = "입력,관리".split(",");
		
		for (int i = 0; i < mb1.length; i++) {
			m1.add(item[i] = new JMenuItem(mb1[i]));
		}
		m1.addSeparator();
		m1.add("종료");
		
		for (int i = 0; i < mb2.length; i++) {
			m2.add(item2[i] = new JMenuItem(mb2[i]));
		}
		m2.addSeparator();
		m2.add("로그아웃");
		
		bar.add(m1);
		bar.add(m2);
		setVisible(true);
	}

}
