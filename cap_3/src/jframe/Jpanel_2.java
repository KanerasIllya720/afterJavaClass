package jframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Jpanel_2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(330, 120);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setTitle("ÆÇ³Ú");
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(10, 0, 150, 70);
		jp1.setBorder(new TitledBorder("ñ§"));
		jf.add(jp1);
		
		JButton jb1 = new JButton("¹¹");
		jb1.setBounds(30, 30, 70, 30);
		jp1.add(jb1);
		
		JPanel jp2 = new JPanel();
		jp2.setBounds(160, 0, 150, 70);
		jp2.setBorder(new TitledBorder("éÓ"));
		jf.add(jp2);
		
		
		JButton jb2 = new JButton("¹«¿ä");
		jb2.setBounds(30, 30, 70, 30);
		jp2.add(jb2);
		
		jf.setVisible(true);
	}

}
