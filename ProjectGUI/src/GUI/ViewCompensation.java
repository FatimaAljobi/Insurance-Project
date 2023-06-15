package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewCompensation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ViewCompensation.fxml"));
        primaryStage.setTitle("View Compensation");
        primaryStage.setScene(new Scene(root, 1329, 802));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
