package MultiInput;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multi_1 extends JFrame{

	public static void main(String[] args) {
		new Multi_1().run();
	}
	JButton b1;

	private void run() {
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel p1 = new JPanel(new GridLayout(3, 1));
		
		add(p1);
		JPanel p2 = new JPanel(new FlowLayout());
		b1 = new JButton("키"); p2.add(b1);
		b1 = new JButton("요"); p2.add(b1);
		p1.add(p2);
		
		JPanel p3 = new JPanel(new FlowLayout());
		b1 = new JButton("히"); p3.add(b1);
		p1.add(p3);
		
		JPanel p4 = new JPanel(new FlowLayout());
		b1 = new JButton("메"); p4.add(b1);
		b1 = new JButton("※"); p4.add(b1);
		p1.add(p4);
		
		pack();
		setVisible(true);
	}

}
