package Lab43;

import javafx.application.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Timer;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameCode extends Application{
	int counts = 0;
	boolean gameOn = true;
	public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Button Clicker by Tim and Zilong");
        
        Text text1 = new Text();
        Button button = new Button("Click me!");
       
        button.setOnAction(value ->  {
        	counts++;
            button.setText(" " + counts + " ");
        	
            long timeStep = System.nanoTime() + 10000000000L;
            new AnimationTimer()
            {
            	@Override
            	public void handle(long now) {
            		if (now > timeStep)
            		{
            			System.out.println("You clicked " + counts + " times in 10 seconds");
            			System.exit(1);
            		}
            	}
            }.start();
         });
  
        button.setMaxSize(100, 100);
        
        StackPane root = new StackPane();
        root.getChildren().add(button);
        root.getChildren().add(text1);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();		
    }
	
    public static void main(String[] args) {
        Application.launch(args);
    }

}
