package data.scene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataPerson extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        // Group Layout
        Label group = new Label("\t\t\tKelompok");
        RadioButton group1 = new RadioButton("Kelompok 1");
        RadioButton group2 = new RadioButton("Kelompok 2");
        RadioButton group3 = new RadioButton("Kelompok 3");
        RadioButton group4 = new RadioButton("Kelompok 4");
        RadioButton[] arrGroup = {group1, group2, group3, group4};

        ToggleGroup groupBtn = new ToggleGroup();
        group1.setToggleGroup(groupBtn);
        group2.setToggleGroup(groupBtn);
        group3.setToggleGroup(groupBtn);
        group4.setToggleGroup(groupBtn);

        FlowPane flowPane1 = new FlowPane();
        flowPane1.getChildren().addAll(group1, group2);
        flowPane1.setHgap(10);
        flowPane1.setStyle("-fx-padding: 20, 0, 0, 0");
        FlowPane flowPane2 = new FlowPane();
        flowPane2.setHgap(10);
        flowPane2.getChildren().addAll(group3, group4);
        flowPane2.setStyle("-fx-padding: 20, 0, 0, 0");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(group, flowPane1, flowPane2);

        // Data Layout
        Label data = new Label("\t\t\tData");
        Label nim = new Label("NIM");
        Label name = new Label("Nama");
        Label maleFemale = new Label("Jenis Kelamin");

        TextField fieldData = new TextField();
        fieldData.setMaxWidth(100);
        fieldData.setMaxHeight(40);
        TextField fieldName = new TextField();
        fieldName.setMaxWidth(100);
        fieldName.setMaxHeight(40);

        RadioButton btnMale = new RadioButton("Laki - laki");
        RadioButton btnFemale = new RadioButton("Perempuan");
        RadioButton[] arrBtnMaleFemale = {btnMale, btnFemale};

        ToggleGroup btnMaleFemale = new ToggleGroup();
        btnMale.setToggleGroup(btnMaleFemale);
        btnFemale.setToggleGroup(btnMaleFemale);
        
        Button save = new Button("SAVE");
        save.setMaxSize(50, 50);
        
        save.setOnAction(sv -> {
            Toggle toggle1 = groupBtn.getSelectedToggle();
            Toggle toggle2 = btnMaleFemale.getSelectedToggle();
            String getNim = fieldData.getText();
            String getName = fieldName.getText();
            int groupIndex = 0;

            if (toggle1 == null)
            {
                showAlert("Tidak ada kelompok yang dipilih");
            }
            else if (toggle1 != null)
            {
                if (getNim.length() == 0)
                {
                    showAlert("Harap mengisi nim anda");
                }
                else if (getNim.length() != 0)
                {
                    if (getName.length() == 0)
                    {
                        showAlert("Harap mengisi nama anda");
                    }
                    else if (getName.length() != 0)
                    {
                        if (toggle2 == null)
                        {
                            showAlert("Harap isi jenis kelamin");
                        }
                    }
                }
            }
            for (int i = 0; i < arrGroup.length; i++)
            {
                if (arrGroup[i] == toggle1)
                {
                    groupIndex += (i + 1);
                }
            }
            String getGender = "";
            if (toggle2 == arrBtnMaleFemale[0])
            {
                getGender += "Laki - laki";
            }
            if (toggle2 == arrBtnMaleFemale[1])
            {
                getGender += "Perempuan";
            }

            Alert alertInformation = new Alert(Alert.AlertType.INFORMATION);
            StringBuilder builder = new StringBuilder();
            builder.append("Nama\t\t\t\t\s: ");
            builder.append(getName);
            builder.append("\nNIM\t\t\t\t\t\s: ");
            builder.append(getNim);
            builder.append("\nJenis Kelamin\t\t\t\s: ");
            builder.append(getGender);
            builder.append("\nKelompok\t\t\t\s: ");
            builder.append(groupIndex);
            alertInformation.setTitle("Informasi");
            alertInformation.setHeaderText("Data");
            alertInformation.setContentText(builder.toString());
            alertInformation.showAndWait();
        });

        GridPane gridPane = new GridPane();
        gridPane.add(nim, 1, 1);
        gridPane.add(fieldData, 2, 1);
        gridPane.add(name, 1, 2);
        gridPane.add(fieldName, 2, 2);
        gridPane.add(maleFemale, 1, 3);
        gridPane.add(btnMale, 2, 3);
        gridPane.add(btnFemale, 2, 4);
        gridPane.add(save, 2, 6);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(data, gridPane);


        FlowPane flowPane3 = new FlowPane();
        flowPane3.setAlignment(Pos.CENTER);
        flowPane3.getChildren().addAll(vBox, vBox2);


        Scene scene = new Scene(flowPane3, 640, 360);
        stage.setScene(scene);
        stage.show();
    }

    public static void showAlert(String text)
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setHeaderText(text);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}