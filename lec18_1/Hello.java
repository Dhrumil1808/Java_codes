package lec18_1;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane s = new StackPane();
		Scene sc = new Scene(s, 300, 300);
		sc.getStylesheets().add("style.css"); 
		
		Label l = new Label("Hello");
		
		boolean am = getAm();
							
		if(am) l.getStyleClass().add("amstyle");
		else l.getStyleClass().add("pmstyle");		
		
		s.getChildren().add(l);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	private boolean getAm(){
		LocalDateTime d = LocalDateTime.now();
		if(d.getHour() < 12) return true;
		else return false;		
	} 
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
