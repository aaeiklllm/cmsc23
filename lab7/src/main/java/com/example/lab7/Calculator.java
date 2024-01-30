package com.example.lab7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.io.IOException;

public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        Scene scene = new Scene(root, 420, 420, Color.CORNFLOWERBLUE);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}