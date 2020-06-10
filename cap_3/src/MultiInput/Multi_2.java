package MultiInput;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Multi_2 extends JFrame{

	public static void main(String[] args) {
		new Multi_2().run();
	}
	JPanel p1,pan;
	JLabel l1;
	JTextField jt[] = new JTextField[6];

	private void run() {
		setSize(380, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(p1 = new JPanel(new GridLayout(3, 2)));
		
		String ln[] = "도서명,도서번호,대여일자,반납일자,대여자,정가".split(",");
		for (int i = 0; i < ln.length; i++	) {
			p1.add(pan = new JPanel(new FlowLayout()));
			pan.add(l1 = new JLabel(ln[i]));
			pan.add(jt[i]=new JTextField(15));
		}
		setVisible(true);
	}

}
