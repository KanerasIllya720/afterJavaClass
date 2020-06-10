package jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jlabel_text_1 {

	public static void main(String[] args) {
		new Jlabel_text_1().ui();
	}
	private void ui() {
		JFrame jf = new JFrame();
		jf.setSize(350, 150);
		jf.setTitle("JLabel");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("¿Ã∏ß: ");
		jl.setBounds(60, 40, 100, 30);
		jf.add(jl);
		
		JTextField jt = new JTextField();
		jt.setBounds(130, 40, 130, 30);
		jt.setHorizontalAlignment(JTextField.LEFT);
		jf.add(jt);
		
		jf.setVisible(true);
	}
}