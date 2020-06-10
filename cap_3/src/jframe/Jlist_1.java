package jframe;

import javax.swing.JFrame;
import javax.swing.JList;

public class Jlist_1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(60, 180);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		jf.setTitle("리스트");
		
		String[] list = "배,딸기,사과,참외,키위".split(",");
		
		JList jl = new JList(list);
		jl.setSize(50, 100);
		jl.setLocation(20, 20);
		jf.add(jl);
		
		jf.setVisible(true);
	}

}
