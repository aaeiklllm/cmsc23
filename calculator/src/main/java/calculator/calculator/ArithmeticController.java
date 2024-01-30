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

public class ArithmeticController implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;

    ObservableList<String> history = FXCollections.observableArrayList();
    @FXML
    private TextField calcuScreen;
    private String currentNum = "";
    private String firstNum = "";
    private String operator = "";
    private String answerInString = "";
    private String firstNumInString = "";
    private String secondNumInString = "";
    private double answer = 0;

    @FXML
    public void add (ActionEvent e){
        operator = "+";
        firstNum = currentNum;
        currentNum = "";
    }

    public void subtract(ActionEvent e){
        operator = "-";
        firstNum = currentNum;
        currentNum = "";
    }

    public void multiply(ActionEvent e){
        operator = "*";
        firstNum = currentNum;
        currentNum = "";
    }

    public void divide(ActionEvent e){
        operator = "/";
        firstNum = currentNum;
        currentNum = "";
    }

    public void arithmeticEquals(ActionEvent e){
        double firstNumber = Double.parseDouble(firstNum);
        double secondNumber = Double.parseDouble(currentNum);

        switch(operator){
            case "+":
                answer = firstNumber + secondNumber;
                answerInString = String.format(String.valueOf(answer)).replaceAll("\\.0+$", "");
                firstNumInString = String.format(String.valueOf(firstNumber)).replaceAll("\\.0+$", "");
                secondNumInString = String.format(String.valueOf(secondNumber)).replaceAll("\\.0+$", "");
                history.add(firstNumInString + " + " + secondNumInString + " = " + answerInString);
                calcuScreen.setText(answerInString);
                break;

            case "-":
                answer = firstNumber - secondNumber;
                answerInString = String.format(String.valueOf(answer)).replaceAll("\\.0+$", "");
                firstNumInString = String.format(String.valueOf(firstNumber)).replaceAll("\\.0+$", "");
                secondNumInString = String.format(String.valueOf(secondNumber)).replaceAll("\\.0+$", "");
                history.add(firstNumInString + " - " + secondNumInString + " = " + answerInString);
                calcuScreen.setText(answerInString);
                break;
            case "*":
                answer = firstNumber * secondNumber;
                answerInString = String.format(String.valueOf(answer)).replaceAll("\\.0+$", "");
                firstNumInString = String.format(String.valueOf(firstNumber)).replaceAll("\\.0+$", "");
                secondNumInString = String.format(String.valueOf(secondNumber)).replaceAll("\\.0+$", "");
                history.add(firstNumInString + " * " + secondNumInString + " = " + answerInString);
                calcuScreen.setText(answerInString);
                break;
            case "/":
                answer = firstNumber / secondNumber;
                answerInString = String.format(String.valueOf(answer)).replaceAll("\\.0+$", "");
                firstNumInString = String.format(String.valueOf(firstNumber)).replaceAll("\\.0+$", "");
                secondNumInString = String.format(String.valueOf(secondNumber)).replaceAll("\\.0+$", "");
                history.add(firstNumInString + " / " + secondNumInString + " = " + answerInString);
                calcuScreen.setText(answerInString);
                break;
        }
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

    public void switchToHistory(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("History.fxml"));
        Parent root = loader.load();
        HistoryController histControl = loader.getController();
        histControl.setHist(history);
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
        firstNum = "";
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

