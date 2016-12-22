import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.ImageCursor;
/**
 * Represents a class Turretdefense game runner.
 *
 * @author Ik Tae Kim
 * @version 1.0
 */
public class Turretdefense extends Application {
    @Override public void start(Stage stage) {

        //**Background Map
        Image img = new Image("MapCropped.png");
        ImageView imgView = new ImageView(img);

        //**Add map
        StackPane sp = new StackPane();
        sp.getChildren().addAll(imgView);

        //**Create the scene
        Scene scene = new Scene(sp);
        stage.setScene(scene);

        //**Launcher
        Image launcher = new Image("launcher.png");
        ImageView launc = new ImageView(launcher);
        launc.setOnMouseClicked((MouseEvent event) -> {
                launc.setImage(launcher);
            });
        sp.getChildren().addAll(launc);

        //**Cursor
        Image curs = new Image("grass.png");
        scene.setCursor(new ImageCursor(launcher));

        stage.setTitle("Turret Defense");
        stage.show();
    }
}
