package Mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;


public class Mouse_5 extends  Aframe{

	public static void main(String[] args) {
		new Mouse_5().form();
	}
	JPanel mp;
	
	private void form() {
		FormSet("±¤Å¬");
		setSize(400, 200);
		add(mp = new JPanel());
		mp.addMouseListener(this);
		sh();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2) {
			int r = (int) (Math.random()*256);
			int g = (int) (Math.random()*256);
			int b = (int) (Math.random()*256);
			mp.setBackground(new Color(r, g, b));
		}
		
	}

}	