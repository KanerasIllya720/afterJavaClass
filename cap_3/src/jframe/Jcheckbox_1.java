package jframe;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Jcheckbox_1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("üũ�ڽ�");
		jf.setDefaultCloseOperation(2);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JCheckBox jck = new JCheckBox("����");
		jck.setBounds(50, 40, 120, 30);
		jf.add(jck);
		
		jf.setVisible(true);

	}

}
