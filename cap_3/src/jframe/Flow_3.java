package jframe;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_3 extends JFrame {
	Container con = getContentPane();
	public static void main(String[] args) {
		new Flow_3();
	}
	public Flow_3() {
		setSize(200, 300);
		setTitle("�÷ο���Ʈ3");
		setLocationRelativeTo(null);
		
		con.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		String[] nick = "Ű,��,��,��".split(",");
		for (int i = 0; i < nick.length; i++) {
			con.add(new JButton(nick[i]));
		}
		pack();
		setVisible(true);
	}

}
