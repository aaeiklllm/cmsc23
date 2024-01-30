package calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Arrays;
import calculator.calculator.Ratings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SurveyController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    AnchorPane tablePane;
    @FXML
    TextField nameField;
    @FXML
    TextField arithmeticRatingField;
    @FXML
    TextField trigonometricRatingField;

    private ObservableList<Ratings> tableData;
    private TableView<Ratings> table;

    public void setTable(){

        tableData = FXCollections.observableArrayList();
        table = new TableView<Ratings>();

        tableData.add(new Ratings("Mika", 5, 5));

        TableColumn <Ratings, String> nameColumn = new TableColumn<Ratings, String>("Name");
        TableColumn <Ratings, Integer> arithmeticRatingColumn = new TableColumn<Ratings, Integer>("Arithmetic Rating");
        TableColumn <Ratings, Integer> trigonometricRatingColumn = new TableColumn<Ratings, Integer>("Trigonometric Rating");

        nameColumn.prefWidthProperty().bind(table.widthProperty().multiply(0.33));
        arithmeticRatingColumn.prefWidthProperty().bind(table.widthProperty().multiply(0.33));
        trigonometricRatingColumn.prefWidthProperty().bind(table.widthProperty().multiply(0.33));

        nameColumn.setCellValueFactory(new PropertyValueFactory<Ratings, String>("name"));
        arithmeticRatingColumn.setCellValueFactory(new PropertyValueFactory<Ratings, Integer>("arithmeticRating"));
        trigonometricRatingColumn.setCellValueFactory(new PropertyValueFactory<Ratings, Integer>("trigonometricRating"));

        table.getColumns().addAll(Arrays.asList(nameColumn, arithmeticRatingColumn, trigonometricRatingColumn));
        table.setItems(tableData);

        AnchorPane.setTopAnchor(table, 0.0);
        AnchorPane.setRightAnchor(table, 0.0);
        AnchorPane.setBottomAnchor(table, 0.0);
        AnchorPane.setLeftAnchor(table, 0.0);

        tablePane.getChildren().addAll(table);
    }

    @FXML
    public void changeData() {
        tableData.get(0).setName(nameField.getText());
        tableData.get(0).setArithmeticRating(Integer.parseInt(arithmeticRatingField.getText()));
        tableData.get(0).setTrigonometricRating(Integer.parseInt(trigonometricRatingField.getText()));
        table.refresh();
    }

    @FXML
    public void addData() {
        Ratings rating = new Ratings(nameField.getText(), Integer.parseInt(arithmeticRatingField.getText()), Integer.parseInt(trigonometricRatingField.getText()));
        tableData.add(rating);
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
}
