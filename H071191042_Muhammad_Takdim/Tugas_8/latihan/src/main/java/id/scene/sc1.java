package id.scene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class sc1 extends Application {

    Label lbl;
    Scene scene;
    Stage window;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        lbl = new Label("hello world");

        VBox vBox = new VBox();
        vBox.getChildren().add(lbl);
        vBox.setAlignment(Pos.CENTER);

        scene = new Scene(vBox, 250, 250);

        window.setScene(scene);
        window.show();



    }

}