package Parent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AFrame extends JFrame {
	JPanel mainPanel, centerPanel, southPanel;
	JLabel lab1;
	public JTextField[] text1;
	public JButton b1;
	
	public void Layout(String title, String type, String... lname) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(mainPanel = new JPanel(new BorderLayout()));
		mainPanel.add(lab1 = new JLabel(title, JLabel.CENTER),BorderLayout.NORTH);
		lab1.setOpaque(true);
		lab1.setBackground(Color.BLACK);
		lab1.setForeground(Color.WHITE);
		
		mainPanel.add(centerPanel = new JPanel(new GridLayout(0, 2)),BorderLayout.CENTER);
		centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		text1 = new JTextField[lname.length];
		for (int i = 0; i < lname.length; i++) {
			centerPanel.add(lab1 = new JLabel(lname[i]));
			centerPanel.add(text1[i] = new JTextField());
		}
		
		mainPanel.add(southPanel = new JPanel(new FlowLayout()),BorderLayout.SOUTH);
		String[] bn = {type, "Ãë¼Ò"};
		for (int i = 0; i < bn.length; i++) {
			southPanel.add(b1 = new JButton(bn[i]));
		}
		pack();
		setVisible(true);
	}
	
}
