package jframe;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Jcheckbox_2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(160, 250);
		jf.setTitle("체크박스");
		jf.setDefaultCloseOperation(2);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JCheckBox[] jck = new JCheckBox[4];
		String[] array1 = {"키", "요", "히", "메"};
		ButtonGroup bg = new ButtonGroup();
		
		for (int i  = 0; i < jck.length; i++) {
			jck[i] = new JCheckBox(array1[i]);
			jck[i].setBounds(30, 30 + 40 * i, 120, 30);
			jf.add(jck[i]);
			bg.add(jck[i]);
		}
		
		jf.setVisible(true);

	}

}
