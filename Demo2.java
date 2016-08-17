import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo2 extends Application{

	Button b1;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Demo2");
		
		b1 = new Button();
		b1.setText("Click");
		
		//Here anonymous inner class is used
		b1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Button 1 is clicked");
			};
		} );
			
		
		StackPane layout = new StackPane();
		layout.getChildren().add(b1);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
