package lec18;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hello extends Application {
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Text txt = new Text("Hello, World!");
        Button b = new Button("Click me!");
        StackPane root = new StackPane();
       // root.getChildren().add(txt);
        //root.getChildren().add(b);
        txt.setX(100);
        txt.setY(100);
        Scene sc = new Scene(root, 300, 250);
        primaryStage.setScene(sc);
        primaryStage.show();
        
        Group g = new Group();
    	
		Rectangle r = new Rectangle();
		r.setWidth(200);
		r.setHeight(100);
		r.setFill(Color.RED);
		r.setX(50);
		r.setY(50);
		
		Circle c = new Circle();
		c.setRadius(100);
		c.setFill(Color.GREEN);
		c.setCenterX(300);
		c.setCenterY(300);
		
		g.getChildren().add(r);
		g.getChildren().add(c);
		g.getChildren().add(txt);
		g.getChildren().add(b);
		Scene sc1 = new Scene(g, 750, 750);
		primaryStage.setScene(sc1);
		primaryStage.show();

    }
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
