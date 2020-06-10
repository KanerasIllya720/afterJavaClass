package Event;

import java.awt.event.ActionEvent;

public class NewForm extends EFrame{
	public void Form() {
		Layout("새 문서", "저장", "취소");
	}
	public void actionPerformed(ActionEvent e) {
		Event(e);	
	}
}
