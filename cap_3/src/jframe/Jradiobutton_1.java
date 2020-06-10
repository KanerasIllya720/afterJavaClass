package jframe;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Jradiobutton_1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("라디오버튼");
		jf.setDefaultCloseOperation(2);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JRadioButton jr = new JRadioButton("JRadioButton",true);
		jr.setBounds(40, 40, 120, 30);
		jf.add(jr);
		
		jf.setVisible(true);

	}

}
