package Mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;


public class Mouse_6 extends  Aframe{

	public static void main(String[] args) {
		new Mouse_6().form();
	}
	JPanel mp;
	
	private void form() {
		FormSet("»Ñ½¹ºü½¹");
		setSize(400, 200);
		add(mp = new JPanel());
		mp.addMouseListener(this);
		sh();
	}
	public void randomColor() {
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		mp.setBackground(new Color(r, g, b));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		randomColor();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		randomColor();
	}
	

}
