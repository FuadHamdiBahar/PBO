package Project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;

public class Nomor1 extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        int spacing = 30; 
        Text firstText = new Text();
        String name = "Welcome to MyResto";
        firstText.setFont(new Font("Beastic", 25));
        firstText.setText(name);

        Button button = new Button("Click to Order!");

        VBox vBox = new VBox(spacing);
        vBox.getChildren().addAll(firstText, button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 600, 300);
        stage.setTitle("Restaurant");

        button.setOnAction(e -> {
            GridPane root = new GridPane();
            root.setHgap(10);
            root.setVgap(10);

            Text secondText = new Text();
            String nameResto = "MyResto";

            Label label1 = new Label();
            label1.setText("Fried Chicken");
            Label harga1 = new Label();
            harga1.setText("Rp. 15000");
            TextField tf1 = new TextField();
            tf1.setPromptText("Jumlah");
            tf1.setMaxWidth(60);
            root.add(label1, 1, 2);
            root.add(tf1, 3, 2);

            Label label2 = new Label();
            label2.setText("Burger");
            Label harga2 = new Label();
            harga2.setText("Rp. 25000");
            TextField tf2 = new TextField();
            tf2.setPromptText("Jumlah");
            tf2.setMaxWidth(60);
            root.add(label2, 1, 3);
            root.add(tf2, 3, 3);

            Label label3 = new Label();
            label3.setText("Pizza");
            Label harga3 = new Label();
            harga1.setText("Rp. 50000");
            TextField tf3 = new TextField();
            tf1.setPromptText("Jumlah");
            tf1.setMaxWidth(60);
            root.add(label3, 1, 4);
            root.add(tf3, 3, 4);

            Label label4 = new Label();
            label4.setText("Ice Cream");
            Label harga4 = new Label();
            harga4.setText("Rp. 7000");
            TextField tf4 = new TextField();
            tf4.setPromptText("Jumlah");
            tf4.setMaxWidth(60);
            root.add(label4, 1, 5);
            root.add(tf4, 3, 5);

            Label label5 = new Label();
            label5.setText("Cola");
            Label harga5 = new Label();
            harga5.setText("Rp. 10000");
            TextField tf5 = new TextField();
            tf5.setPromptText("Jumlah");
            tf5.setMaxWidth(60);
            root.add(label5, 1, 6);
            root.add(tf5, 3, 6);

            Button submit = new Button ("Submit");
            GridPane.setHalignment(submit, HPos.RIGHT);
            root.add(submit, 3, 7);
            Label total = new Label();
            submit.setOnAction(p ->{
                int friedChicken = Integer.parseInt(0 + tf1.getText());
                int burger = Integer.parseInt(0 + tf2.getText());
                int pizza = Integer.parseInt(0 + tf3.getText());
                int iceCream = Integer.parseInt(0 + tf4.getText());
                int cola = Integer.parseInt(0 + tf5.getText());
                int jumlah = ((friedChicken * 15000) + (burger * 25000) + (pizza * 50000) + (iceCream * 7000) + (cola * 10000));

                total.setText("Total : " + jumlah);
                root.add(total, 1, 8);
            });
            Button back = new Button ("Back");
            GridPane.setHalignment(back, HPos.RIGHT);
            root.add(back, 3, 8);
            back.setOnAction(b -> {
                root.getChildren().removeAll();
                stage.setScene(scene);
                stage.show();
            });
            Scene scene1 = new Scene(root, 400,300);
            stage.setScene(scene1);
            stage.show();
        });
        stage.setScene(scene);
        stage.show();   
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}