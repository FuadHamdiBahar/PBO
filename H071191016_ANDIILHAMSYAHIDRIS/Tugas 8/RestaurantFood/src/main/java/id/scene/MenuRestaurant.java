package id.scene;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MenuRestaurant extends Application {

    Scene scene;
    @Override
    public void start(final Stage stage) throws FileNotFoundException {

        // Bar
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.CORNSILK);
        rectangle.setWidth(360);
        rectangle.setHeight(60);

        Label restaurantName = new Label("MENU RESTAURANT");
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle, restaurantName);

        // Bar Food 1
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setFill(Color.web("#d6c38d"));
        rectangle1.setWidth(330);
        rectangle1.setHeight(80);
        
        Image food1 = new Image(new FileInputStream("C:\\Users\\ASUS\\Pictures\\assets\\Kampus Kepo\\satepadang.jpg"));
        ImageView imageView1 = new ImageView(food1);
        imageView1.setFitWidth(120);
        imageView1.setFitHeight(80);
        
        RadioButton btnFood1 = new RadioButton("SATE PADANG");
        btnFood1.setMaxSize(250, 250);

        TextField food1Order = new TextField();
        food1Order.setMaxSize(40, 20);

        FlowPane flowPane1 = new FlowPane();
        flowPane1.getChildren().addAll(imageView1, btnFood1, food1Order);
        flowPane1.setHgap(20);

        StackPane stackPane1 = new StackPane();
        stackPane1.setStyle("-fx-padding: 10, 0, 0, 10;");
        stackPane1.getChildren().addAll(rectangle1, flowPane1);

        // Bar Food 2
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setFill(Color.web("#d6c38d"));
        rectangle2.setWidth(330);
        rectangle2.setHeight(80);

        Image food2 = new Image(new FileInputStream("C:\\Users\\ASUS\\Pictures\\assets\\Kampus Kepo\\sateayam.png"));
        ImageView imageView2 = new ImageView(food2);
        imageView2.setFitWidth(120);
        imageView2.setFitHeight(80);

        RadioButton btnFood2 = new RadioButton("SATE AYAM");
        btnFood1.setMaxSize(250, 250);

        TextField food2Order = new TextField();
        food2Order.setMaxSize(40, 20);

        FlowPane flowPane2 = new FlowPane();
        flowPane2.getChildren().addAll(imageView2,  btnFood2, food2Order);
        flowPane2.setHgap(20);

        StackPane stackPane2 = new StackPane();
        stackPane2.setStyle("-fx-padding: 10, 0, 0, 10;");
        stackPane2.getChildren().addAll(rectangle2, flowPane2);

        // Bar Food 3
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setFill(Color.web("#d6c38d"));
        rectangle3.setWidth(330);
        rectangle3.setHeight(80);

        Image food3 = new Image(new FileInputStream("C:\\Users\\ASUS\\Pictures\\assets\\Kampus Kepo\\rendang.jpg"));
        ImageView imageView3 = new ImageView(food3);
        imageView3.setFitWidth(120);
        imageView3.setFitHeight(80);

        RadioButton btnFood3 = new RadioButton("RENDANG");
        btnFood3.setMaxSize(250, 250);

        TextField food3Order = new TextField();
        food3Order.setMaxSize(40, 20);

        FlowPane flowPane3 = new FlowPane();
        flowPane3.getChildren().addAll(imageView3, btnFood3, food3Order);
        flowPane3.setHgap(20);

        StackPane stackPane3 = new StackPane();
        stackPane3.setStyle("-fx-padding: 10, 0, 0, 10;");
        stackPane3.getChildren().addAll(rectangle3, flowPane3);

        // Bar Food 4
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setFill(Color.web("#d6c38d"));
        rectangle4.setWidth(330);
        rectangle4.setHeight(80);

        Image food4 = new Image(new FileInputStream("C:\\Users\\ASUS\\Pictures\\assets\\Kampus Kepo\\nasigoreng.png"));
        ImageView imageView4 = new ImageView(food4);
        imageView4.setFitWidth(120);
        imageView4.setFitHeight(80);

        RadioButton btnFood4 = new RadioButton("NASI GORENG");
        btnFood4.setMaxSize(250, 250);

        TextField food4Order = new TextField();
        food4Order.setMaxSize(40, 20);

        FlowPane flowPane4 = new FlowPane();
        flowPane4.getChildren().addAll(imageView4, btnFood4, food4Order);
        flowPane4.setHgap(20);

        StackPane stackPane4 = new StackPane();
        stackPane4.setStyle("-fx-padding: 10, 0, 0, 10;");
        stackPane4.getChildren().addAll(rectangle4, flowPane4);

        // Bar Food 5
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setFill(Color.web("#d6c38d"));
        rectangle5.setWidth(330);
        rectangle5.setHeight(80);

        Image food5 = new Image(new FileInputStream("C:\\Users\\ASUS\\Pictures\\assets\\Kampus Kepo\\sotopadang.jpg"));
        ImageView imageView5 = new ImageView(food5);
        imageView5.setFitWidth(120);
        imageView5.setFitHeight(80);

        RadioButton btnFood5 = new RadioButton("SOTO PADANG");
        btnFood5.setMaxSize(250, 250);

        TextField food5Order = new TextField();
        food5Order.setMaxSize(40, 20);;

        FlowPane flowPane5 = new FlowPane();
        flowPane5.getChildren().addAll(imageView5, btnFood5, food5Order);
        flowPane5.setHgap(20);

        StackPane stackPane5 = new StackPane();
        stackPane5.setStyle("-fx-padding: 10, 0, 0, 10;");
        stackPane5.getChildren().addAll(rectangle5, flowPane5);

        // Button Buy
        Button btnBuy = new Button("PEMBAYARAN");

        var obj = new Object()
        {
            Label buyFood1, buyFood2, buyFood3, buyFood4, buyFood5, price;
        };

        // Action
        btnBuy.setOnAction ( buy -> {
            Rectangle bar = new Rectangle();
            bar.setFill(Color.CORNSILK);
            bar.setWidth(360);
            bar.setHeight(60);

            Rectangle result = new Rectangle();
            result.setFill(Color.web("#d6c38d"));
            result.setWidth(350);
            result.setHeight(550);

            Label struk = new Label("STRUK PEMBAYARAN");

            int sate = Integer.parseInt(0 + food1Order.getText());
            int hargaSate = sate * 12000;
            if (btnFood1.isSelected())
            {
                obj.buyFood1 = new Label(sate +" Sate Padang = "+ hargaSate );
            }
            else {
                obj.buyFood1 = new Label("");
            }

            int sateAyam = Integer.parseInt(0 + food2Order.getText());
            int hargaSateAyam = sateAyam * 15000;
            if (btnFood2.isSelected())
            {
                obj.buyFood2 = new Label(sateAyam +" Sate Ayam   = "+ hargaSateAyam);
            }
            else {
                obj.buyFood2 = new Label("");
            }

            int rendang = Integer.parseInt(0 + food3Order.getText());
            int hargaRendang = rendang * 50000;
            if (btnFood3.isSelected())
            {
                obj.buyFood3 = new Label(rendang +" Rendang     = "+ hargaRendang);
            }
            else {
                obj.buyFood3 = new Label("");
            }
            
            int nasiGoreng = Integer.parseInt(0 + food4Order.getText());
            int hargaNasiGoreng = nasiGoreng * 10000;
            if (btnFood4.isSelected())
            {
                obj.buyFood4 = new Label(nasiGoreng +" Nasi Goreng = "+ hargaNasiGoreng);
            }
            else {
                obj.buyFood4 = new Label("");
            }
            int sotoPadang = Integer.parseInt(0 + food5Order.getText());
            int hargaSotoPadang = sotoPadang * 15000;
            if (btnFood5.isSelected())
            {
                obj.buyFood5 = new Label(sotoPadang +" Soto Padang = "+ hargaSotoPadang);
            }
            else {
                obj.buyFood5 = new Label("");
            }

            int price = hargaSate + hargaSateAyam + hargaRendang + hargaNasiGoreng + hargaSotoPadang;
            Label style = new Label("----------------------");
            obj.price = new Label("Total Harga  = "+ price);

            Button btnBack = new Button("Back");
            btnBack.setOnAction(back -> {
                stage.setScene(scene);
            });

            StackPane pane = new StackPane();
            pane.getChildren().addAll(bar, struk);

            VBox vBox2 = new VBox();
            vBox2.setAlignment(Pos.TOP_CENTER);
            vBox2.getChildren().addAll(obj.buyFood1, obj.buyFood2, obj.buyFood3, obj.buyFood4, obj.buyFood5, style, obj.price, btnBack);

            StackPane pane2 = new StackPane();
            pane2.getChildren().addAll(result, vBox2);

            VBox vBox = new VBox();
            vBox.getChildren().addAll(pane, pane2);

            Scene scene2 = new Scene(vBox, 360, 640);
            stage.setScene(scene2);
            stage.show();
        });

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.getChildren().addAll(stackPane, stackPane1, stackPane2, stackPane3, stackPane4, stackPane5, btnBuy);

        scene = new Scene(vBox, 360, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(final String[] args) {
        Application.launch(args);
    }
}