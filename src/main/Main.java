package main;
import helper.JDBC;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Main class.
 * @author Alister Cedeno
 * Software II - C195
 */
public class Main extends Application {

    /**
     * The JavaFX start method.
     * @param stage the primary stage
     * @throws Exception exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"));
        stage.setTitle("Scheduling Application");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args){
        JDBC.openConnection();

        launch(args);
    }

}
