package jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jlabel_text_2 {

	public static void main(String[] args) {
		new Jlabel_text_2().ui();
	}
	private void ui() {
		JFrame jf = new JFrame();
		jf.setSize(350, 150);
		jf.setTitle("JLabel");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("아이디 : ");
		jl.setBounds(30, 20, 80, 30);
		jf.add(jl);
		
		JTextField jt = new JTextField();
		jt.setBounds(110, 20, 130, 30);
		jt.setHorizontalAlignment(JTextField.LEFT);
		jf.add(jt);
		
		jl = new JLabel("비밀번호 : ");
		jl.setBounds(30, 60, 80, 30);
		jf.add(jl);
		
		jt = new JTextField();
		jt.setBounds(110, 60, 130, 30);
		jf.add(jt);
		
		jf.setVisible(true);
	}
}