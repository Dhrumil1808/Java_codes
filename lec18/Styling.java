package lec18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Styling extends Application {
	public void start(Stage primaryStage) {
		StackPane s = new StackPane();
		Scene sc = new Scene(s, 300, 300);
		sc.getStylesheets().add("style.css"); 
		
		Label l = new Label("Hello");
		l.getStyleClass().add("arthur");
		l.getStyleClass().add("beatrice");		
		
		s.getChildren().add(l);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}
