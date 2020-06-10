package jframe;

import javax.swing.JFrame;

public class Jframe_2 {
	public static void main(String[] args) {
		new Jframe_2().Form();
	}

	private void Form() {
		JFrame jf = new JFrame();
		jf.setSize(600, 300);
		jf.setTitle("Test");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}