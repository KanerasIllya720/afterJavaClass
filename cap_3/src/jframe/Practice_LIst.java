package jframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Practice_LIst {
	public static void main(String[] args) {
		new Practice_LIst().run();
	}
	public void run() {
		JFrame fr = new JFrame();
		fr.setSize(230, 180);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setTitle("버튼");
		
		String[] list = "키,요,히,메".split(",");
		JList l1 = new JList(list);
		l1.setBounds(20,10,50,80);
		fr.add(l1);
		
		JButton b1 = new JButton("주문토끼");
		b1.setBounds(80, 10, 100, 30);
		fr.add(b1);
		
		fr.setVisible(true);
	}

}
