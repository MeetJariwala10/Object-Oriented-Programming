import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleSceneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle(50);
        circle.setFill(Color.RED);

        // Create a layout pane and add the circle to it
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle);

        // Create a scene and set it in the stage
        Scene scene = new Scene(stackPane, 200, 200);
        primaryStage.setScene(scene);

        // Set the title of the stage
        primaryStage.setTitle("Circle Scene Example");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}