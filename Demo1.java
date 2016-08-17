import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo1 extends Application implements EventHandler<ActionEvent> {

	Button b1;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Demo1");
		
		b1 = new Button();
		b1.setText("Click");
		b1.setOnAction(this);
			
		
		StackPane layout = new StackPane();
		layout.getChildren().add(b1);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource()==b1) {
			System.out.println("Button 1 is clicked");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
