package lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primarystage) throws Exception
	{
		MazeGUIPane mz=new MazeGUIPane();
		//bp.getStyleClass().add("test");
		Scene sc=new Scene(mz,625,625);
		sc.getStylesheets().add("lab9/grid.css");
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
