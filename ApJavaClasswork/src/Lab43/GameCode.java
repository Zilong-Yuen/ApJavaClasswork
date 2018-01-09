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
	public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");
        
        Text text1 = new Text();
        Button button = new Button("Click me!");
        
        //long timeStep = System.nanoTime() + 1000000000;
        
        button.setOnAction(value ->  {
        	long timeStep = System.nanoTime() + 1000000000L;
        	counts++;
            System.out.println(counts);
        	
            if (System.nanoTime() > timeStep)
            {
            	System.out.println("It has been 10 seconds and you have clicked " + counts + " times");
            }
         });
        
        
        PrintWriter pw = null;
        try 
        {
        	pw = new PrintWriter(new File("results.csv"));
        }
        catch(FileNotFoundException e)
        {
        	System.err.println(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Name, High Score\n");
        sb.append("Tim,counts\n");
        
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();		
    }
	
    public static void main(String[] args) {
        Application.launch(args);
    }

}
