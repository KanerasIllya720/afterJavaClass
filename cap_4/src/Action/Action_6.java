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
		setTitle("�ĺ�");
		setLocationRelativeTo(null);
		con = getContentPane();
		con.setLayout(new FlowLayout());
		String[] list = "ȸ������,�α���,����".split(",");
		for (int i = 0; i < list.length; i++) {
			con.add(b1 = new JButton(list[i]));
			b1.addActionListener(this);
		}
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ȸ������")) {
			JOptionPane.showMessageDialog(null, "�κ���� ���۷��̼ǿ� ���ԵǼ̽��ϴ�");
		}else if (e.getActionCommand().equals("�α���")) {
			JOptionPane.showMessageDialog(null, "����ϼ̽��ϴ�");
		}else if (e.getActionCommand().equals("����")) {
			JOptionPane.showMessageDialog(null, "��������");
			System.exit(0);
		}
			
		
	}
}
