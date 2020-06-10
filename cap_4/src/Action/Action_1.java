package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Action_1 extends JFrame implements ActionListener{

	
		public static void main(String[] args) {
			new Action_1();
	
		}
		JButton b1;
		public Action_1() {
			setTitle("¿Ã∫•∆Æ");
			setDefaultCloseOperation(2);
			setLocationRelativeTo(null);
			
			add(b1 = new JButton("Event"));
			b1.addActionListener(this);
			pack();
			setVisible(true);
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
	
	}

