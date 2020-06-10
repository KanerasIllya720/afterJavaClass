package jframe;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Jradiobutton_2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(250, 220);
		jf.setTitle("라디오버튼");
		jf.setDefaultCloseOperation(2);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JRadioButton[] jr = new JRadioButton[3];
		ButtonGroup bg = new ButtonGroup();//얘 없을 시 각각 선택 안됨
		
		for (int i = 0; i < jr.length; i++) {
			jr[i] = new JRadioButton((i+1)+"학년");
			jr[i].setBounds(70, 30 + 40 * i, 120, 30);
			jf.add(jr[i]);
			bg.add(jr[i]);
		}
		jr[2].setSelected(true);
		jf.setVisible(true);
	}
}