package MultiInput;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Multi_3 extends JFrame{

	public static void main(String[] args) {
		new Multi_3().run();
	}
	JPanel p1, center, south;
	JLabel l1;
	JButton b1;

	private void run() {
		setSize(600, 300);
		setTitle("2134");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(p1 = new JPanel(new BorderLayout()));
		
		p1.add(l1 = new JLabel("멘탈 관리 프로그램",JLabel.CENTER));
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 48));
		
		p1.add(south = new JPanel(new FlowLayout()),BorderLayout.SOUTH);
		
		String bn[] = "학점 조회,수강 신청, 수강자 조회, 일정 안내, 프로그램 종료".split(",");
		for (int i = 0; i < bn.length; i++) {
			south.add(b1= new JButton(bn[i]));
		}
		setVisible(true);
	}
	
}


