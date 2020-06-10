package jframe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Practice_TextBox {
	public static void main(String[] args) {
		new Practice_TextBox().run();
	}
	public void run() {
		JFrame fr = new JFrame();
		fr.setSize(230, 180);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setTitle("버튼");
		
		JLabel l1 = new JLabel("인정: ");
		l1.setBounds(20, 20, 60, 30);
		fr.add(l1);
		
		JTextField textbar = new JTextField();
		textbar.setBounds(80, 20, 120, 30);
		fr.add(textbar);
		
		JButton b1 = new JButton("실행?");
		b1.setBounds(20, 70, 180, 30);
		fr.add(b1);
		
		fr.setVisible(true);
	}

}
