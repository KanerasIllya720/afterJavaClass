package Action;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Action_7 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Action_7().run();
	}
	JMenuBar bar;
	JMenu m1;
	JMenuItem item[] = new JMenuItem[4];
	
	String mb1[] = "�� �ܹ�,�ҳ���,������,����".split(",");
	
	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(bar = new JMenuBar(), BorderLayout.NORTH);
		m1 = new JMenu("���");
		
		for (int i = 0; i < mb1.length; i++) {
			if(i==3)m1.addSeparator();
			m1.add(item[i] = new JMenuItem(mb1[i]));
			item[i].addActionListener(this);
		}
		bar.add(m1);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(mb1[0])) {
			JOptionPane.showMessageDialog(null, "�� �ܹ� �� ����ִ°ž�");
		}else if(e.getActionCommand().equals(mb1[1])) {
			JOptionPane.showMessageDialog(null, "�ҳ���");
		}else if(e.getActionCommand().equals(mb1[2])) {
			JOptionPane.showMessageDialog(null, "�׷� ������~~");
		}else if(e.getActionCommand().equals("����")) {
			JOptionPane.showMessageDialog(null, "����ô�ϱ�� �ʵ� ��� �������ݾ�");
			System.exit(0);
		}
		
	}

}
