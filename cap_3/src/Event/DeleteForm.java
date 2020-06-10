package Event;

import java.awt.event.ActionEvent;

public class DeleteForm extends EFrame{
	public void Form() {
		Layout("삭제", "삭제", "취소");
	}
	public void actionPerformed(ActionEvent e) {
		Event(e);	
	}
}
