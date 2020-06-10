package jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Practice_Button {
	public static void main(String[] args) {
		new Practice_Button().run();
	}
	public void run() {
		JFrame fr = new JFrame();
		fr.setSize(230, 150);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setTitle("버튼");
		
		JButton b1 = new JButton();
		b1.setText("키요히메");
		b1.setBounds(40, 35, 130, 40);
		fr.add(b1);
		
		fr.setVisible(true);
	}

}
