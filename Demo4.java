import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo4 extends Application{

	Scene scene1,scene2;
	
	@Override
	public void start(Stage window) throws Exception {
		
		Label label1 = new Label("Welcome to Scene 1");
		Button b1 = new Button("Go to Scene 2");
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1,b1);
		scene1 = new Scene(layout1,300,250);
		b1.setOnAction(e -> { 
			window.setScene(scene2);
			window.setTitle("Scene 2");
		});
		
		Label label2 = new Label("Welcome to scene 2");
		Button b2 = new Button("Go Back to Scene 1");
		HBox layout2 = new HBox(20);
		layout2.getChildren().addAll(label2,b2);
		scene2 = new Scene(layout2,600,500);
		b2.setOnAction(e -> { 
			window.setScene(scene1);
			window.setTitle("Scene 1");
		});
		
		window.setScene(scene1);
		window.setTitle("Scene 1");
		window.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
