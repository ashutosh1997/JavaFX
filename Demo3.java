import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo3 extends Application{

	Button b1,b2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Demo3");
		
		b1 = new Button();
		b1.setText("Click");
		
		//Here Lambda expression is used
		b1.setOnAction(EventHandler -> System.out.println("Lambda is used"));
		
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
