import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Server App");
        primaryStage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("ServerUiForm.fxml"))));
        primaryStage.show();
    }
}
