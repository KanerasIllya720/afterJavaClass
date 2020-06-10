package jframe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Practice_RadioButtoon {
	public static void main(String[] args) {
		new Practice_RadioButtoon().run();
	}
	public void run() {
		JFrame fr = new JFrame();
		fr.setSize(230, 200);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		fr.setTitle("버튼");
		
		String[] nick = "얀데레,키,요,히,메".split(",");
		JRadioButton[] rad = new JRadioButton[5];
		for (int i = 0; i < rad.length; i++) {
			rad[i] = new JRadioButton(nick[i]);
			rad[i].setBounds(20,20 + i * 25, 80, 30);
			fr.add(rad[i]);
		}
		
		JButton b1 = new JButton("실행?");
		b1.setBounds(120, 20, 70, 120);
		fr.add(b1);
		
		fr.setVisible(true);
	}

}
