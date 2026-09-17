package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import util.Util;

public class Exercicio5Controller {

    @FXML
    private Button btAdd;

    @FXML
    private Button btLimpar;

    @FXML
    private Label lblQuant;

    @FXML
    private ListView<String> lvList;

    @FXML
    private TextField tfItem;

    @FXML
    void btAddClick(ActionEvent event) {
        String item = tfItem.getText();
        if(item.length() > 3 && item.contains(" ")){
           lvList.getItems().add(item);
           lblQuant.setText(""+lvList.getItems().size());
           
        } else{
            Util.mensagemErro("O item deve conter mais de 3 letras e mínimo de 1 espaço!!");
        }

    }

    @FXML
    void btLimparClick(ActionEvent event) {
        lvList.getItems().clear();

    }

}
