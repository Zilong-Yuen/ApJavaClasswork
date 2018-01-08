package Lab43;

import javafx.application.Application;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameCode extends Application{
	int counts = 0;
	public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");

        Button button = new Button("Click me!");
        
        button.setOnAction(value ->  {
        	counts++;
            System.out.println(counts);
         });
        
        long timeStep = System.nanoTime() + 1000000000L;
        new AnimationTimer()
        {

			@Override
			public void handle(long now) {
				if (now > timeStep)
				{
					timeStep = now + 1000000000L;
					
				}
			}
        	
        }.start();
        
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
