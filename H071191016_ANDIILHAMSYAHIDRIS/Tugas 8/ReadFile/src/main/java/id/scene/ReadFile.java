package id.scene;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ReadFile extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button selectFile = new Button("Select First File");
        selectFile.setMaxSize(150, 35);
        TextArea textFile = new TextArea();
        textFile.setPrefHeight(500);

        selectFile.setOnAction(read -> 
        {
            FileChooser chooseFile = new FileChooser();
            chooseFile.getExtensionFilters().add(new FileChooser.ExtensionFilter("txt files", "*.txt"));
            File file = chooseFile.showOpenDialog(stage);

            try {
                textFile.setText(read(file));
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("Tidak Bisa Membaca File");
                alert.setContentText(e.getMessage());
            }
        });

        VBox vBox = new VBox();
        VBox.setMargin(textFile, new Insets(10, 10, 10, 10));
        VBox.setMargin(selectFile, new Insets(10, 0, 0, 0));
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(selectFile, textFile);

        Scene scene = new Scene(vBox, 360, 380);
        stage.setScene(scene);
        stage.show();

    }

    public static String read(File file) throws IOException
    {
        Scanner scan = new Scanner(file);
        String output = "";

        while (scan.hasNextLine())
        {
            output += scan.nextLine() + "\n";
        }
        scan.close();
        return output;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}