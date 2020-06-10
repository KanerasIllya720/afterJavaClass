package jframe;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.java.swing.plaf.windows.resources.windows;

import jdk.nashorn.internal.scripts.JS;

public class JTable_2 {

	public static void main(String[] args) {
		JFrame Window = new JFrame();
		Window.setSize(300,300);
		Window.setTitle("JTable");
		Window.setDefaultCloseOperation(2);
		Window.setLocationRelativeTo(null);
		Window.setLayout(null);
		
		String tabIn[] = {"번호","이름","성별"};
		String data[] = {"?번","키요히메","?"};
		DefaultTableModel tmodel = new DefaultTableModel(null, tabIn);
		
		JTable jta  = new JTable(tmodel);
		JScrollPane Jsp = new JScrollPane(jta);
		Jsp.setSize(285,285);
		Window.add(Jsp);
		tmodel.addRow(data);
		
		Window.setVisible(true);
	}

}
