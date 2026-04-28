/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardView extends VBox {

    public DashboardView(Stage stage) {

        Label label = new Label("Welcome to Dashboard");

        Button backBtn = new Button("Back to Home");

        backBtn.setOnAction(e -> {
            HomeView home = new HomeView(stage);
            stage.getScene().setRoot(home);
        });

        this.getChildren().addAll(label, backBtn);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
    }
}