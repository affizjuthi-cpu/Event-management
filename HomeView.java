/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeView extends VBox {

    public HomeView(Stage stage) {

        Label title = new Label("Welcome To The Website. ");

        TextField input = new TextField();
        input.setPromptText("Enter your name");

        Button btn = new Button("Click Here");

        btn.setOnAction((var e) -> {
            DashboardView dashboard = new DashboardView(stage);
            Scene scene = new Scene(dashboard, 640, 480);
            stage.setScene(scene);
        });

        this.getChildren().addAll(title, input, btn);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
    }

}