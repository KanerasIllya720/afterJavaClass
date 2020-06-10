package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Action_8 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Action_8().run();
	}
	
	JRadioButton[] rb1 = new JRadioButton[5];
	ButtonGroup bg = new ButtonGroup();
	JButton b1;
	
	String[] list = "Word,Java,Excel,PPT,C++".split(",");
	
	private void run() {
		setSize(220, 290);
		setTitle("라디오버튼");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		for (int i = 0; i < list.length; i++) {
			rb1[i] = new JRadioButton(list[i]);
			rb1[i].setBounds(30, 30 + 40 * i, 60, 30);
			add(rb1[i]);
			bg.add(rb1[i]);
		}
		b1 = new JButton("실행");
		b1.setBounds(110, 30, 80, 190);
		add(b1);
		b1.addActionListener(this);
		rb1[0].setSelected(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(rb1[0].isSelected())
			JOptionPane.showMessageDialog(null, list[0]+"과목이 선택되었습니다");
		else if(rb1[1].isSelected())
			JOptionPane.showMessageDialog(null, list[1]+"과목이 선택되었습니다");
		else if(rb1[2].isSelected())
			JOptionPane.showMessageDialog(null, list[2]+"과목이 선택되었습니다");
		else if(rb1[3].isSelected())
			JOptionPane.showMessageDialog(null, list[3]+"과목이 선택되었습니다");
		else if(rb1[4].isSelected())
			JOptionPane.showMessageDialog(null, list[4]+"과목이 선택되었습니다");
	}

}
