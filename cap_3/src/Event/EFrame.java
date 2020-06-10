package Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class EFrame extends JFrame implements ActionListener {
	
	JToolBar tb1;
	JPanel mainPanel, southPanel;
	public JLabel lab1;
	public JTextArea text1;
	public JButton b1;
	public JButton[] tool;
	
	public void Layout(String title, String... Bname) {
		setSize(400,400);
		setTitle(title);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(tb1 = new JToolBar(), BorderLayout.NORTH);
		String[] fn = {"Home", "New", "Edit", "Remove", "Exit"};
		String[] tip = {"홈으로 이동합니다", "새 문서를 엽니다", "문서를 편집합니다", "문서를 삭제합니다", "종료합니다"};
		tool =new JButton[fn.length];
		for (int i = 0; i < fn.length; i++) {
			ImageIcon icon = new ImageIcon("icon//"+fn[i]+".png");
			tb1.add(tool[i] = new JButton(icon));
			tool[i].setToolTipText(tip[i]);
			tool[i].addActionListener(this);
		}
		add(mainPanel = new JPanel(new BorderLayout(10, 10)));
		mainPanel.setBorder(new EmptyBorder(0, 10, 0, 10));
		mainPanel.add(lab1 = new JLabel(title),BorderLayout.NORTH);
		mainPanel.add(text1 = new JTextArea(), BorderLayout.CENTER);
		mainPanel.add(southPanel = new JPanel(new FlowLayout()),BorderLayout.SOUTH);
		for (int i = 0; i < Bname.length; i++) {
			southPanel.add(b1 = new JButton(Bname[i]));
		}
		setVisible(true);
	}
		
	public void Event(ActionEvent e) {
		if(e.getSource().equals(tool[0])) {
			new MainForm().Form();
			JOptionPane.showMessageDialog(null, "홈으로 이동합니다");
		}else if (e.getSource().equals(tool[1])) {
			new NewForm().Form();
			JOptionPane.showMessageDialog(null, "새 문서를 엽니다");
		}else if (e.getSource().equals(tool[2])) {
			new EditForm().Form();
			JOptionPane.showMessageDialog(null, "문서를 편집합니다");
		}else if (e.getSource().equals(tool[3])) {
			new DeleteForm().Form();
			JOptionPane.showMessageDialog(null, "문서를 삭제합니다");
		}else if (e.getSource().equals(tool[4])) {
			System.exit(0);
		}

	}
}
	
