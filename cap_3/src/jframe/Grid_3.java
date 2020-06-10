package jframe;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Grid_3 extends JFrame{

	public static void main(String[] args) {
		new Grid_3();
	}
	JPanel p1;
	JLabel l1;
	JTextField t1;
	
	public Grid_3() {
		setTitle("±¸¿Í¾Ç");
		setSize(300, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(p1 = new JPanel(new GridLayout(4, 2, 5, 5)));
		p1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		Font font = new Font("±Ã¼­Ã¼",Font.BOLD + Font.ITALIC, 20);
		String[] nick = "Å°,¿ä,È÷,¸Þ".split(",");
		
		for (int i = 0; i < nick.length; i++) {
			p1.add(l1 = new JLabel(nick[i]));
			l1.setFont(font);
			p1.add(t1 = new JTextField());
		}
		setVisible(true);
	}

}
