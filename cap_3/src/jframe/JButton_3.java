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
		
		Font font1 = 	new Font("HY얕은샘물M", Font.BOLD, 20);
		String[] bn = {"키", "요" ,"히", "메"};
		
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
		JOptionPane.showMessageDialog(null, "이벤트 발생\n클릭한 버튼의 이름은\"" + e.getActionCommand() + "\"입니다");
	}
}