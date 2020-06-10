package Action;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Action_2 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new Action_2();
	}
	Container con;
	JButton b1;
	JLabel l1;
	String[] bn = {"남자","여자"};
	public Action_2() {
		setTitle("버튼");
		setSize(200,00);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		
		con=getContentPane();
		con.setLayout(new FlowLayout());
			
		for (int i = 0; i < bn.length; i++) {
			con.add(b1 = new JButton(bn[i]));
			b1.addActionListener(this);
		}
		con.add(l1 = new JLabel("선택하시오"));
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("남자")) {
			l1.setText("남자를 선택함");
		}else if (e.getActionCommand().equals("여자")) {
			l1.setText("여자를 선택함");
		}
	}
	
}
