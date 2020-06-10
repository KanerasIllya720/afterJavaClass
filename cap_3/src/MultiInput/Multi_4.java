package MultiInput;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Multi_4 extends JFrame{

	public static void main(String[] args) {
		new Multi_4().run();
	}
	JPanel p1, center, north, south;
	JLabel l1;
	JButton b1;
	JTextField[] jt = new JTextField[6];
	JComponent[] jc = {new JLabel("도서번호"),new JTextField(10),new JButton("검색")};
	private void run() {
		setSize(600, 300);
		setTitle("2134");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(p1 = new JPanel(new BorderLayout()));
		p1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		p1.add(north = new JPanel(new FlowLayout()),BorderLayout.NORTH);
		for (int i = 0; i < jc.length; i++) {
			north.add(jc[i]);
		}
		p1.add(center = new JPanel(new GridLayout(0, 2)));
		String[] ln = "도서번호,제목,저자,출판사,가격,대여여부".split(",");
		for (int i = 0; i < ln.length; i++) {
			center.add(l1 = new JLabel(ln[i]));
			center.add(jt[i] = new JTextField(12));
		}
		p1.add(south = new JPanel(new FlowLayout()), BorderLayout.SOUTH);
		String bn[] = {"저장", "취소"};
		for (int i = 0; i < bn.length; i++) {
			south.add(b1 = new JButton(bn[i]));
		}
		pack();
		setVisible(true);
	}
	
}


