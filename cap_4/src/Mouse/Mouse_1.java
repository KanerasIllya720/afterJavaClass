package Mouse;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Mouse_1 extends  Aframe{

	public static void main(String[] args) {
		new Mouse_1().form();
	}
	JPanel mp;
	JLabel l1;
	JTextField[] t1 = new JTextField[4];
	DefaultTableModel tmodel;
	JTable ta;
	JScrollPane jsp;
	
	private void form() {
		FormSet("�κ���� ���۷��̼�");
		setSize(380, 300);
		add(mp = new JPanel(new BorderLayout()));	
		mp.add(cp = new JPanel(new FlowLayout()));
		
		String[] col = "��      ��,Ŭ����Ʈ ī����,��       ȣ,��                      ��".split(",");
		String[][] row = {
				{"�˿� ����", "2","0-03-89","ALEPH"},
				{"����� ���ɽ�Ʈ��","2","T-01-31","ALEPH"},
				{"���","3","T-03-46","ALEPH"},
				{"�ƹ��͵� ����","1","0-06-20","ALEPH"},
				{"���� ��ü���� ��","2","T-01-75","ALEPH"},
				{"������","0","0-02-63","ALEPH"},
				{"Ǫ�� ��", "2","0-03-93","ALEPH"},
				{"���� ����","3","D-01-106","ALEPH"},
				{"��Ƴ����� ��� ","3","D-03-109","ALEPH"}};	
		
		for (int i = 0; i < col.length; i++) {
			cp.add(l1 = new JLabel(col[i],l1.CENTER));
			cp.add(t1[i] = new JTextField(10));
			t1[i].setHorizontalAlignment(0);
		}
		mp.add(sp = new JPanel(new FlowLayout()),BorderLayout.SOUTH);
		tmodel = new DefaultTableModel(row, col);
		ta = new JTable(tmodel);
		
		sp.add(jsp = new JScrollPane(ta));
		Size(jsp, 350, 170);
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(0);
		
		for (int i = 0; i < row.length	/4; i++) {
			tmodel.addRow(row[i]);
			ta.getColumnModel().getColumn(i).setCellRenderer(dtcr);
		}
		ta.addMouseListener(this);
		sh();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = ta.rowAtPoint(e.getPoint());
		for (int i = 0; i < tmodel.getColumnCount(); i++) {
			t1[i].setText((String)ta.getValueAt(row, i));
		}
	}

}
