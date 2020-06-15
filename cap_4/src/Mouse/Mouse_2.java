package Mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Mouse_2 extends  Aframe{

	public static void main(String[] args) {
		new Mouse_2().form();
	}
	JPanel mp;
	JLabel l1;
	JTextArea jta;
	JButton[] b1 = new JButton[5];
	Color col[] = {Color.RED,Color.BLUE,Color.GREEN,Color.MAGENTA,Color.YELLOW};
	
	private void form() {
		FormSet("asdf");
		setSize(400, 200);
		add(mp = new JPanel(new BorderLayout()));
		mp.add(jta = new JTextArea());
		mp.add(sp = new JPanel(new GridLayout(1,5)),BorderLayout.SOUTH);
		for (int i = 0; i < b1.length; i++) {
			sp.add(b1[i] = new JButton());
			b1[i].setBackground(col[i]);
			Size(b1[i], 0, 20);
			b1[i].addMouseListener(this);
		}
		sh();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		for (int i = 0; i < b1.length; i++) {
			if(e.getSource().equals(b1[i])) {
				jta.setBackground(col[i]);
			}
		}
	}

}
