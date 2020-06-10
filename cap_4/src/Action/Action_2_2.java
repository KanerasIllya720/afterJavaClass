package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import jdk.nashorn.internal.scripts.JO;

public class Action_2_2 extends JFrame implements ActionListener{
	
	static JButton b1 = new JButton("확인");
	JRadioButton[] jr1 = new JRadioButton[3];
	JRadioButton[] jr2 = new JRadioButton[4];
	JPanel jp1, jp2, jp3;
	JLabel jl = new JLabel("소속");
	public static void main(String[] args) {
		new Action_2_2().form();
	}


	private void form() {
		setSize(260, 240);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("판넬");
		
		jp1.setBounds(10, 30, 110, 100);
		jp1.setBorder(new EtchedBorder());
		add(jp1);		
		
		jp2.setBounds(125, 30, 110, 100);
		jp2.setBorder(new EtchedBorder());
		add(jp2);
		
		jp3.setBounds(70, 140, 100, 50);
		add(jp3);
		
		jl.setBounds(50, 10, 60, 20);
		add(jl);
		jl = new JLabel("이름");
		jl.setBounds(165, 10, 60, 20);
		add(jl);
		
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
		b1.setLocation(50, 50);
		b1.addActionListener(this);
		jp3.add(b1);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String gender = null, grade = null;
		for (int i = 0; i < jr1.length; i++) {
			if(jr1[i].isSelected())
				gender = jr1[i].getText();
		}
		for (int i = 0; i < jr2.length; i++) {
			if(jr2[i].isSelected())
				gender = jr2[i].getText();
		}
		if (gender==null||grade==null) {
			JOptionPane.showMessageDialog(null, "성별과 학년을 선택해주세오");
		}
	}

}
