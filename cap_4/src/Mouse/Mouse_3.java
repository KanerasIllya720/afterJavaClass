package Mouse;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Mouse_3 extends  Aframe{

	public static void main(String[] args) {
		new Mouse_3().form();
	}
	JButton[] b1 = new JButton[3];
	JPanel mp;
	String[] blist = {"LeftClick","RightClick","DoubleClick"};
	
	public void form() {
		FormSet("오래된 공학컴퓨터");
		setSize(350, 80);
		add(mp = new JPanel(new FlowLayout()));
		for (int i = 0; i < b1.length; i++) {
			mp.add(b1[i]=new JButton(blist[i]));
			b1[i].addMouseListener(this);
		}
		sh();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(b1[0])) {
			if(e.getButton() == MouseEvent.BUTTON1) {
				JOptionPane.showMessageDialog(null, "좌클릭");
			}
		}else if (e.getSource().equals(b1[1])) {
			if(e.getButton() == MouseEvent.BUTTON3) {
				JOptionPane.showMessageDialog(null, "우클릭");
			}
		}else if (e.getSource().equals(b1[2])) {
			if(e.getClickCount() == 2) {
				JOptionPane.showMessageDialog(null, "더블클릭");
			}
		}
	}
	

}
