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

public class Action_5 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		new Action_5().form();
	}
	JCheckBox[] cb = new JCheckBox[4];
	Container con;
	private void form() {
		setTitle("�ĺ�");
		setLocationRelativeTo(null);
		con = getContentPane();
		con.setLayout(new FlowLayout());
		String[] list = "�˿� ����,�ƹ��͵� ����,Ǫ�� ��,������".split(",");
		for (int i = 0; i < list.length; i++) {
			con.add(cb[i] = new JCheckBox(list[i]));
			cb[i].addActionListener(this);
		}
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < cb.length; i++) {
			if(cb[i].isSelected()) {
				JOptionPane.showMessageDialog(null, cb[i].getText()+"�� �����ߴ�");
			}else {
				JOptionPane.showMessageDialog(null, cb[i].getText()+"�� �����ߴ�");
			}
			
		}
	}

}
