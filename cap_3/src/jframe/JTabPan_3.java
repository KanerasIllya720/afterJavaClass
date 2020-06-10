package jframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class JTabPan_3 extends JFrame {
	
	public static void main(String[] args) {
		new JTabPan_3().run();
	}
	JTabbedPane tabPan;
	JTable1 table;
	JTextArea jta;
	
	class JTable1 extends JPanel{
		public JTable1() {
			String col[] = "번호, 이름, 나이".split(",");
			Object row[][] = {{"1번","키요히메","수정바람"},
					{"2번","이리야","수정바람"},
					{"3번","멜트릴리스","수정바람"}};
			JTable jta = new JTable(row, col);
			JScrollPane jsp = new JScrollPane(jta);
			add(jsp,BorderLayout.CENTER);
			jsp.setPreferredSize(new Dimension(200, 150));
		}
	}

	private void run() {
		table = new JTable1();
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.TOP);
		con.add(tabPan, BorderLayout.CENTER);
		
		tabPan.addTab("테이블보기", table);
		
		jta = new JTextArea("2탭 내용");
		tabPan.add(new JScrollPane(jta),"설명");
		setVisible(true);
	}
	

}
