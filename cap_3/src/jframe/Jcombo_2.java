package jframe;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Jcombo_2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("����");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] item = "��,��,ȭ,��,��,��,��".split(",");
		JComboBox jc = new JComboBox();
		for (int i = 0; i < item.length; i++) {
			jc.addItem(item[i]+"����");
		}
		jc.setBounds(20, 40, 140, 25);
		jf.add(jc);
		
		jf.setVisible(true);
	}

}
