package lab9.copy;

import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primarystage) throws Exception
	{
		MazeGUIPane mz=new MazeGUIPane();
		//bp.getStyleClass().add("test");
		Scene sc=new Scene(mz,550,550);
		sc.getStylesheets().add("grid.css");
		primarystage.setScene(sc);
		primarystage.show();
		mz.start();
	}
	public void game() throws Exception
	{
		Stage primary=new Stage();
		start(primary);
	}
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
