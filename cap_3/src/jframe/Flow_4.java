package jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_4 extends JFrame {
	
	JPanel pan, colorpan;
	
	public static void main(String[] args) {
		new Flow_4();
	}
	public Flow_4() {
		setSize(200, 300);
		setTitle("플로우차트3");
		setLocationRelativeTo(null);
		
		add(pan=new JPanel(new FlowLayout()));
		
		Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA};
		
		for (int i = 0; i < color.length; i++) {
			pan.add(colorpan=new JPanel());
			colorpan.setBackground(color[i]);
			colorpan.setPreferredSize(new Dimension(50 ,50));
		}
		pack();
		setVisible(true);
	}

}
