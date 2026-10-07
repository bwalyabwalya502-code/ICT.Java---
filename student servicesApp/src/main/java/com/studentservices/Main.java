package com.studentservices;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label title = new Label("Student Services");
        Label nameLabel = new Label("Student Name");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter student name");
        Label studentIdLabel = new Label("Student ID");
        TextField studentIdField = new TextField();
        studentIdField.setPromptText("Enter student ID");
        Button registerButton = new Button("Register Student");
        Label message = new Label();
        registerButton.setOnAction(event -> {
            String name = nameField.getText();
            String studentId = studentIdField.getText();
            if (name.isBlank() || studentId.isBlank()) {
                message.setText("Please enter all student details.");
            } else {
                message.setText(
                        "Student registered: "
                                + name
                                + " ("
                                + studentId
                                + ")"
                );
            }
        });
        VBox root = new VBox(
                10,
                title,
                nameLabel,
                nameField,
                studentIdLabel,
                studentIdField,
                registerButton,
                message
        );
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 600, 450);
        stage.setTitle("Student Services");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}