package Action;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Action_3 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		new Action_3().form();
	}
	JLabel l1;
	JTextField id;
	JPasswordField pass;
	JButton b1;
	Container con;
	
	String[] bn = {"Ȯ��","���"};
	String[] ln = {"ID", "PW"};

	private void form() {
		setTitle("�ĺ�");
		setSize(180, 130);
		setLocationRelativeTo(null);
		setLayout(null);
		 
		con = getContentPane();
		con.setLayout(new FlowLayout());
		for (int i = 0; i < ln.length; i++) {
			con.add(l1 = new JLabel(ln[i]));
			l1.setPreferredSize(new Dimension(30, 20));
			if (i==0) {
				con.add(id = new JTextField(10));
			}else {
				con.add(pass = new JPasswordField(10));
			}
		}
		for (int i = 0; i < bn.length; i++) {
			con.add(b1 = new JButton(bn[i]));
			b1.addActionListener(this);
		}
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ȯ��")) {
			if(id.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���");
				id.requestFocus();
			}else if(pass.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է��ϼ���");
				pass.requestFocus();
			}else if (id.getText().equals("admin") && pass.getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "�α��� ����");
			}else {
				JOptionPane.showMessageDialog(null, "���� ����ġ");
				id.setText("");
				pass.setText("");
			}
		}else if(e.getActionCommand().equals("���")){
			dispose();
		}
		
	}

}
