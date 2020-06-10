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
	
	String mb1[] = "야 꿀벌,소난다,넣을게,종료".split(",");
	
	private void run() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(bar = new JMenuBar(), BorderLayout.NORTH);
		m1 = new JMenu("기능");
		
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
			JOptionPane.showMessageDialog(null, "야 꿀벌 왜 울고있는거야");
		}else if(e.getActionCommand().equals(mb1[1])) {
			JOptionPane.showMessageDialog(null, "소난다");
		}else if(e.getActionCommand().equals(mb1[2])) {
			JOptionPane.showMessageDialog(null, "그럼 넣을게~~");
		}else if(e.getActionCommand().equals("종료")) {
			JOptionPane.showMessageDialog(null, "싫은척하기는 너도 사실 좋은거잖아");
			System.exit(0);
		}
		
	}

}
