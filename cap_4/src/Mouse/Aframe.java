package Mouse;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Aframe extends JFrame implements ActionListener, MouseListener,WindowListener, FocusListener{

	public JPanel np, ep, sp, wp, cp;
	
	public void FormSet(String t) {
		setTitle(t);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.addWindowListener(this);
		add(np = new JPanel(new BorderLayout()), BorderLayout.NORTH);
		add(ep = new JPanel(new BorderLayout()), BorderLayout.EAST);
		add(sp = new JPanel(new BorderLayout()), BorderLayout.SOUTH);
		add(wp = new JPanel(new BorderLayout()), BorderLayout.WEST);
		add(cp = new JPanel(new BorderLayout()), BorderLayout.CENTER);
	}
	
	public void sh() {
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public void sh_p() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	
	public void Size(Component c, int w, int h) {
		c.setPreferredSize(new Dimension(w, h));
	}
	public void wmsg(String t1) {
		JOptionPane.showMessageDialog(null, t1, "¿À·ù", JOptionPane.WARNING_MESSAGE);
	}
	public void imsg(String t1) {
		JOptionPane.showMessageDialog(null, t1, "È®ÀÎ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void sfont(JComponent c, int i) {
		c.setFont(new Font("¸¼Àº °íµñ",Font.BOLD, i));
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
