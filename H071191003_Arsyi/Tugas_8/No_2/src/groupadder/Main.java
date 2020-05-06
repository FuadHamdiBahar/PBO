package groupadder;

import groupadder.database.Database;
import groupadder.database.Group;
import groupadder.database.Member;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {
    final Database database = Database.getInstance();

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20,20,20,20));

        VBox leftBox = new VBox();
        GridPane leftGrid = new GridPane();
        leftBox.setPadding(new Insets(10,10,10,10));
        leftBox.setStyle("-fx-background-color: white; -fx-border-style: solid");
        root.setLeft(leftBox);
        leftBox.setAlignment(Pos.TOP_CENTER);
        leftBox.getChildren().addAll( new Label("Group"), leftGrid);
        leftGrid.setHgap(10);
        leftGrid.setVgap(10);


        RadioButton group1RB = new RadioButton("Group 1");
        RadioButton group2RB = new RadioButton("Group 2");
        RadioButton group3RB = new RadioButton("Group 3");
        RadioButton group4RB = new RadioButton("Group 4");
        ToggleGroup groupPicker = new ToggleGroup();
        leftGrid.setPadding(new Insets(10,10,10,10));
        group1RB.setToggleGroup(groupPicker);
        group2RB.setToggleGroup(groupPicker);
        group3RB.setToggleGroup(groupPicker);
        group4RB.setToggleGroup(groupPicker);
        leftGrid.add(group1RB,0, 0);
        leftGrid.add(group2RB,1, 0);
        leftGrid.add(group3RB,0, 1);
        leftGrid.add(group4RB,1, 1);
        leftGrid.setAlignment(Pos.TOP_CENTER);

        VBox rightBox = new VBox();
        rightBox.setPadding(new Insets(10,10,10,10));
        rightBox.setStyle("-fx-background-color: white; -fx-border-style: solid");
        rightBox.setAlignment(Pos.TOP_CENTER);
        root.setRight(rightBox);
        GridPane rightGrid = new GridPane();
        rightGrid.setHgap(5);
        rightGrid.setVgap(5);
        rightBox.getChildren().addAll(new Label("Data"),rightGrid);

        Label studentIDLbl = new Label("Student ID");
        TextField studentIDFld = new TextField();
        studentIDFld.setMaxWidth(200);

        Label nameLbl = new Label("Name");
        TextField nameFld = new TextField();

        RadioButton maleRB = new RadioButton("Male ♂");
        RadioButton femaleRB = new RadioButton("Female ♀");
        ToggleGroup genderPicker = new ToggleGroup();
        maleRB.setToggleGroup(genderPicker);
        femaleRB.setToggleGroup(genderPicker);

        nameFld.setMaxWidth(200);
        rightGrid.add(studentIDLbl,0, 0);
        rightGrid.add(studentIDFld,1, 0);
        rightGrid.add(nameLbl,0, 1);
        rightGrid.add(nameFld,1, 1);
        rightGrid.add(new Label("Gender"),0,2);
        rightGrid.add(maleRB,1,2);
        rightGrid.add(femaleRB,1,3);

        leftGrid.setPadding(new Insets(10,10,10,10));

        Button saveBtn = new Button("Save");
        saveBtn.setOnAction(actionEvent -> {
            if (genderPicker.getSelectedToggle() != null && !studentIDFld.getText().isEmpty() && !nameFld.getText().isEmpty() && genderPicker.getSelectedToggle() != null) {
                String name = nameFld.getText();
                String gender = ((RadioButton) genderPicker.getSelectedToggle()).getText();
                String studentId = studentIDFld.getText();
                String group = ((RadioButton) groupPicker.getSelectedToggle()).getText();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, String.format("Name\t\t: %s\nStudent ID\t: %s\nGender\t\t: %s\nGroup\t\t: %s\n\n Are you sure?", name, studentId, gender, group), ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.YES) {
                    database.getGroup(group).addMember(name, studentId, gender);
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Data not complete", ButtonType.CLOSE);
                alert.show();
            }
        });
        Button showGroupsBtn = new Button("View Groups");

        showGroupsBtn.setOnAction(actionEvent -> {
            Stage secondaryStage = new Stage();

            BorderPane secondaryWindowLayout = new BorderPane();
            Button exitWindowBtn = new Button("Close");
            exitWindowBtn.setOnAction(actionEvent1 -> secondaryStage.close());

            TextArea groupsData = new TextArea(getGroupsData());


            secondaryWindowLayout.setCenter(groupsData);
            BorderPane.setAlignment(exitWindowBtn, Pos.CENTER_RIGHT);
            BorderPane.setMargin(exitWindowBtn, new Insets(10));
            secondaryWindowLayout.setBottom(exitWindowBtn);
            secondaryWindowLayout.setPadding(new Insets(10));
            Scene scene = new Scene(secondaryWindowLayout, 270, 260);
            secondaryStage.initModality(Modality.WINDOW_MODAL);
            secondaryStage.initOwner(primaryStage);
            secondaryStage.setTitle("Group Data");
            secondaryStage.setScene(scene);
            secondaryStage.setResizable(false);
            secondaryStage.show();
        });

        HBox bottomRow = new HBox(showGroupsBtn,saveBtn);
        bottomRow.setSpacing(5);
        bottomRow.setPadding(new Insets(5, 10, 5, 0));
        root.setBottom(bottomRow);
        bottomRow.setAlignment(Pos.CENTER_RIGHT);

        primaryStage.setTitle("Group Adder");


        primaryStage.setScene(new Scene(root, 520, 260));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private String getGroupsData() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Group group : database.getGroups()) {
            stringBuilder.append(String.format("========%s========",group.toString().toUpperCase())).append("\n");
            int count = 0;
            if (group.getMembers().size() == 0) {
                stringBuilder.append("No Members Found!").append("\n");
            }
            for (Member member : group.getMembers()) {
                count++;
                stringBuilder.append(count).append(".").append(member.getData());
            }
            stringBuilder.append("=======================").append("\n\n");

        }
        return stringBuilder.toString();
    }
}
