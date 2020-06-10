package Project;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button/;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Nomor2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane= new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(25);
        gridPane.setVgap(15);

        Label labelTitle1 = new Label("Kelompok");
        GridPane.setHalignment(labelTitle1, HPos.CENTER);
        gridPane.add(labelTitle1, 0, 0, 2, 1);
        Label labelTitle2 = new Label("Data");
        GridPane.setHalignment(labelTitle2, HPos.CENTER);
        gridPane.add(labelTitle2, 2, 0, 2, 1);
        
        RadioButton rb1 = new RadioButton("Kelompok 1");
        RadioButton rb2 = new RadioButton("Kelompok 2");
        RadioButton rb3 = new RadioButton("Kelompok 3");
        RadioButton rb4 = new RadioButton("Kelompok 4");
        GridPane.setHalignment(rb1, HPos.LEFT);
        gridPane.add(rb1, 0, 1);
        GridPane.setHalignment(rb2, HPos.LEFT);
        gridPane.add(rb2, 1, 1);
        GridPane.setHalignment(rb3, HPos.LEFT);
        gridPane.add(rb3, 0, 2);
        GridPane.setHalignment(rb4, HPos.LEFT);
        gridPane.add(rb4, 1, 2);
        
        Label nim = new Label("NIM");
        nim.setPadding(new Insets(0, 0, 0, 50));
        TextField textNim = new TextField();
        GridPane.setHalignment(nim, HPos.LEFT);
        gridPane.add(nim, 2, 1);
        GridPane.setHalignment(textNim, HPos.LEFT);
        gridPane.add(textNim, 3, 1);
        
        Label nama = new Label("Nama");
        nama.setPadding(new Insets(0, 0, 0, 50));
        TextField textNama = new TextField();
        GridPane.setHalignment(nama, HPos.LEFT);
        gridPane.add(nama, 2, 2);
        GridPane.setHalignment(textNama, HPos.LEFT);
        gridPane.add(textNama, 3, 2);
        
        Label jk = new Label("Jenis Kelamin");
        jk.setPadding(new Insets(0, 0, 0, 50));
        RadioButton rb5 = new RadioButton("Laki-Laki");
        RadioButton rb6 = new RadioButton("Perempuan");
        GridPane.setHalignment(jk, HPos.LEFT);
        gridPane.add(jk, 2, 3);
        GridPane.setHalignment(rb5, HPos.LEFT);
        gridPane.add(rb5, 3, 3);
        GridPane.setHalignment(rb6, HPos.LEFT);
        gridPane.add(rb6, 3, 4);
        
        
        
        RadioButton[] arrKelompok = { rb1, rb2, rb3, rb4 };
        ToggleGroup toogleKelompok = new ToggleGroup();
        
        rb1.setToggleGroup(toogleKelompok);
        rb2.setToggleGroup(toogleKelompok);
        rb3.setToggleGroup(toogleKelompok);
        rb4.setToggleGroup(toogleKelompok);
        
        RadioButton[] arrJk = {rb5, rb6};
        ToggleGroup toogleJk = new ToggleGroup();
        
        rb5.setToggleGroup(toogleJk);
        rb6.setToggleGroup(toogleJk);

        Button save = new Button("SAVE");  
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Toggle togglegGroup = toogleKelompok.getSelectedToggle();
                
                int klmpk = 0;
                String nimm = textNim.getText();
                String namaa = textNama.getText();
                for (int i = 0; i < arrKelompok.length; i++) {
                    if (arrKelompok[i] == togglegGroup) {
                        klmpk = i;
                        break;
                    }
                }
                
                Toggle toggleGender = toogleJk.getSelectedToggle();
                String jK = null;
                
                if (toggleGender == arrJk[0]) {
                    jK = "Laki-laki";
                } else if (toggleGender == arrJk[1]) {
                    jK = "Perempuan";
                }
                
                if (togglegGroup == null || jK == null || nimm == null || nimm.length() == 0 || namaa == null
                || namaa.length() == 0) {
                    showWarning("Data Error", "\tData belum lengkap", null);
                    return;
                }
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                StringBuilder builder = new StringBuilder();
                builder.append("Nama\t\t: ");
                builder.append(namaa);
                builder.append("\nNIM\t\t\t: ");
                builder.append(nimm);
                builder.append("\nJenis Kelamin\t: ");
                builder.append(jK);
                builder.append("\nKelompok\t: ");
                builder.append(klmpk + 1);
                alert.setTitle("\nInformasi");
                alert.setHeaderText("Data Kelompok");
                alert.setContentText(builder.toString());
                alert.showAndWait();
            }
        });

        GridPane.setHalignment(save, HPos.RIGHT);
        gridPane.add(save, 3, 5);

        Scene scene = new Scene(gridPane, 600, 250);
        stage.setScene(scene);
        stage.show();
    }
    public static void showWarning(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        if (content != null)
            alert.setContentText(content);

        alert.showAndWait();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}