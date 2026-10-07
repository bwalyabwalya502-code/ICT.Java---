package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    private static final String STUDENT_NAME   = "Bwalya Bwalya";
    private static final String STUDENT_NUMBER = "202509266";

    @Override
    public void start(Stage stage) {
        String welcome = "Welcome, " + STUDENT_NAME + "!";

        Label message = new Label(welcome);
        message.setStyle("-fx-font-size: 18px;");

        Button startBtn = new Button("Start");
        Button resetBtn = new Button("Reset");

        startBtn.setOnAction(e -> message.setText("Great! You clicked the button."));
        resetBtn.setOnAction(e -> message.setText(welcome));

        HBox buttons = new HBox(10, startBtn, resetBtn);
        buttons.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20, message, buttons);
        layout.setAlignment(Pos.CENTER);

        stage.setTitle("My First JavaFX Application - " + STUDENT_NUMBER);
        stage.setScene(new Scene(layout, 500, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}