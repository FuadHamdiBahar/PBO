package restaurant;


import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import restaurant.database.Database;



public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        int WINDOW_WIDTH = 600;
        int WINDOW_HEIGHT = 500;
        Database database = Database.getInstance();
        primaryStage.setTitle("Banana Shack");

        VBox itemListLayout = new VBox();
        Text itemsListHeader = new Text("Add an item:");
        ListView<String> itemList = new ListView<>();
        itemList.getItems().addAll(database.getMenu().getItems());
        itemListLayout.getChildren().add(itemsListHeader);
        itemListLayout.getChildren().add(itemList);


        VBox userControlsLayout = new VBox();
        userControlsLayout.setSpacing(5);
        Text userControlsHeader = new Text("Actions:");
        TextArea shoppingCartDetails = new TextArea(database.printShoppingCartDetails());
        shoppingCartDetails.setEditable(true);
        Button addBtn = new Button("Add Item");
        addBtn.setOnAction(actionEvent -> {
            database.addToShoppingCart(itemList.getSelectionModel().getSelectedItem());
            shoppingCartDetails.setText(database.printShoppingCartDetails());
        });
        addBtn.setPrefWidth(100);
        Button removeBtn = new Button("Remove Item");
        removeBtn.setOnAction(actionEvent -> {
            database.removeItem(itemList.getSelectionModel().getSelectedItem());
            shoppingCartDetails.setText(database.printShoppingCartDetails());
        });
        removeBtn.setPrefWidth(100);
        Button checkoutBtn = new Button("Checkout");
        checkoutBtn.setPrefWidth(100);
        checkoutBtn.setOnAction(actionEvent -> {
            database.checkout();
            shoppingCartDetails.setText(database.printShoppingCartDetails());
        });

        shoppingCartDetails.setPrefWidth(500);
        shoppingCartDetails.setPrefHeight(300);



        userControlsLayout.getChildren().addAll(userControlsHeader, addBtn, removeBtn, checkoutBtn, shoppingCartDetails);




        HBox root = new HBox(itemListLayout, userControlsLayout);
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(10);
        primaryStage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        primaryStage.setMaxWidth(WINDOW_WIDTH);
        primaryStage.setMaxHeight(WINDOW_HEIGHT);
        primaryStage.setMinHeight(WINDOW_HEIGHT);
        primaryStage.setMinWidth(WINDOW_WIDTH);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
