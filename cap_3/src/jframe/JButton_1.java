package jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_1 {
	public static void main(String[] args) {
		new JButton_1().ui();
	}

	private void ui() {
		JFrame jf = new JFrame();
		jf.setSize(200, 160);
		jf.setTitle("Button");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JButton jb = new JButton("Å¬¸¯");
		jb.setBounds(60, 40, 70, 40);
		jf.add(jb);
		jf.setVisible(true);
	}
}