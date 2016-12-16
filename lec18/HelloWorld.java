package lec18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application{
        
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Text txt = new Text("Hello, World!");
        Button b=new Button("Click me!");
        txt.setX(50);
        txt.setY(50);
      //  b.setLayoutX(100);
       // b.setLayoutY(100);
        StackPane root = new StackPane();
        root.getChildren().add(b);
        root.getChildren().add(txt);
        Scene sc = new Scene(root, 300, 250);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
    	launch(args);
    }
}
