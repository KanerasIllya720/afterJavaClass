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
			String col[] = "��ȣ, �̸�, ����".split(",");
			Object row[][] = {{"1��","Ű������","�����ٶ�"},
					{"2��","�̸���","�����ٶ�"},
					{"3��","��Ʈ������","�����ٶ�"}};
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
		
		tabPan.addTab("���̺���", table);
		
		jta = new JTextArea("2�� ����");
		tabPan.add(new JScrollPane(jta),"����");
		setVisible(true);
	}
	

}
