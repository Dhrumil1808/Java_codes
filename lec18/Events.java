package lec18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Events extends Application {

	public void start(Stage primaryStage) {
		VBox v = new VBox();
		Button b = new Button("Click Me!");
		Label l = new Label("Hello");
		b.setOnMouseClicked(e -> {
			String info = "Source: " + e.getSource() + "\n" + "Event Type: " + e.getEventType() + "\n" + "Button: " +  e.getButton() + "\n";
			l.setText(info);
			}			
		);	
			
		v.getChildren().add(b);
		v.getChildren().add(l);
			
		Scene sc = new Scene(v, 300, 300);
		
		primaryStage.setScene(sc);
		primaryStage.show();
	} 	
 public static void main(String[] args)
 {
	 launch(args);
 }
}
