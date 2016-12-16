package lec19;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXMenu extends Application{

	public void start(Stage stage)
	{
	GridPane gp=new GridPane();
	Scene sc=new Scene(gp,300,300);
	stage.setTitle("Menu Bar");
	MenuBar menubar=seupmenubar(stage);
	gp.getChildren().add(menubar);
	stage.setScene(sc);
	stage.show();
	}
	
	public MenuBar seupmenubar(Stage stage)
	{
		MenuBar menubar=new MenuBar();
		Menu fileMenu = setUpFileMenu(stage);
		Menu helpMenu = setUpHelpMenu(stage);
		menubar.getMenus().add(fileMenu);
		menubar.getMenus().add(helpMenu);
		return menubar;
	}
	public Menu setUpFileMenu(Stage stage)
	{
	Menu FileMenu=new Menu("File");
	MenuItem item=new MenuItem("quit");
	MenuItem openitem=new MenuItem("Open");
	
	openitem.setOnAction(new EventHandler<ActionEvent>()
			{
			public void handle(ActionEvent event)
			{
				FileChooser filechooser=new FileChooser();
				File file=filechooser.showOpenDialog(stage);
				if(file!=null)
				{
					Image i;
					try
					{
						String imagefileuri=file.toURI().toURL().toExternalForm();
						i=new Image(imagefileuri);
						ImageView iv=new ImageView(i);
					
					}
					catch(IOException ex)
					{
						ex.printStackTrace();
					}
				}
			}
			});
	item.setOnAction(e->{
		System.exit(0);
	});
	
	item.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN));
	
	FileMenu.getItems().add(item);
	return FileMenu;
	}
	public Menu setUpHelpMenu(Stage stage)
	{
		Menu HelpMenu=new Menu("Help");
		MenuItem aboutitem=new MenuItem("About");
		aboutitem.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent arg0)
			{
				Popup pop=new Popup();
				VBox v=new VBox();
				v.getStyleClass().add("about");
				Text txt=new Text("Copyright by John Hurley");
				Button b=new Button("Ok");
				v.getChildren().addAll(txt,b);
				b.setOnAction(e->{ pop.hide();});
				pop.getContent().addAll(v);
				pop.show(stage);
				
			}
		});
		
		aboutitem.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN));
		HelpMenu.getItems().add(aboutitem);
		return HelpMenu;
		
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
