package calculator.calculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrigonometricController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    ObservableList<String> history = FXCollections.observableArrayList();

    @FXML
    private TextField calcuScreen;
    private String currentNum = "";

    private String operator = "";
    private String currentNumInString = "";

    private double answer = 0;

    @FXML
    public void sin(ActionEvent e) {
        operator = "sin";
        calcuScreen.setText("sin(" + currentNum + ")");
    }

    @FXML
    public void cos(ActionEvent e) {
        operator = "cos";
        calcuScreen.setText("cos(" + currentNum + ")");
    }

    @FXML
    public void tan(ActionEvent e) {
        operator = "tan";
        calcuScreen.setText("tan(" + currentNum + ")");
    }

    @FXML
    public void sec(ActionEvent e) {
        operator = "sec";
        calcuScreen.setText("sec(" + currentNum + ")");
    }

    @FXML
    public void csc(ActionEvent e) {
        operator = "csc";
        calcuScreen.setText("csc(" + currentNum + ")");
    }

    @FXML
    public void cot(ActionEvent e) {
        operator = "cot";
        calcuScreen.setText("cot(" + currentNum + ")");
    }

    public void trigonometricEquals(ActionEvent e){
        double currentNumber = Double.parseDouble(currentNum);

        switch(operator){
            case "sin":
                answer = Math.sin(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("sin(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;

            case "cos":
                answer = Math.cos(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("cos(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;

            case "tan":
                answer = Math.tan(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("tan(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;

            case "sec":
                answer = 1 / Math.cos(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("sec(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;

            case "csc":
                answer = 1 / Math.sin(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("csc(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;

            case "cot":
                answer = 1 / Math.tan(currentNumber);
                currentNumInString = String.format(String.valueOf(currentNumber)).replaceAll("\\.0+$", "");
                history.add("cot(" + currentNumInString + ") = " + answer);
                calcuScreen.setText(String.valueOf(answer));
                break;
        }
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

    public void switchToHistory(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("History.fxml"));
        Parent root = loader.load();
        HistoryController histControl = loader.getController();
        histControl.setHist(history);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
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

    @FXML
    void num1(ActionEvent e) {
        joinNum("1");
    }

    @FXML
    void num2(ActionEvent e) {
        joinNum("2");
    }

    @FXML
    void num3(ActionEvent e) {
        joinNum("3");
    }

    @FXML
    void num4(ActionEvent e) {
        joinNum("4");
    }

    @FXML
    void num5(ActionEvent e) {
        joinNum("5");
    }

    @FXML
    void num6(ActionEvent e) {
        joinNum("6");
    }

    @FXML
    void num7(ActionEvent e) {
        joinNum("7");
    }

    @FXML
    void num8(ActionEvent e) {
        joinNum("8");
    }

    @FXML
    void num9(ActionEvent e) {
        joinNum("9");
    }

    @FXML
    void num0(ActionEvent e) {
        joinNum("0");
    }

    @FXML
    void dot(ActionEvent e) {
        joinNum(".");
    }

    @FXML
    void clear(ActionEvent e){
        calcuScreen.setText("");
        currentNum = "";
        answer = 0;
    }

    public void joinNum(String num){
        currentNum += num;
        calcuScreen.setText(currentNum);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
