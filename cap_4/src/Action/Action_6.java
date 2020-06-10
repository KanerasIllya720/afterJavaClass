package Action;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Action_6 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		new Action_6().form();
	}
	JButton b1;
	Container con;
	private void form() {
		setTitle("식별");
		setLocationRelativeTo(null);
		con = getContentPane();
		con.setLayout(new FlowLayout());
		String[] list = "회원가입,로그인,종료".split(",");
		for (int i = 0; i < list.length; i++) {
			con.add(b1 = new JButton(list[i]));
			b1.addActionListener(this);
		}
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("회원가입")) {
			JOptionPane.showMessageDialog(null, "로보토미 코퍼레이션에 가입되셨습니다");
		}else if (e.getActionCommand().equals("로그인")) {
			JOptionPane.showMessageDialog(null, "출근하셨습니다");
		}else if (e.getActionCommand().equals("종료")) {
			JOptionPane.showMessageDialog(null, "만지지마");
			System.exit(0);
		}
			
		
	}
}
