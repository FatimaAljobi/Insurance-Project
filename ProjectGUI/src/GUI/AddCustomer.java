package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddCustomer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("AddCustomer.fxml"));
        primaryStage.setTitle("Add Customer");
        primaryStage.setScene(new Scene(root, 1329, 802));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
