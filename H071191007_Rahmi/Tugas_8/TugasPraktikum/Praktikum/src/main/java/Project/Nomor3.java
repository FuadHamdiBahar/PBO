package TugasPraktikum;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;;

public class Nomor3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        root.setAlignment(Pos.TOP_CENTER);

        FileChooser fc = new FileChooser();

        TextArea textArea = new TextArea();
        textArea.setMinHeight(280);

        Button button = new Button("Select First File");

        button.setOnAction(e -> {
            fc.setTitle("Select File");
            fc.setInitialDirectory(new File("D:/"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*txt"));

            File file = fc.showOpenDialog(stage);
            StringBuilder sb = readFile(file);
            textArea.setText(sb.toString());

        });
        root.getChildren().add(button);
        root.getChildren().add(textArea);
        Scene scene = new Scene(root, 300, 340);
        stage.setTitle("Tugas Praktikum 3");
        stage.setScene(scene);
        stage.show();
    }

    private StringBuilder readFile(File file2) {
        StringBuilder sb = new StringBuilder();
        String s = " ";
        try {
            FileReader fileReader = new FileReader(file2);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                sb.append(s).append("\n");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return sb;
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
