package lec18_1;

import javax.swing.JOptionPane;
import javafx.event.Event;
import javafx.event.EventHandler;

public class MyClickHandler<ActionEvent> implements EventHandler<Event>{
	@Override
	public void handle(Event event) {
		JOptionPane.showMessageDialog(null,  "Thanks!");
	}
}

