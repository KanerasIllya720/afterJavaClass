package jframe;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Jpanel_1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 180);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setTitle("ÆÇ³Ú");
		
		JPanel jp = new JPanel();
		jp.setBounds(20, 20, 150, 100);
		jp.setBorder(new TitledBorder("Panel"));
		jf.add(jp);
		jf.setVisible(true);
	}

}
