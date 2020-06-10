package MultiInput;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Multi_4_1 extends JFrame{

	public static void main(String[] args) {
		new Multi_4_1().run();
	}
	JLabel l1;
	JButton b1;
	JTextField[] jt = new JTextField[6];
	JComponent[] jc = {new JLabel("도서번호"),new JTextField(10),new JButton("검색")};
	
	private void run() {
		setSize(600, 300);
		setTitle("2134");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		String[] str = {"도서번호","제목","저자","출판사","가격","대여여부"};
		String[] bt = {"검색","저장","취소"};
		
		JPanel pn = new JPanel(new FlowLayout());
		pn.setBorder(new EmptyBorder(10, 10, 10, 10));
		pn.add(new JLabel(str[0] + ":"));
		pn.add(new JTextField(12));
		pn.add(b1 = new JButton(bt[0]));
		add(pn, "North");
		
		JPanel pc = new JPanel(new GridLayout(6, 2));
		for (int i = 0; i < str.length; i++) {
			pc.add(new JLabel(str[i]));
			pc.add(new JTextField(12));
		}
		add(pc, "Center");
		
		JPanel ps = new JPanel(new FlowLayout());
		for (int i = 0; i < bt.length; i++) {
			ps.add(b1 = new JButton(bt[i]));
		}
		add(ps, "South");
		
		pack();
		setVisible(true);
	}
	
}


