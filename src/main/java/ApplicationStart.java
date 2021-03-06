
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class ApplicationStart extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/Login.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(new Image(ApplicationStart.class.getResourceAsStream("icon.jpg")));

        stage.setTitle("Вход");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}