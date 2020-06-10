package jframe;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Jpanel_3 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(260, 240);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setTitle("판넬");
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(10, 30, 110, 160);
		jp1.setBorder(new EtchedBorder());
		jf.add(jp1);		
		JPanel jp2 = new JPanel();
		jp2.setBounds(125, 30, 110, 160);
		jp2.setBorder(new EtchedBorder());
		jf.add(jp2);
		 
		JLabel jl = new JLabel("소속");
		jl.setBounds(50, 10, 60, 20);
		jf.add(jl);
		jl = new JLabel("이름");
		jl.setBounds(165, 10, 60, 20);
		jf.add(jl);
		
		JRadioButton[] jr1 = new JRadioButton[3];
		JRadioButton[] jr2 = new JRadioButton[4];
		
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();
		
		String[] nick1 = "칼,데,아".split(",");
		String[] nick2 = "키,요,히,메".split(",");
		
		for (int i = 0; i < jr1.length; i++) {
			jr1[i] = new JRadioButton(nick1[i]);
			jr1[i].setBounds(25, 15 + i * 10, 60, 15);
			jp1.add(jr1[i]);
			bg1.add(jr1[i]);
		}
		for (int i = 0; i < jr2.length; i++) {
			jr2[i] = new JRadioButton(nick2[i]);
			jr2[i].setBounds(25, 10 + i * 10, 60, 15);
			jp2.add(jr2[i]);
			bg2.add(jr2[i]);
		}
		jf.setVisible(true);
	}

}
