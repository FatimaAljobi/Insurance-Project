package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewCustomer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ViewCustomer.fxml"));
        primaryStage.setTitle("View Customer");
        primaryStage.setScene(new Scene(root, 1329, 802));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
