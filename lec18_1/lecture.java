package lec18_1;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class lecture extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	
		StackPane s = new StackPane();
		Scene sc = new Scene(s, 300, 300);

		Button b = new Button();
		b.setText("Click Me!");
		EventHandler<Event> handler = new EventHandler<Event>()
		{
			@Override
			public void handle(Event event)
			{
				JOptionPane.showMessageDialog(null, "thanks");
			}
		};
		b.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>()
				{
			public void handle(Event event)
			{
				JOptionPane.showMessageDialog(null, "thanks");
			}
				});
		
		
		s.getChildren().add(b);
		primaryStage.setScene(sc);
		primaryStage.show();

		}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
		
		

}
