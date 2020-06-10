package Action;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Action_4 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		new Action_4().form();
	}
	String[] cbln = "월,화,수,목,금,토,일".split(",");
	JComboBox cb;
	Container con;
	private void form() {
		setTitle("식별");
		setLocationRelativeTo(null);
		con = getContentPane();
		con.add(cb = new JComboBox(cbln));
		cb.addActionListener(this);
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println("요일: "+cb.getSelectedItem());
		System.out.println("아이템: "+(cb.getSelectedIndex()+1));
	}

}
