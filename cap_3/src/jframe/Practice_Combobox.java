package jframe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Practice_Combobox {
	public static void main(String[] args) {
		new Practice_Combobox().run();
	}
	public void run() {
		JFrame fr = new JFrame();
		fr.setSize(230, 160);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setTitle("버튼");
		
		String[] nick = "키,요,히,메".split(",");
		JComboBox com = new JComboBox();
		for (int i = 0; i < nick.length; i++) {
			com.addItem(nick[i]);
		}
		com.setBounds(20, 20, 160, 30);
		fr.add(com);		
		
		JButton b1 = new JButton("와드");
		b1.setBounds(20, 60, 160, 30);
		fr.add(b1);
		
		fr.setVisible(true);
	}

}
