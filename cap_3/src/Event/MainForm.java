package Event;

import java.awt.event.ActionEvent;

public class MainForm extends EFrame{

	public static void main(String[] args) {
		new MainForm().Form();
	}
	public void Form() {
		Layout("����", "�ݱ�");
	}
	public void actionPerformed(ActionEvent e) {
		Event(e);	
	}
}
