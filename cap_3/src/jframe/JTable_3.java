package jframe;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.java.swing.plaf.windows.resources.windows;

import jdk.nashorn.internal.scripts.JS;

public class JTable_3 {

	public static void main(String[] args) {
		JFrame Window = new JFrame();
		Window.setSize(300,300);
		Window.setTitle("JTable");
		Window.setDefaultCloseOperation(2);
		Window.setLocationRelativeTo(null);
		Window.setLayout(null);
		
		String tabIn[] = {"번호","이름","성별"};
		Object data[][] = {{"1번","키요히메","수정바람"},
				{"2번","이리야","수정바람"},
				{"3번","멜트릴리스","수정바람"}};
		JTable jta  = new JTable(data,tabIn);
		JScrollPane Jsp = new JScrollPane(jta);
		Jsp.setSize(285,285);
		Window.add(Jsp);
		
		Window.setVisible(true);
	}
}
