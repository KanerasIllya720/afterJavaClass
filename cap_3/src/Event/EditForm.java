package Event;

import java.awt.event.ActionEvent;

public class EditForm extends EFrame{
	public void Form() {
		Layout("편집", "저장", "취소");
	}
	public void actionPerformed(ActionEvent e) {
		Event(e);	
	}
}
