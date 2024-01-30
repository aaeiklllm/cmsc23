package calculator.calculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HistoryController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextArea historyScreen;
    private final StringBuilder historyScreenContent = new StringBuilder("");

    public void setHist(ObservableList<String> history){
        for (int i = 0; i < history.size(); i++ ){
            historyScreenContent.append(history.get(i)).append("\n");
        }
        historyScreen.setText(String.valueOf(historyScreenContent));
    }

    public void switchToArithmetic(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ArithmeticCalculator.fxml"));
        Parent root = loader.load();
        ArithmeticController arithmeticControl = loader.getController();
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToTrigonometric(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TrigonometricCalculator.fxml"));
        Parent root = loader.load();
        TrigonometricController trigoControl = loader.getController();
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSurvey(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorSurvey.fxml"));
        Parent root = loader.load();
        SurveyController surveyControl = loader.getController();
        surveyControl.setTable();
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("calculator.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
