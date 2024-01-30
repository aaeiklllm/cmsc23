package calculator.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorSurvey.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

        SurveyController surveyController = loader.getController();
        surveyController.setTable();
    }

    public static void main(String[] args) {
        launch(args);
    }
}