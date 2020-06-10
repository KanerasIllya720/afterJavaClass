package jframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButton_3 implements ActionListener{
	public static void main(String[] args) {
		new JButton_3().ui();
	}

	private void ui() {
		JFrame jf = new JFrame();
		jf.setSize(200, 320);
		jf.setTitle("Button");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		Font font1 = 	new Font("HY��������M", Font.BOLD, 20);
		String[] bn = {"Ű", "��" ,"��", "��"};
		
		for(int i = 0; i<bn.length; i++) {
			JButton jb = new JButton(bn[i]);
			jb.setBounds(20, 30 + 60 * i, 136, 40);
			jb.setFont(font1);
			jb.addActionListener(this);
			jf.add(jb);
		}
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "�̺�Ʈ �߻�\nŬ���� ��ư�� �̸���\"" + e.getActionCommand() + "\"�Դϴ�");
	}
}